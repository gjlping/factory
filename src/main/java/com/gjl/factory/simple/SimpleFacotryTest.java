package com.gjl.factory.simple;

/**
 * @author gjl
 * @create 2019-03-16 23:31
 **/
public class SimpleFacotryTest {
    public static void main(String[] args) {
        com.gjl.factory.simple.Product product = SimpleFacotry.getProduct("A");
        product.getProduct();
    }
}
