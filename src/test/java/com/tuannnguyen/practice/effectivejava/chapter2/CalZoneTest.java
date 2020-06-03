package com.tuannnguyen.practice.effectivejava.chapter2;

import org.junit.Assert;
import org.junit.Test;
import com.tuannnguyen.practice.effectivejava.chapter2.Pizza.TOPPING;

public class CalZoneTest {

    @Test
    public void defaultThereIsNoSauceInside() {
        CalZone pizza = new CalZone.Builder()
                .addTopping(TOPPING.MUSHROOM)
                .addTopping(TOPPING.PEPPER)
                .build();

        Assert.assertEquals(2, pizza.getToppings().size());
        Assert.assertFalse(pizza.isSauceInside());
    }

    @Test
    public void addSauceInside_pizzaShouldHaveSauceInside() {
        CalZone pizza = new CalZone.Builder().sauceInside().build();

        Assert.assertTrue(pizza.isSauceInside());
    }
}