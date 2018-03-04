import java.util.Scanner;
public class AmoebaProblem {


        static int n1=0,n2=1,n3=0;
        static int printFibonacci(int count) {
            if (count > 0) {
                n3 = n1 + n2;
                n1 = n2;
                n2 = n3;

                printFibonacci(count - 1);
            }
            return n3;
        }
        public static void main(String args[]){
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the number of Months");
            int count = s.nextInt();

            if (count ==0 || count ==1){
                System.out.println("The amoeba size is " +count);
            }else {//System.out.print(n1+" "+n2);//printing 0 and 1
                printFibonacci(count-2);//n-2 because 2 numbers are already printed
                System.out.println("The amoeba size is " +n3);
            }
        }
}
