package com.nowcoder.community;

import java.io.IOException;

public class WkTests {
    public static void main(String[] args) {
        String cmd = "/usr/local/bin/wkhtmltoimage --quality 75  https://www.nowcoder.com /Users/zhaohankai/Desktop/JAVA/project/community/data/wk-images/2.png";

        try {
            Runtime.getRuntime().exec(cmd);
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("ok.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
