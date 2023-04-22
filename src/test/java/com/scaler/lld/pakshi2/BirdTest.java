package com.scaler.lld.pakshi2;

import java.util.List;

import org.junit.Test;

import com.scaler.lld.pakshi2.abstractclass.FlyableBird;

public class BirdTest {
    @Test
    public void testReleaseBird() {
        List<FlyableBird> birds = List.of(new Sparrow(null, null, null, null), new Parrot(null, null, null, null));

        releaseAll(birds);
    }

    public void releaseAll(List<FlyableBird> birds) {
        birds.forEach(FlyableBird::fly);
    }
}
