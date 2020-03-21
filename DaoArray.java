package DaonguocMang;

import java.util.Scanner;

public class DaoArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter n: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        int tg, i, j;
        for (i = 0; i < n; i++) {
            System.out.print("nhap phan tu thu " + i + ": ");
            array[i] = scanner.nextInt();
        }
        for (i = 0; i < n; i++) {
            System.out.print(array[i] + " " );
        }
        System.out.println(" \n Array sau khi dao la : ");
        for (i = 0; i < n; i++) {
            for (j = i + 1; j < n; j++) {
                tg = array[i];
                array[i] = array[j];
                array[j] = tg;
            }
            System.out.print( array[i] + " ");
        }

    }
}
