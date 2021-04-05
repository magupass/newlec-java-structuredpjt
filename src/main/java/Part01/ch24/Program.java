package Part01.ch24;

import java.util.Scanner;

public class Program {

    static int[] kors = new int[3];

    public static void main(String[] args) {

        int kor1,kor2,kor3;
        int total;
        float avg;
        Scanner scan = new Scanner(System.in);
        kor1 = 0;
        kor2 = 0;
        kor3 = 0;

        /*성적 입력 부분*/
        System.out.println("┌────────────────────────────────────┐");
        System.out.println("│              성적 입력               │");
        System.out.println("└────────────────────────────────────┘");
        System.out.print("국어1:");
        kor1 = scan.nextInt();
        System.out.println(0 <= kor1 && kor1 <= 100?"유효합니다.":"유효하지 않습니다.");
        System.out.print("국어2:");
        kor2 = scan.nextInt();
        System.out.print("국어3:");
        kor3 = scan.nextInt();


        /*성적 출력 부분*/
        total = kor1 + kor2 + kor3;
        avg = total / 3.0f;

        System.out.println("┌────────────────────────────────────┐");
        System.out.println("│              성적 출력               │");
        System.out.println("└────────────────────────────────────┘");

        System.out.printf("\t국어1: %d\n",kor1);
        System.out.printf("\t국어2: %d\n",kor2);
        System.out.printf("\t국어3: %d\n",kor3);
        System.out.printf("\t총점 : %d\n",total);
        System.out.printf("\t평균 : %.2f\n",avg);
        System.out.println("──────────────────────────────────────");


    }


}
