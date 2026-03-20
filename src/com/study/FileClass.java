package com.study;
import java.io.File;//用官方关于操作文件的图纸
public class FileClass{
    public static void main(String[] args){

        // file = An abstract representation of file and directory pathnames

        File file = new File("secret__message.txt");// file你可以认为是java系统已有的对象，FileClass是一个空壳，调用来没用
        //放在项目根目录，只需要输入名字，放在其他地方，则需要完整的地址
        File file2 = new File("C:/Users/29772/Desktop/secret__message.txt/");
        if(file.exists()){
            System.out.println("That file exists! ");
            System.out.println(file.getPath());//得到地址
            System.out.println(file.getAbsolutePath());//得到绝对地址
            System.out.println(file.isFile());//判断是不是真的为文件
            file.delete();//执行时删除文件
        }
        else{
            System.out.println("That file doesn't exist");
        }
        if(file2.exists()){
            System.out.println("That file exists! ");
        }
        else{
            System.out.println("That file doesn't exist");
        }
    }
}
