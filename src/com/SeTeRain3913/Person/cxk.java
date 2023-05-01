package com.SeTeRain3913.Person;

public class cxk extends Simple{

    public String ago="两年半";
    public String  liking ="唱、跳、rap、篮球";
    public String[] Lyric = {"只因你太美 baby 只因你太美 baby",
            "只因你实在是太美 baby 只因你太美 baby",
            "迎面走来的你让我如此蠢蠢欲动",
            "这种感觉我从未有",
            "Cause I got a crush on you who you",
            "你是我的我是你的谁",
            "再多一眼看一眼就会爆炸",
            "再近一点靠近点快被融化"};
    public void AboutMe(){
        this.Say("全民制作人们大家好，我是练习时长"+this.ago+"的个人练习生"+this.name+"喜欢"+this.liking +"Music");
    }
    public void moveHands(boolean leftHand,boolean rightHand,boolean leftFoot,boolean rightFoot){
        this.Do("在过去的一秒中内的动作:移动左手:"+leftHand+"移动右手:"+rightHand+"移动左脚:"+leftFoot+"移动右脚:"+rightFoot);
    }
    public void turn(){
        this.Do("转身");
    }
    public void ironKun(){
        this.Do("在过去的一秒内，做了 铁山靠");
    }
    public void getBasketball(){
        this.Do("得到了篮球");
    }
    public void throwBasketball(){
        this.Do("扔掉了篮球");
    }
    public void throwCoat(){
        this.Do("甩掉了外套");
    }
    public void pantsDown(){
        this.Do("背带裤滑落");
    }
    public void jump(){
        this.Do("跳跃");
    }
    public void sing(int index){
        System.out.printf("%s唱出:%s\n",this.name,this.Lyric[index]);
    }
    public void playBasketball(){
        this.Do("打篮球");
    }
    public void TheEnd(){
        this.Say("在今后的节目中");
        this.Say("我还准备了");
        this.moveHands(true,true,false,false);
        this.Say("很多我自己作词作曲");
        this.Say("编舞的原创作品");
        this.moveHands(true,true,false,false);
        this.Say("期待的话请多多为我投票吧");
        this.moveHands(true,true,true,true);
        this.Do("离开了这个舞台");

    }
}
