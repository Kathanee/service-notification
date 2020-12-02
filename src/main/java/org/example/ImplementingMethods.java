package org.example;

public class ImplementingMethods implements ICalculator {
    public int sum(int x,int y)
    {
        return x+y;
    }
    public int sub(int x,int y)
    {
        return x-y;
    }
    public int mul(int x,int y)
    {
        return x*y;
    }
    public int div(int x,int y)
    {
        if(y==0)
            return y;
        return x/y;
    }
}
