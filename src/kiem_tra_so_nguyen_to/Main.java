package kiem_tra_so_nguyen_to;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size;
        do {
            System.out.println("nhập độ dài mảng: ");
            size = input.nextInt();
            if (size > 20) {
                System.out.println("Độ dài không được quá 20 phần tử.");
                System.out.println("Vui lòng nhập lại: ");
            }
        } while (size > 20);

        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("nhập phần tử thứ " + (i + 1) + " : ");
            arr[i] = input.nextInt();
        }
        System.out.println("Mảng ban đầu là: " + Arrays.toString(arr));

        boolean check = false;
        for (int i = 0; i < arr.length; i++) {
            check = true;
            if (arr[i] == 2) {
                check = true;
            } else if (arr[i] > 1) {
                for (int j = 2; j < arr[i]; j++) {
                    if (arr[i] % j == 0) {
                        check = false;
                    }
                }
            } else {
                check = false;
            }
            if (check) {
                System.out.print("Giá trị: " + arr[i] + "," + "ở vị trí: " + i + "\n");
            }
        }

    }
}
