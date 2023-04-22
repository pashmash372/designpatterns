package com.scaler.lld.pakshi4;

import java.util.List;

import org.junit.Test;

import com.scaler.lld.pakshi4.interfaces.Flyable;
import com.scaler.lld.pakshi4.strategies.GlidingBehaviour;

public class BirdTest {

    @Test
    public void testReleaseBird() {
        List<Flyable> birds = List.of(
            new Sparrow(null, null, null, null, new GlidingBehaviour()),
             new Parrot(null, null, null, null));

        releaseAll(birds);
    }

    public void releaseAll(List<Flyable> birds) {
        birds.forEach(Flyable::fly);
    }

}
