package lianxi;

import java.util.Scanner;

public class lianxi_1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入原价");
        int ticket = sc.nextInt();
        System.out.println("输入月份");
        int month = sc.nextInt();
        System.out.println("输入舱位，0和1");
        int seat = sc.nextInt();

        if (month >= 5 && month <= 10) {
            ticket = get_prices(ticket,seat,0.9,0.85);
        } else if ((month >= 1 && month <= 4) || (month >= 11 && month <= 12)) {
            ticket = get_prices(ticket,seat,0.7,0.65);
        } else {
            System.out.println("月份不合法");
        }

        System.out.println(ticket);
    }

    public static int get_prices(int ticket, int seat, double v0, double v1) {
        if (seat == 0) {
            ticket = (int) (ticket * v0);
        } else if (seat == 1) {
            ticket = (int) (ticket * v1);
        } else {
            System.out.println("没有这个舱位");
        }
        return ticket;
    }
}