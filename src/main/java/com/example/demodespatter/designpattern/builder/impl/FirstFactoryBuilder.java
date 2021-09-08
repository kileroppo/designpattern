package com.example.demodespatter.designpattern.builder.impl;

import com.example.demodespatter.designpattern.builder.AbsBuilder;
import com.example.demodespatter.designpattern.builder.Product;

public class FirstFactoryBuilder extends AbsBuilder {

    protected  Product product;

    public FirstFactoryBuilder(String cpu, String showCard) {
         product = new Product(cpu, showCard);
    }

    @Override
    public void setproductPropeis1() {
        product.setPropetis1("1");
    }

    @Override
    public void setproductPropeis2() {
        product.setPropetis2("2");
    }

    @Override
    public void setproductPropeis3() {
        product.setPropetis3("3");
    }

    @Override
    public Product getProduct() {
        return product;
    }
}
