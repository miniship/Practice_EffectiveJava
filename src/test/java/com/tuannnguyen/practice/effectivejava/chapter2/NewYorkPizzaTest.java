package com.tuannnguyen.practice.effectivejava.chapter2;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import com.tuannnguyen.practice.effectivejava.chapter2.NewYorkPizza.SIZE;
import com.tuannnguyen.practice.effectivejava.chapter2.Pizza.TOPPING;

@RunWith(MockitoJUnitRunner.class)
public class NewYorkPizzaTest {

    @Test
    public void buildSmallPizza_pizzaShouldGetSmallSize() {
        NewYorkPizza pizza = new NewYorkPizza.Builder(SIZE.SMALL).build();

        Assert.assertTrue(pizza.getToppings().isEmpty());
        Assert.assertEquals(SIZE.SMALL, pizza.getSize());
    }

    @Test
    public void add3DifferentToppings_ToppingSizeShouldEqual3() {
        NewYorkPizza pizza = new NewYorkPizza.Builder(SIZE.SMALL)
                .addTopping(TOPPING.HAM)
                .addTopping(TOPPING.SAUSAGE)
                .addTopping(TOPPING.ONION)
                .build();

        Assert.assertEquals(3, pizza.getToppings().size());
    }

    @Test
    public void addOneTopping3Times_ToppingSizeShouldNotEqual3() {
        NewYorkPizza pizza = new NewYorkPizza.Builder(SIZE.SMALL)
                .addTopping(TOPPING.HAM)
                .addTopping(TOPPING.HAM)
                .addTopping(TOPPING.HAM)
                .build();

        Assert.assertNotEquals(3, pizza.getToppings().size());
    }
}