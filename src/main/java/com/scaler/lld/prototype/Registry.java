package com.scaler.lld.prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry<ENTITY,ENTITY_TYPE> {
    private Map<ENTITY_TYPE, ENTITY> registry = new HashMap<>();

    public void store(ENTITY_TYPE type, ENTITY backgroundObject) {
        registry.put(type, backgroundObject);
    }
    public ENTITY get(ENTITY_TYPE type){
        return registry.get(type);
    }

}
