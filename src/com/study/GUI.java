package com.study;
// GUI === Graphical User Interface可视化程序

import javax.swing.JOptionPane;

public class GUI {
    public static void main(String[] args){
       String name = JOptionPane.showInputDialog("Enter your name");
       JOptionPane.showMessageDialog(null,"Hello" + name);
      int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age")); //外面将其包裹的这个可以把字符串转换成整数
        JOptionPane.showMessageDialog(null,"You are " + age+"years old");
    }
}
