package com.github.Nikznah.json;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SuperHero {

    private String name;
    private int age;
    private String label;
    private String hairColor;

    public SuperHero() {
    }
}
