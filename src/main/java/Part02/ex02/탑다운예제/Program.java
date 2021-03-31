package Part02.ex02.탑다운예제;

import java.util.Random;
import java.util.Scanner;

//예습
public class Program {
    public static void main(String[] args) {

        int[][] lottos = null;
        int menu;
        boolean running = true;

        while (running){

            menu = inputMenu();

            switch (menu){
                case 1:
                    System.out.println("1을 눌렀습니다.");
                    lottos = createLottosAuto();
                    break;
                case 2:
                    System.out.println("2를 눌렀습니다.");
                    lottos = createLottosManual();
                    break;
                case 3:
                    System.out.println("3을 눌렀습니다.");
                    printLottos(lottos);
                    break;
                case 4:
                    System.out.println("4를 눌렀습니다.");
                    running = false;
                    break;
                default:
            }
        }

    }

    private static void printLottos(int[][] lottos) {
    }

    private static int[][] createLottosManual() {

        int cnt;
        int cnt1;
        Scanner scan = new Scanner(System.in);
        Scanner scan1 = new Scanner(System.in);
        System.out.println("\t생성할 개수를 입력하세요(종료:0) ");
        cnt = scan.nextInt();
        System.out.println("\t생성할 개수 :" + cnt);

        for (int j = 0; j < cnt; j++){
            System.out.printf("인덱스 %d : ",j+1);
            System.out.println();
            for(int i=0;i<6;i++) {
                cnt1 = scan1.nextInt();
                System.out.printf("[%d]",cnt1); //로또번호 출력
                System.out.println();
            }

        }

        System.out.println();

        return null;
    }

    private static int[][] createLottosAuto() {
        int cnt;
        Scanner scan = new Scanner(System.in);
        System.out.println("\t생성할 개수를 입력하세요(종료:0) ");
        cnt = scan.nextInt();
        System.out.println("\t생성할 개수 :" + cnt);

        for (int j = 0; j < cnt; j++){
            System.out.printf("인덱스 %d : ",j+1);
            Random rd = new Random();//랜덤 객체 생성
            for(int i=0;i<6;i++) {
                int lotNum;
                lotNum = rd.nextInt(45)+1;
                System.out.print("["+lotNum+"]"); //로또번호 출력
            }
            System.out.println();
        }

        System.out.println();

        return null;
    }

    private static int inputMenu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("┌───────────────────────────┐");
        System.out.println("│       Lotto관리 프로그램    │");
        System.out.println("└───────────────────────────┘");
        System.out.println("\t1. 번호자동생성 ");
        System.out.println("\t2. 번호수동생성 ");
        System.out.println("\t3. 내 번호 보기 ");
        System.out.println("\t4. 종료 ");
        System.out.println("\t선택> ");
        int menu = scan.nextInt();

        return menu;
    }
}
