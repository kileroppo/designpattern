package com.example.demodespatter.designpattern.strategy.version2;

public class Role2 {

    public Role2(String name) {
     this.name = name;
    }


    public static String  name = null;

    protected  Show2 show2;

    protected    Attack2 attack2;

    protected Role2 setShow2(Show2 show2){
        this.show2 = show2;
        return this;
    }
    protected Role2 setAttack2(Attack2 attack2){
        this.attack2 = attack2;
        return this;
    }

    protected void ueShow2(){
        show2.disPlayer();
    }
    protected void useAttack2(){
        attack2.attack();
    }
}
