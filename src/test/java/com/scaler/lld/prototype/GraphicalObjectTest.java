package com.scaler.lld.prototype;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GraphicalObjectTest {

    private static BackgroundRegistry registry;

    // setup and teardown method
    @Before
    public void setUp() {
        registry = new BackgroundRegistry();
        BackgroundObject treeProto = new BackgroundObject(0, 0, 0, 0, null);
        registry.store(BackgroundObjectType.TREE, treeProto);
    }

    @After
    public void tearDown() {
        registry = null;
    }

    @Test
    public void testCloneObject() {
        // Step 3 - Create the prototype
        BackgroundObject prototype = new BackgroundObject(0, 0, 0, 0, BackgroundObjectType.TREE);

        // Step 4 - clone the prototype to create a forest
        BackgroundObject clone = prototype.clone();

        List<BackgroundObject> forest = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            BackgroundObject treeClone = prototype.clone();
            treeClone.setX(new Random().nextInt());
            treeClone.setY(new Random().nextInt());
            forest.add(treeClone);
        }

        assertNotNull("if clone method is called,clone should not be null", clone);
        clone.setX(1);
        clone.setY(1);
        assertNotEquals("if prototype is clone and prototype should not be the same", prototype, clone);

    }

    @Test
    public void testPrototypeWithRegistry() {

        // Create tree prototype
        BackgroundObject prototype = registry.get(BackgroundObjectType.TREE);
        assertNotNull("if prototype was created,object should not be null", prototype);
     
        BackgroundObject clone= prototype.clone();
        clone.setX(new Random().nextInt());
        clone.setY(new Random().nextInt());

        assertNotEquals("if prototype is cloned, clone and prototype x values should not be same ",prototype.getX(), clone.getX());
        assertNotEquals("if prototype is cloned, clone and prototype y values should not be same ",prototype.getY(), clone.getY());
    }
}
