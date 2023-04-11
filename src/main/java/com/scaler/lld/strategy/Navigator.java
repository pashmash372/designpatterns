package com.scaler.lld.strategy;

import com.scaler.lld.strategy.interfaces.NavigationStrategy;

import lombok.AllArgsConstructor;

// Step 3 - Create context class
// 1. Maintain a reference of strategy - Compostion
// 2. Delegate method call to strategy

@AllArgsConstructor
public class Navigator {

    private NavigationStrategy strategy;

    public void navigate(String from, String to) {
        strategy.navigate(from, to);
    }

}
