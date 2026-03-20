package com.study;

public class Auto {

    private String make;// 这些变量都是字段
    private String model;
    private int year;
    Auto(String make,String model,int year){
       //set 里面写了，以下三行就不用重复写了
        //this.make = make;
        //this.model = model;
        //this.year = year;
        //上面这三行相当将定制化的信息写入系统

        // 方法之间是并列的，不能嵌套定义，但是一个方法可以找另一个来干活
        this.setMake(make);
        this.setModel(model);
        this.setYear(year);
    }
    public String getMake(){ //命名规范是get + 字段名首字母大写
        return make; //返回make 此时调用者不知道，所有需return
    }
    public String getModel(){
        return model;
    }
    public int getYear(){
        return year;
    }
    public void setMake(String make){//括号里面是需要传入修改的值
        this.make = make; // make是调用者传递的，调用者知道，不需return
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setYear(int year){
        this.year =year;//this. 是传进去的量  year 是被覆盖的表格
    }

    public void copy(Auto x){// main 方法中写 auto2.copy(auto1); 把auto1 的传进去写入auto2的private
        this.setMake(x.getMake()); //this.是传进去的量，
        this.setModel(x.getModel());
        this.setYear(x.getYear());//拿到值，写入值，拿到值，写入值
    }
    Auto(Auto x){
        this.copy(x);//Auto auto3 = new Auto(auto1); 这里的this 永远是当前对象自己 auto3 ,当前对象auto3 调用了这个方法
    }
}
