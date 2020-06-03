package com.tuannnguyen.practice.effectivejava.chapter2;

import java.util.EnumSet;
import java.util.Set;

public abstract class Pizza {
    public enum TOPPING {HAM, ONION, SAUSAGE, MUSHROOM, PEPPER}
    private final Set<TOPPING> toppings;

    public Pizza(Builder<?> builder) {
        this.toppings = builder.toppings.clone();
    }

    public Set<TOPPING> getToppings() {
        return toppings;
    }

    abstract static class Builder<T extends Builder<T>> {
        private EnumSet<TOPPING> toppings = EnumSet.noneOf(TOPPING.class);

        public T addTopping(TOPPING topping) {
            this.toppings.add(topping);
            return self();
        }

        protected abstract T self();

        protected abstract Pizza build();
    }
}
