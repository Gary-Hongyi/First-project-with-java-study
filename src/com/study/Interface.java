package com.study;
//关联 Rabbit Hawk Fish Prey Predator
//这次新建时class  下拉选项中选interface
// 实现类必须遵守契约，包含interface的方法，返回interface 规定的值
// 我们可以为一个类运用多个接口（区分于继承）
//最好用 return this --- 我完成了该契约，你可以继续用我
//implements 在java里指一个类实现了...接口
public class Interface {
    public static void main(String[] args){

        // interface = a template that can be applied to a class.
        //             similar to inheritance, but specifies what a class has/must do
        //             classes can apply more than one ,inheritance is limited to 1 super

        Rabbit rabbit = new Rabbit();
        rabbit.flee();

        Hawk hawk = new Hawk();
        hawk.hunt();

        Fish fish = new Fish(); // 可以不止一个接口,区别于inheritance
        fish.hunt();
        fish.flee();
    }
}
