package com.example.demodespatter.designpattern.builder;

public class Product {

    String cpu;
    String showCard;


    String propetis1;
    String propetis2;
    String propetis3;

    public Product(String cpu, String showCard) {
        this.cpu = cpu;
        this.showCard = showCard;
    }

    public String getPropetis1() {
        return propetis1;
    }

    public void setPropetis1(String propetis1) {
        this.propetis1 = propetis1;
    }

    public String getPropetis2() {
        return propetis2;
    }

    public void setPropetis2(String propetis2) {
        this.propetis2 = propetis2;
    }

    public String getPropetis3() {
        return propetis3;
    }

    public void setPropetis3(String propetis3) {
        this.propetis3 = propetis3;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getShowCard() {
        return showCard;
    }

    public void setShowCard(String showCard) {
        this.showCard = showCard;
    }

    @Override
    public String toString() {
        return "Product{" +
                "cpu='" + cpu + '\'' +
                ", showCard='" + showCard + '\'' +
                ", propetis1='" + propetis1 + '\'' +
                ", propetis2='" + propetis2 + '\'' +
                ", propetis3='" + propetis3 + '\'' +
                '}';
    }
}
