package com.tuannnguyen.practice.effectivejava.chapter2;

public class CalZone extends Pizza {
    private final boolean sauceInside;

    public boolean isSauceInside() {
        return sauceInside;
    }

    private CalZone(Builder builder) {
        super(builder);
        this.sauceInside = builder.sauceInside;
    }

    public static class Builder extends Pizza.Builder<Builder> {
        private boolean sauceInside = false;

        public Builder sauceInside() {
            this.sauceInside = true;
            return this;
        }

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        protected CalZone build() {
            return new CalZone(this);
        }
    }
}
