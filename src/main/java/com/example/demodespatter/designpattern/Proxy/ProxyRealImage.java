package com.example.demodespatter.designpattern.Proxy;

public class ProxyRealImage implements Image{

    RealImage realImage;

    String filename;

    public ProxyRealImage(String filename) {
        this.filename = filename;
    }


    @Override
    public void display() {
        if (realImage==null){
            realImage = new RealImage(filename);
        }
        realImage.display();
    }
}
