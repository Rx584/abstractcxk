package com.SeTeRain3913.Person;
//简单人物类 定义了一些简单的人物动作，包括人物说话及做某些事。
public class Simple {
    private String name;//角色名字
    public Simple(){}//空构建方法
    public Simple(String name){this.name=name;}//全构建方法

    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    //setter和getter
    public void doSomething(String things){
        System.out.printf("(%s:%s)\n",this.name,things);
    }//做某些事方法 角色做的事将会以(<名字>:<做的事情>)的方法表现在控制台上
    public void say(String content){
        System.out.printf("%s说:\"%s\"\n",this.name,content);
    }//说话方法 人物说的话将会以<人物>:“<说的话>” 表现在控制台上
}
