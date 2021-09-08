package com.example.demodespatter.designpattern.adapter;

public class TestAdapter {


    public static void main(String[] args) {
        Mobile mobile = new Mobile();
        V5power vpower = new V5powerAdapter(new HomeV220Power());
        mobile.inputPoewer(vpower);
    }
}
