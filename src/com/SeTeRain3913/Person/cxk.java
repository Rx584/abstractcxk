package com.SeTeRain3913.Person;

public class cxk extends Simple{

    private String ago="两年半";
    private String liking ="唱、跳、rap、篮球";

    public void AboutMe(){
        this.say("全民制作人们大家好，我是练习时长"+this.ago+"的个人练习生"+this.getName()+"喜欢"+this.liking +"Music");
    }
    public void moveHands(boolean leftHand,boolean rightHand,boolean leftFoot,boolean rightFoot){
        this.doSomething("在过去的一秒中内的动作:移动左手:"+leftHand+"移动右手:"+rightHand+"移动左脚:"+leftFoot+"移动右脚:"+rightFoot);
    }
    public void turn(){
        this.doSomething("转身");
    }
    public void ironKun(){
        this.doSomething("在过去的一秒内，做了 铁山靠");
    }
    public void getBasketball(){
        this.doSomething("得到了篮球");
    }
    public void throwBasketball(){
        this.doSomething("扔掉了篮球");
    }
    public void throwCoat(){
        this.doSomething("甩掉了外套");
    }
    public void pantsDown(){
        this.doSomething("背带裤滑落");
    }
    public void jump(){
        this.doSomething("跳跃");
    }
    public void sing(String lyric){
        System.out.printf("%s唱出:%s\n",this.getName(),lyric);
    }
    public void playBasketball(){
        this.doSomething("打篮球");
    }
    public void TheEnd(){
        this.say("在今后的节目中");
        this.say("我还准备了");
        this.moveHands(true,true,false,false);
        this.say("很多我自己作词作曲");
        this.say("编舞的原创作品");
        this.moveHands(true,true,false,false);
        this.say("期待的话请多多为我投票吧");
        this.moveHands(true,true,true,true);
        this.doSomething("离开了这个舞台");

    }
}
