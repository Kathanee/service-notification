package org.example;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ImplementingMethodsTest {

    @Test
    public void sum() {
        ICalculator calculator=new ImplementingMethods();
        int result=calculator.sum(12,34);
        Assert.assertEquals(46,result);
    }

    @Test
    public void sub() {
        ICalculator calculator=new ImplementingMethods();
        int result=calculator.sub(12,6);
        Assert.assertEquals(6,result);
    }

    @Test
    public void mul() {
        ICalculator calculator=new ImplementingMethods();
        int result=calculator.mul(12,3);
        Assert.assertEquals(36,result);
    }

    @Test
    public void div() {
        ICalculator calculator=new ImplementingMethods();
        int result=calculator.div(12,3);
        Assert.assertEquals(4,result);
    }
}