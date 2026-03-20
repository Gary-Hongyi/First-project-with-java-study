package com.study;

import javax.sound.sampled.*; // mp3音频不支持，处理wav音频时要导入这个
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Audio {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException { //throw 也可以自动补全，就是让虚拟机去解决
        //244533__xtrgamr__music-game-disc-eject.wav
        // 音频文件一定要放在src同级

        Scanner scanner = new Scanner(System.in);

        File file = new File("244533__xtrgamr__music-game-disc-eject.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);//文件在不在（IO）格式对不对（unsupported)
        Clip clip = AudioSystem.getClip(); //这两行检查向电脑声卡申请的问题，申请得到播放器
        clip.open(audioStream);//播放器写入数据

        //clip.start();//播放器开始工作

        //String response = scanner.next();//java 代码一行一行执行很快，start后Java不会等音乐播放完，加入scanner等待用户输入，否则直接到main 的大括号程序就停止了

        String response = "";//骗程序进入while循环，只要不是Q 程序都能跑起来

        while(!response.equals("Q")) { //如果不等于Q
            System.out.println("P = play, S = Stop, R = Reset, Q = Quit");
            System.out.print("Enter your choice: ");

            response = scanner.next();
            response = response.toUpperCase(); // 把用户的输入统一转换成大写，这样输入小写 p 也能起作用

            switch(response) {
                case ("P"): clip.start();
                    break;
                case ("S"): clip.stop();
                    break;
                case ("R"): clip.setMicrosecondPosition(0); // 把播放进度重置回 0 微秒（也就是音乐开头）
                    break;
                case ("Q"): clip.close(); // 补充：退出时最好关闭clip释放资源
                    break;
                default: System.out.println("Not a valid response");
            }
        }
        System.out.println("Byeeee!"); // 循环结束后打印一句告别语


    }
}
