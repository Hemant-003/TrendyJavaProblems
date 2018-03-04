//KAPREKAR NUMBER
//        Consider an n-digit number k. Square it and add the right n digits to the left n or n-1 digits. If the resultant sum is k, then k is called a Kaprekar number. For example, 9 is a Kaprekar number since
//        92 = 81 & 8+1=9.
//        and 297 is a Kaprekar number since
//        2972 = 88209 & 88+209 = 297.
//
//        Write a  program to find whether a given number is a Kaprekar number or not.
//
//        Input Format:
//        Input consists of a single integer.
//
//        Output Format:
//        Refer sample output for details.
//
//        Sample Input 1:
//        9
//
//        Sample Output 1:
//        Kaprekar Number
//
//        Sample Input 2:
//        101
//
//        Sample Output 2:
//        Not A Kaprekar Number
import java.util.Scanner;
public class KarprekarProblem {



        public static void main(String [] args){
            Scanner scanner = new Scanner(System.in);

            int a = scanner.nextInt();
            //int b = 2224;
            int mod = 0;
            int counter = 1;
            int squareRoot = a*a;
            int kaprekar = 0;
            //System.out.println(squareRoot +"  squareroot");


            while (squareRoot>0){
                mod = squareRoot % 10;
                kaprekar = kaprekar + (mod*counter);
                counter = counter * 10;
                //kaprekar = kaprekar + (mod*counter);
                squareRoot = squareRoot / 10;
//            System.out.println(mod+ "         Mod");
//            System.out.println(kaprekar+ "    Kaprekar");
//            System.out.println(counter +"   counter");
//            System.out.println(squareRoot +"  squareroot");
                //System.out.println(kaprekar+squareRoot + "Total of kaprekar and squareroot");



                if (squareRoot+kaprekar==a ){
                    System.out.println("Karprekar Number");
                    return;
                }

            }
            if (squareRoot+kaprekar!=a ){
                System.out.println("Not A Karprekar Number");

            }
        }
}
