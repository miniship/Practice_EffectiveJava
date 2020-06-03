package com.tuannnguyen.practice.effectivejava.chapter2.builderpattern;

import java.util.Set;

public abstract class Pizza {
    public enum TOPPING {HAM, ONION, PEPPER, SAUSAGE, MUSHROOM}
    private Set<TOPPING> toppingSet;

    public <T> Pizza(<T extends Builder> builder) {
        this.toppingSet =
    }

    public Set<TOPPING> getToppingSet() {
        return toppingSet;
    }

    protected abstract static class Builder {
        private Set<TOPPING> toppingSet;
    }
}
