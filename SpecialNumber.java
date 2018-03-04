//SPECIAL NUMBER
//        A 2-digit number is said to be a special number if the sum of the sum of its digits and the products of its digits is equal to the number itself.
//        For example, 19 is a special number. The digits in 19 are 1 and 9. The sum of the digits is 10 and the product of the digits is 9.
//        10+9 = 19.
//        Write a C program to find all special numbers between 2 limits m and n(both inclusive). Assume that m and n are 2-digit numbers.
//        Input Format:
//        Input consists of 2 integers m and n.
//        Output Format:
//        Refer Sample Output .
//
//        Sample Input 1:
//        11
//        30
//        Sample Output 1:
//        19
//        29
import java.util.Scanner;
public class SpecialNumber {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();

        //int start = 11;
        //int end = 30;
        int k;
        for (int i = m; i <= n; i++) {
            k = i;
            int mod = k % 10;
            //2

            int divide = k / 10;
            //1
            int sum = mod + divide;
            //3

            int product = mod * divide;
            //2
            int special = sum + product;

            if (special == k) {
                System.out.println(k);
            }
        }
    }
}
