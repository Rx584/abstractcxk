package com.SeTeRain3913.Person;

public class Simple {
    private String name;
    public Simple(){}
    public Simple(String name){this.name=name;}

    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void doSomething(String things){
        System.out.printf("(%s:%s)\n",this.name,things);
    }
    public void say(String content){
        System.out.printf("%s说:\"%s\"",this.name,content);
    }
}
