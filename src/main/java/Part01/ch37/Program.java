package Part01.ch37;

import java.util.Scanner;

//다차원배열로 변경2
public class Program {
    public static void main(String[] args) {

        int[][] kors = new int[3][3];
        int total;
        float avg;
        int menu;

        Scanner scan = new Scanner(System.in);

        for (int j = 0; j < 3; j++){
            for (int i = 0; i < 3; i++){
                kors[j][i]=0;
            }
        }


        종료:
        while (true){
            /*메인 메뉴 부분*/
            System.out.println("┌────────────────────────────────────┐");
            System.out.println("│              메인 메뉴               │");
            System.out.println("└────────────────────────────────────┘");
            System.out.println("\t1.성적입력:");
            System.out.println("\t2.성적출력:");
            System.out.println("\t3.종료:");
            System.out.print("\t> ");
            menu = scan.nextInt();

            switch (menu){
                case 1:
                    /*성적 입력 부분*/
                    System.out.println("┌────────────────────────────────────┐");
                    System.out.println("│              성적 입력               │");
                    System.out.println("└────────────────────────────────────┘");

                    for (int j = 0; j < 3; j++){
                        for (int i = 0; i < 3; i++){
                            do {
                                System.out.printf("\t%d학년 국어%d:",j+1,i+1);
                                kors[j][i] = scan.nextInt();
                                if(kors[j][i] < 0 || 100 < kors[j][i])
                                    System.out.println("성적범위(0~100)를 벗어났습니다.");
                            }while (kors[j][i] < 0 || 100 < kors[j][i]);
                        }
                    }


                    break;
                case 2:
                    //성적 출력 부분
                    //total = kor1 + kor2 + kor3;1


                    System.out.println("┌────────────────────────────────────┐");
                    System.out.println("│              성적 출력               │");
                    System.out.println("└────────────────────────────────────┘");

                    for (int j = 0; j<3; j++){
                        System.out.printf("<%d학년 국어성적>--------------\n",j+1);
                        for (int i = 0; i < 3; i++){
                            System.out.printf("\t국어%d : %3d\n",i+1, kors[j][i]);
                        }
                        total = kors[j][0] + kors[j][1] + kors[j][2];
                        avg = total / 3.0f;
                        System.out.printf("\t총점 : %3d\n", total);
                        System.out.printf("\t평균 : %6.2f\n",avg);
                        System.out.println("──────────────────────────────────────");
                    }



                    System.out.println("──────────────────────────────────────");
                    break;
                case 3:
                    break 종료;
                default:
                    System.out.println("입력 오류 1~3까지만 입력가능합니다.");
            }
        }
        System.out.println("종료합니다~~~~~");
    }
}
