package com.scaler.lld.pakshi3;

import java.util.List;

import org.junit.Test;

import com.scaler.lld.pakshi3.interfaces.Flyable;

public class BirdTest {

    @Test
    public void testReleaseBird() {
        List<Flyable> birds = List.of(new Sparrow(null, null, null, null), new Parrot(null, null, null, null));

        releaseAll(birds);
    }

    public void releaseAll(List<Flyable> birds) {
        birds.forEach(Flyable::fly);
    }
}
