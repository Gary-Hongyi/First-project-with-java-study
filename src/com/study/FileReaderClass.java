package com.study;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderClass {
    public static void main(String[] args){

        //FileReader = read the contents of a file as astream of characters.（字母流） One by one
        //             read() returns an int value which contains byte value
        //             when read() returns -1, there is no data to be read
        try{
            FileReader reader = new FileReader("test_message.txt");
            int data = reader.read();//只储存第一个字母
            while(data != -1){
                System.out.print((char)data);//不要加上ln 否则会 一个一个字母打印
                //不加char返回的是ASCII码 如 A = 65
                data = reader.read();
            }
            //int data;第二种写法
            //// 把读取和判断合并在一起：先读取赋值给 data，然后再判断 data 是不是 -1
            //while ((data = reader.read()) != -1) {
            //    System.out.print((char) data);
            //}
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }


    }
}
