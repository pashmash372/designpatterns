package com.scaler.lld.prototype;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
// Step 2 - Create concrete classes
public class BackgroundObject implements GraphicalObject {
    private int x;
    private int y;
    private int width;
    private int height;
    private BackgroundObjectType type;
    // private List<Integer>pixels= new ArrayList<>();

    // step 2.5 - Implemented the clone method
    @Override
    public BackgroundObject clone() {
        return new BackgroundObject(x, y, width, height, type);
    }

}
