package com.gjl.factory.abstrac;

/**
 * @author gjl
 * @create 2019-03-16 23:53
 **/
public class HuaweiFactory implements PhoneFactory{
    @Override
    public IProductA createProductA() {
        return new HuaweiProductA();
    }

    @Override
    public IProductB createProductB() {
        return new HuaweiProductB();
    }
}
