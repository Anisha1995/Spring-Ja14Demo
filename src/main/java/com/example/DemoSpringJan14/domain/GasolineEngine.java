package com.example.DemoSpringJan14.domain;

import lombok.Data;

@Data
public class GasolineEngine implements Engine {
    private  final  String type;

    public GasolineEngine(String type) {
        this.type = type;
    }

    @Override
    public String getEngineType() {
        return type;
    }
}
