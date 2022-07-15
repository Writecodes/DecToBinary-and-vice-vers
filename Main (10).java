//...............Convert decimal number to binary number.........................

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
        System.out.print("Input : ");
        int num = sc.nextInt();
        int index = 0, i;
        int[] arr = new int[20];
        while (num > 0) {
            arr[index] = num % 2;
            index++;
            num = num / 2;
        }
        System.out.print("\nOutput : ");
        for (i = index - 1; i >= 0; i--)
            System.out.print(arr[i]);
    }
}
    
    
//     static void DecToBin() {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Input : ");
//         int num = sc.nextInt();
//         int index = 0, i;
//         int[] arr = new int[20];
//         while (num > 0) {
//             arr[index] = num % 2;
//             index++;
//             num = num / 2;
//         }
//         System.out.print("\nOutput : ");
//         for (i = index - 1; i >= 0; i--)
//             System.out.print(arr[i]);
//     }
//     static void BintoDec() {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Input : ");
//         int num = sc.nextInt();
//         int rem, sum = 0, i = 0;
//         int temp = num;
//         while (temp > 0) {
//             rem = temp % 10;
//             sum = sum + rem * (int) Math.pow(2, i++);//int is used becoz by default Math.pow() is double
//             temp = temp / 10;
//         }
//         System.out.print("Ouput : " + sum);
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
// //            int n = sc.nextInt();
//         System.out.print("Press 1 to convert decimal number to binary number......\n" +
//                 "Press 2 to convert Binary to decimal..........");
//         System.out.print("\nEnter your choice...");
//         int choice = sc.nextInt();
//         switch (choice) {
//             case 1:
//                 DecToBin();
//                 break;
//             case 2:
//                 BintoDec();
//                 break;
//         }
//     }
// }
