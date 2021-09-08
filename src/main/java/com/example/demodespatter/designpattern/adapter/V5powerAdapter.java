package com.example.demodespatter.designpattern.adapter;

public class  V5powerAdapter implements  V5power{

     HomeV220Power homeV220Power;

     public V5powerAdapter(HomeV220Power homeV220Power) {
          this.homeV220Power = homeV220Power;
     }

     @Override
     public int provider5Power() {
          // homepower 经过一些变化 变成5v电压
          return 5;
     }

}
