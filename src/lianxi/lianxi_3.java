package lianxi;

public class lianxi_3 {
    public static void main(String[] args) {

        int number = 24563;
        int[] arr = getArr(number);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 5;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] %10;
        }
        for (int i = 0, j = arr.length -1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            num = num *10 + arr[i];
        }
        System.out.println(num);


    }

    public static int[] getArr(int number) {

        int temp = number;
        int count = 0;
        while (number != 0) {
            number = number / 10;
            count++;
        }

        int[] arr = new int[count];
        int index = arr.length - 1;
        while (temp != 0) {
            int ge = temp % 10;
            temp = temp / 10;
            arr[index] = ge;
            index--;
        }
        return arr;

    }

}
