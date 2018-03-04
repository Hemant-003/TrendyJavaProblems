//TRENDY NUMBERS
//        A number is said to be a trendy number if and only if it has 3 digits and the middle digit is divisible by 3.
//        Examples of Trendy Numbers: 131, 264, 999
//        Examples of NonTrendy Numbers : 123, 653, 33, 4, 1034
//        Write a C program to find whether a given number is a Trendy Number or not.
//        Input Format:
//        Input consists of a single integer.
//        Output Format:
//        Refer sample output for details.
//        Sample Input 1:
//        791
//        Sample Output 1:
//        Trendy Number
//        Sample Input 2:
//        3
//        Sample Output 2:
//        Not a Trendy Number

import java.util.Scanner;

public class TrendyNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                int trendyNumber = scanner.nextInt();
                int mod = 0;
                int divide = 0;
                int count = 0;

                if (trendyNumber<100 || trendyNumber>999) {
                    System.out.println("Not a Trendy Number");
                }

                else if (trendyNumber >= 100 || trendyNumber <= 999){
                    while (trendyNumber > 0) {

                        mod = trendyNumber %10;
                        trendyNumber = trendyNumber/10;
                        count++;
                        if (count==2){
                            if (mod%3==0){
                                System.out.println("Trendy Number");
                            }
                            else {
                                System.out.println("Not a Trendy Number");
                            }
                        }
                    }
                }
            }
        }
