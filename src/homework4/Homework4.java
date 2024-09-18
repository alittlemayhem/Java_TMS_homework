package homework4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework4 {
    // Task 1
    public static class Task1 {
        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            Random rand = new Random();

            int[][][] arr1 = new int[2][3][4];

            for(int i = 0; i < arr1.length; i++) {
                for(int j = 0; j < arr1[i].length; j++) {
                    for(int k = 0; k < arr1[i][j].length; k++) {
                        arr1[i][j][k] = rand.nextInt(201) - 100;
                    }
                }
            }

            for(int i = 0; i < arr1.length; i++) {
                for(int j = 0; j < arr1[i].length; j++) {
                    for(int k = 0; k < arr1[i][j].length; k++) {
                        arr1[i][j][k] += scan.nextInt();
                    }
                }
            }

            scan.close();
        }
    }

    // Task 2
    public static class Task2 {
        public static void main(String[] args) {

            char[][] chessboard = new char[8][8];

            char b = 'B';
            char w = 'W';

            for(int i = 0; i < chessboard.length; i++) {
                for(int j = 0; j < chessboard[i].length; j++) {
                    if((i % 2 == 0 && j % 2 == 0) || (i % 2 != 0 && j % 2 != 0)) {
                        chessboard[i][j] = b;
                    }
                    else {
                        chessboard[i][j] = w;
                    }
                    System.out.print(chessboard[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

    // Task 3

    public static class Task3 {
        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            Random rand = new Random();

            int sum = 0;

            int n;
            do {
                n = scan.nextInt();
            }
            while(n < 2 || n > 6);

            int[][] numbers = new int[n][n];

            for(int i = 0; i < numbers.length; i++) {
                for(int j = 0; j < numbers[i].length; j++) {
                    numbers[i][j] = rand.nextInt(201) - 100;
                }
            }

            for(int i = 0; i < numbers.length; i++) {
                // Суммирование главной диагонали
                for(int j = 0; j < numbers[i].length; j++) {
                    if(i==j) sum += numbers[i][j];
                }
                // Суммирование побочной диагонали
                for(int k = numbers[i].length - 1; k >= 0; k--) {
                    if(i + k == numbers[i].length - 1) sum += numbers[i][k];
                }
            }

            System.out.println(sum);

            scan.close();
        }
    }

    // Task 4

    public static class Task4 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            int m, n;

            do {
                m = scan.nextInt();
                n = scan.nextInt();
            } while (m < 3 && n < 3);

            Random rand = new Random();

            int[][] arr4 = new int[m][n];

            for(int i = 0; i < arr4.length; i++) {
                for(int j = 0; j < arr4[i].length; j++) {
                    arr4[i][j] = rand.nextInt(100);
                }
            }

            for(int i = 0; i < arr4.length; i++) {
                Arrays.sort(arr4[i]);
            }

            scan.close();
        }
    }
}
