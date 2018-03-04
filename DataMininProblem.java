//DATA MINING
//        In the University Examinations conducted during the past 5 years, the toppers registration numbers were  7126, 82417914, 7687 and 6657. Your father is an expert in data mining and he could easily infer a pattern in the toppers registration numbers. In all the registration numbers listed here, the sum of the odd digits is equal to the sum of the even digits in the number. He termed the numbers that satisfy this property as Probable Topper Numbers.
//        Write a program to find whether a given number is a probable topper number or not.
//
//
//        Input Format:
//        Input consists of a single integer.
//
//        Output Format:
//        Output consists of a single line. Refer sample output for details.
//
//        Sample Input 1:
//        143
//        Sample Output 1:
//        yes
//
//        Sample Input 2:
//        344
//        Sample Output 2:
//        no
import java.util.Scanner;
public class DataMininProblem {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int k = i;
        int count = 0;

        while (i > 0) {
            //System.out.println( i % 10);
            i = i / 10;
            count++;
        }

        int[] array = new int[count];
        //System.out.println(array.length);

        while (k > 0) {
            for (int j = 0; j < array.length; j++) {

                array[j] = (k % 10);
                k = k / 10;
            }

        }
        int odd = 0, even = 0;
        for (int j = 0; j < array.length; j++) {
            if ((j + 1) % 2 == 0) {
                even = even + array[j];
            } else {
                odd = odd + array[j];
            }
        }

//                for (int l = 0;l<array.length;l++){
//                    System.out.println(array[l]);
//                }
        //System.out.println(odd +""+ even);
        if (odd == even) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
