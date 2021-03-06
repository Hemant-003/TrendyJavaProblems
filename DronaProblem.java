//TARGET PRACTICE
//        Drona normally trains his disciples using a board which consists of concentric circles. When the student correctly hits the center of the concentric circles, his score is 100. The score gets reduced depending on where the students hit on the board. When the student hits outside the board, his score is 0. Drona will not allow a student to have his food unless he scores 100. Arjuna will always hit the target in his first attempt and he will leave early.
//        Others may take more turns to reach the score of 100.
//        Can you write a program to determine the number of turns a disciple takes to reach the target score of 'n' ?
//
//
//
//        Input Format:
//        Input consists of a list of positive integers. The first integer corresponds to the target score 'n'. Assume that all the other integers input are less than or equal to n.
//
//        Output Format:
//        Output consists of a single line. Refer sample output for format details.
//
//        Sample Input 1:
//        100
//        4
//        40
//        60
//        Sample Output 1:
//        The number of turns is 3
//
//        Sample Input 2:
//        1000
//        1000
//        Sample Output 2:
//        The number of turns is 1

import java.util.Scanner;
public class DronaProblem {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
//        int try1= 25;
//        int try2 = 30;
//        int try3 = 80;
//        int try4= 90;


        int Target = scanner.nextInt();
        Integer Achievemnt = 0;
        int Count = 0;
        while (Achievemnt < Target) {
            int try1 = scanner.nextInt();
            Achievemnt = Achievemnt + try1;
            Count++;
        }
        if (Achievemnt >= Target) {
            System.out.println("The number of turns is " + Count);
        }
    }
}
