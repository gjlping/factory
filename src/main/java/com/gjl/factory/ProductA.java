package com.gjl.factory;

import com.gjl.factory.simple.Product;

/**
 * @author gjl
 * @create 2019-03-16 23:23
 **/
public class ProductA implements Product{

    @Override
    public void getProduct() {
        System.out.println("use productA");
    }
}
