package com.SeTeRain3913.Person;

public class Simple {
    public String name;
    public int HP=100;
    public void Say(String says){
        System.out.println(name+":"+says);
    }
    public void Dead(){
        HP=0;
        System.out.printf("(%s:已死亡)",name);
    }
    public void Do(String ds){
        System.out.printf("(%s:%s)\n",name,ds);
    }
}
