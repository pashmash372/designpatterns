package com.scaler.lld.singleton;

public class ConnectionPool {

    // Step 3 - Instance variable
    private static ConnectionPool instance;

    // Step 1 - Hide the ctor
    private ConnectionPool() {
    };

    // Step 2 - Global access point
    public static ConnectionPool getInstance() {

        // Step 4 - if present return , else create , set and return
        if (instance == null) {
            synchronized (ConnectionPool.class) {
                if (instance == null) {
                    instance = new ConnectionPool();
                }
            }
        }

        return instance;
    }
}

// Double check locking