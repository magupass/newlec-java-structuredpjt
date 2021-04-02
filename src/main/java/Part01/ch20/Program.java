package Part01.ch20;

public class Program {
    public static void main(String[] args) {
        int kor1, kor2, kor3;
        int total;
        float avg;

        kor1 = 55;
        kor2 = 65;
        kor3 = 77;

        total = kor1 + kor2 + kor3;
        avg = total / 3.00f;

        /*성적 출력 부분*/
        System.out.println("┌────────────────────────────────────┐");
        System.out.println("│              성적 출력               │");
        System.out.println("└────────────────────────────────────┘");

        System.out.printf("\t국어1: %d\n",kor1);
        System.out.printf("\t국어1: %d\n",kor2);
        System.out.printf("\t국어1: %d\n",kor3);
        System.out.printf("\t총점: %d\n",total);
        System.out.printf("\t평균: %.2f\n",avg);
        System.out.println("──────────────────────────────────────");

    }
}
