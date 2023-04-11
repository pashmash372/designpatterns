package com.scaler.lld.observer;

import org.junit.Before;
import org.junit.Test;

import com.scaler.lld.observer.models.Bitcoin;

public class BitcoinTrackerTest {
    BitcoinTracker bitcoinTracker;
    @Before
    public void setUp() {
        bitcoinTracker = new BitcoinTracker(Bitcoin.builder().value(16000.0).build());
        bitcoinTracker.subscribe(new EmailService());
        bitcoinTracker.subscribe(new TweetService());
    }
    @Test
    public void testPriceChangeEmail() {
        bitcoinTracker.setPrice(17000.0);        
    }

    @Test
    public void testPriceChangeTweet() {
        bitcoinTracker.setPrice(17000.0);
    }

}
