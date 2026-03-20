package com.study;
//关联 Traffic Train  Plane Boat
public class Polymorphism {
    public static void main(String[] args){

        //polymorphism = Greek word for poly-"many"  morph-"form"
        //               The ability of an object to identify as more than one type

        Train train = new Train();
        Plane plane = new Plane();
        Boat boat = new Boat();
       // Train [] racers = {train,plane,boat}; 这样会报错因为只能识别train
        Traffic[] racers = {train,plane,boat}; //都属于Traffic 均可识别
        //即利用多态性将不同类型储存在同一数组


        //原始的一个一个打印
        train.go();
        plane.go();
        boat.go();
        //用多态性质打印
        for(Traffic x: racers){ //类型名 变量: 数组名
            x.go();//父类也要写go 占个签名，干活的是子类，子类就像在overriding
            //或者父类直接abstract也行，反正不干活
        }



    }
}
