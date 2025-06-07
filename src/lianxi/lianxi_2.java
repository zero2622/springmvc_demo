package lianxi;

//验证码

import java.util.Random;

public class lianxi_2 {
    public static void main(String[] args) {
        char[] chs = new char[52];
        for (int i = 0; i < chs.length; i++) {
            if (i <= 25) {
                chs[i] = (char) (i + 97);
            } else {
                chs[i] = (char) (i + 65 - 26);
            }
        }


        String result = "";
        Random r = new Random();
        for (int i = 0; i <4; i++) {
            int random_index = r.nextInt(chs.length);
            result += chs[random_index];
        }
        int number = r.nextInt(10);
        result += number;
        System.out.println(result);




    }
}
