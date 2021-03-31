package Part02.ex02.탑다운예제;

import java.util.Random;
import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {

        int[][] lottos = null;
        int menu;
        boolean running = true;

        while (running){
            menu = inputMenu();

            switch (menu){
                case 1:
                    lottos = createLottosAuto();
                    break;
                case 2:
                    lottos = createLottoManual();
                    break;
                case 3:
                    printLottos(lottos);
                    break;
                case 4:
                    running = false;
                    break;
                default:
            }
        }



    }

    private static void printLottos(int[][] lottos) {
    }

    private static int[][] createLottoManual() {
        return null;
    }

    private static int[][] createLottosAuto() {
        return null;
    }

    private static int inputMenu() {
        return 0;
    }


}
