package Part02.ch07;

public class Program {
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
                    lottos = createLottosManual();
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

    private static void printLottos(int[][] lottos){
        char[][] names = new char[3][10];
        double cnt = printz(true,4.0,names);
    }

    private static int[][] createLottosManual() {
        return null;
    }

    private static int[][] createLottosAuto() {
        return null;
    }

    private static int inputMenu() {
        return 0;
    }

    private static void print(int a,float b, char c){

    }

    private static double printz(boolean a, double b,char[][] c){
        return 2.2;
    }
}
