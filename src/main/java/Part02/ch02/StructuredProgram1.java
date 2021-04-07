package Part02.ch02;

import java.util.Scanner;

// 코드분리1
// 1) 분리영역 별도 함수 생성
// 2) 공통사용 변수 main method에서 전역으로 이동, 변수명에 static 키워드 추가
public class StructuredProgram1 {

    static int[] kors = new int[3];

    public static void main(String[] args) {



        int total = 0;
        float avg;
        int menu;
        boolean keepLoop = true;

        Scanner scan = new Scanner(System.in);

        while(keepLoop)
        {
            System.out.println("┌───────────────────────────┐");
            System.out.println("│           메인 메뉴         │");
            System.out.println("└───────────────────────────┘");
            System.out.println("\t1. 성적입력 ");
            System.out.println("\t2. 성적출력 ");
            System.out.println("\t3. 종료 ");
            System.out.println("\t선택> ");
            menu = scan.nextInt();

            switch(menu) {
                case 1:

                    성적입력();

                    break;
                case 2:

                    for(int i=0; i<3; i++)
                        total += kors[i];

                    avg = total / 3.0f;

                    System.out.println("┌───────────────────────────┐");
                    System.out.println("│           성적  출력        │");
                    System.out.println("└───────────────────────────┘");
                    System.out.println();

                    for(int i=0;i<3;i++)
                        System.out.printf("국어 %d : %3d\n", 3-i, kors[i]);

                    System.out.printf("총점 : %3d\n", total);
                    System.out.printf("평균 : %6.2f\n", avg);
                    System.out.println("─────────────────────────────");

                    break;
                case 3:
                    System.out.println("Bye~~");

                    keepLoop = false;
                    break;

                default:
                    System.out.println("잘못된 값을 입력하셨습니다. 메뉴는 1~3까지입니다.");

            }

        }
    }

    static void 성적입력(){

        Scanner scan = new Scanner(System.in);
        System.out.println("┌───────────────────────────┐");
        System.out.println("│           성적  입력        │");
        System.out.println("└───────────────────────────┘");
        System.out.println();

        for(int i=0; i<3; i++)
            do {
                System.out.printf("국어%d : ", i+1);
                kors[i] = scan.nextInt();

                if(kors[i] < 0 || 100 < kors[i])
                    System.out.println("국어성적은 0~100까지의 범위만 입력이 가능합니다.");

            }while(kors[i] < 0 || 100 < kors[i]);

        System.out.println("─────────────────────────────");
    }
}
