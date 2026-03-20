package com.study;
import java.io.FileWriter; //申请一把往文件里写字的笔
import java.io.IOException; //申请读写任务出错时的应急手册

public class FileWriter1 {

    public static void main(String[] args) {

        // 注意 try 后面的括号  //改文件之类的属于比较危险的操作所以要加保险
        try (FileWriter writer = new FileWriter("poem.txt")) {//写在try里面后期不用加writer.close()就能写入
            writer.write("Roses are red\n test\n teat2\n test3");//写入文件
            writer.append("\n A poem by bro");//在文件的末尾写入
            // 这里不需要手动写 writer.close()，它会自动关闭
        } catch (IOException e) { //如果发生io(input output)错误，不让程序直接死机
            e.printStackTrace();//打印错误的原因
        }
    }
}