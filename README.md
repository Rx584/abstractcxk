# 本来挺喜欢JavaOOP的

## 说明

使用JavaOOP制作了一个在控制台的抽象坤坤

## 启动方式

运行 Start Kunkun 启动配置即可在控制台看到抽象版坤坤

## 类文档

我定义了两个类,Simple 和 cxk,分别为简单角色类和蔡徐坤专属类，如果有需要可以将类单独拿出来使用，以下为这两个类的文档。

### 简单角色类

简单角色类是我定义的一个用来实现角色说话和角色动作的。
#### 属性
| 属性名 | 访问修饰符 | 解释         |
| :----- | ---------- | ------------ |
| `name` | private    | 角色名称属性 |

#### 方法
| 方法名                 | 访问修饰符 | 解释                                                         | 返回值类型 |
| :--------------------- | ---------- | ------------------------------------------------------------ | ---------- |
| `setName(<name>);`     | public     | 修改角色名称属性                                             | void       |
| `getName();`           | public     | 返回角色名称                                                 | String     |
| `say(<content>);`      | public     | 角色说话,人物说的话将会以<人物>:“<说的话>” 表现在控制台上    | void       |
| `doSomething(<thing>)` | public     | 角色做事，角色做的事将会以(<名字>:<做的事情>)的方法表现在控制台上 | void       |
|Simple()||无参构造方法||
|Simple(String name)||有参构造方法，参数填角色的名字||


### 蔡徐坤专属类

顾名思义，蔡徐坤专属类定义了一些蔡徐坤专属的属性及方法。你可以使用这个类制作你自己的坤坤。该方法继承于Simple类

#### 属性

| 属性名 | 访问修饰符 | 解释                                    |
| ------ | ---------- | --------------------------------------- |
| ago    | private    | 坤坤练习时长，默认为两年半              |
| liking | private    | 坤坤喜欢的东西，默认为唱、跳、rap、篮球 |

#### 方法

| 方法名                                                                                | 访问修饰符  | 解释                     | 返回值类型 |
|------------------------------------------------------------------------------------|--------|------------------------|-------|
| cxk()                                                                              |        | 无参构造方法，会将name属性设为蔡徐坤   |       |
| cxk(String name)                                                                   |        | 有参构造方法，参数里填name属性      |       |
| `AboutMe()`                                                                        | public | 坤坤的自我介绍                | void  |
| `moveHands(boolean leftHand,boolean rightHand,boolean leftFoot,boolean rightFoot)` | public | 将坤坤在前一秒内的四肢是否移动表现在控制台上 | void  |
| `turn()`                                                                           | public | 将坤坤转身的动作输出在控制台上        | void  |
| `ironKun()`                                                                        | public | 坤坤做铁山靠                 | void  |
| `getBasketball()`                                                                  | public | 坤坤接球                   | void  |
| `throwBasketball()`                                                                | public | 坤坤投球                   | void  |
| `throwCoat()`                                                                      | public | 坤坤甩掉衣服                 | void  |
| `pantsDown()`                                                                      | public | 坤坤的背带裤滑落了              | void  |
| `jump()`                                                                           | public | 坤坤跳跃                   | void  |
|`sing(String lyric)`|public|坤坤唱歌，参数lyric为唱出的歌词|void|
|`playBasketball()`|public|坤坤打篮球|void|
|`TheEnd()`|public|坤坤的结束语|void|