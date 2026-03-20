package com.study;
import java.io.File;//用官方关于操作文件的图纸
import java.io.IOException;

public class FileClass{
    public static void main(String[] args){

        // file = An abstract representation of file and directory pathnames

        File file = new File("secret__message.txt");// file你可以认为是java系统已有的对象，FileClass是一个空壳，调用来没用 //这一行把已有的文件地址存入file这个变量中
        //放在项目根目录，只需要输入名字，放在其他地方，则需要完整的地址
        File file2 = new File("C:/Users/29772/Desktop/secret__message.txt");
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
        else {
            System.out.println("That file doesn't exist");

        }

        // 1. 创建 File 对象（这只是一个“地址卡片”，还没生文件）
        File file3 = new File("test_message.txt");

        try {
            // 2. 真正尝试在硬盘上创建文件
            // createNewFile() 会返回一个布尔值：创建成功返回 true，文件已存在返回 false
            if (file3.createNewFile()) { //这个不同于定位，这个是真正创建一个新file
                System.out.println("太棒了！文件创建成功：" + file3.getName());
            } else {
                System.out.println("文件已经存在，不需要重复创建。");
            }
        } catch (IOException e) {
            // 3. 如果发生意外（比如你没权限写文件），程序会跑到这里
            System.out.println("出错了，无法创建文件。");
            e.printStackTrace();
        }
    }
}
