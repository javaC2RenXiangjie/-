package org.keyListern;

import com.melloware.jintellitype.HotkeyListener;
import com.melloware.jintellitype.JIntellitype;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.*;

public class main extends JFrame {

    private static final int GLOBAL_HOT_KEY_1 = 1;

    public static void main(String[] args) throws IOException, Throwable{
//        JIntellitype.getInstance().registerHotKey(GLOBAL_HOT_KEY_1, JIntellitype.MOD_SHIFT, (int) 'D');
//
//        JIntellitype.getInstance().addHotKeyListener(new HotkeyListener() {
//            public void onHotKey(int markCode) {
//                switch (markCode) {
//                    case 1:
//                        System.out.println(markCode);
//                        break;
//                }
//            }
//    });
//        System.out.println("请输入：");
//        Scanner scanner = new Scanner(System.in);
//        String s = scanner.next();
//        if(s.equals("我要开始了")){
        Thread.sleep(2000);
            Robot robot = new Robot();

            InputStream fileInfo = new FileInputStream("D://fuckUBitch.txt");
            InputStreamReader isr = new InputStreamReader(fileInfo, "GBK");
            BufferedReader bf = new BufferedReader(isr);
            String line = null;
            while((line = bf.readLine()) != null) {
                Thread.sleep(line.length() * 50);
                setClipboardString.setClipboardString(line);
//      实现U 操作
//                robot.keyPress(KeyEvent.VK_U);
//                robot.keyRelease(KeyEvent.VK_U);
////      实现Enter操作
//                robot.keyPress(KeyEvent.VK_ENTER);
//                robot.keyRelease(KeyEvent.VK_ENTER);
//                Thread.sleep(50);
//      实现Ctrl + V 操作WDNMD

                robot.keyPress(KeyEvent.VK_CONTROL);
                robot.keyPress(KeyEvent.VK_V);
                robot.keyRelease(KeyEvent.VK_CONTROL);
                robot.keyRelease(KeyEvent.VK_V);

//      实现Enter操作
                robot.keyPress(KeyEvent.VK_ENTER);
                robot.keyRelease(KeyEvent.VK_ENTER);
                System.out.println(line);
            }
            fileInfo.close();
            bf.close();
            System.out.println("print done!");
//        } else {
//            System.out.println("开始失败");
//        }
    }
}

//