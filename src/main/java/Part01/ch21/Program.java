package Part01.ch21;

import java.util.Scanner;

public class Program {

    static int[] kors = new int[3];

    public static void main(String[] args) {

        int aaa =1;
        Scanner scan = new Scanner(System.in);


        while (aaa!=3){
            aaa = scan.nextInt();
            switch (aaa){
                case 1:
                    inputExam();
                    break;
                case 2:
                    printExam();
                    break;
                case 3:
                    break;
                default:
            }
        }

    }

    static void inputExam(){
        Scanner scan = new Scanner(System.in);

        /*성적 입력 부분*/
        System.out.println("┌────────────────────────────────────┐");
        System.out.println("│              성적 입력               │");
        System.out.println("└────────────────────────────────────┘");

        for (int i = 0 ; i < 3; i++){
            System.out.printf("\t국어%d: ", i+1);
            kors[i] = scan.nextInt();
        }
    }

    static void printExam(){
        int total;
        float avg;
        /*성적 출력 부분*/
        total = kors[0] + kors[1] + kors[2];
        avg = total / 3.0f;

        System.out.println("┌────────────────────────────────────┐");
        System.out.println("│              성적 출력               │");
        System.out.println("└────────────────────────────────────┘");

        System.out.printf("\t국어1: %d\n",kors[0]);
        System.out.printf("\t국어2: %d\n",kors[1]);
        System.out.printf("\t국어3: %d\n",kors[2]);
        System.out.printf("\t총점 : %d\n",total);
        System.out.printf("\t평균 : %.2f\n",avg);
        System.out.println("──────────────────────────────────────");
    }

}
