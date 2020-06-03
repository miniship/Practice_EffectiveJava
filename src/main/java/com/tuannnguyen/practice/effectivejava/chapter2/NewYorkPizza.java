package com.tuannnguyen.practice.effectivejava.chapter2;

import java.util.Objects;

public class NewYorkPizza extends Pizza {
    public enum SIZE {SMALL, MEDIUM, LARGE}
    private final SIZE size;

    public SIZE getSize() {
        return size;
    }

    private NewYorkPizza(Builder builder) {
        super(builder);
        this.size = builder.size;
    }

    public static class Builder extends Pizza.Builder<Builder> {
        private final SIZE size;

        public Builder(SIZE size) {
            this.size = Objects.requireNonNull(size);
        }

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        protected NewYorkPizza build() {
            return new NewYorkPizza(this);
        }
    }
}
