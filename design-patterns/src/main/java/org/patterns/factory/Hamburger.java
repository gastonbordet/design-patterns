package org.patterns.factory;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class Hamburger {
    public String name;
    public void prepare() {
        System.out.printf("preparing %s \n", name);
    };
    public void cook() {
        System.out.printf("cooking %s \n", name);
    };
    public void box() {
        System.out.printf("boxing %s \n", name);
    };
}
