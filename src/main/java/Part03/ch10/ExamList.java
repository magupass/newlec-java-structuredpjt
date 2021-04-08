package Part03.ch10;

import java.util.Scanner;

public class ExamList {
    Exam[] exams;
    int current;


    void printList(){
        printList(current);
    }

    public void printList(int size) {
        System.out.println("┌───────────────────────────┐");
        System.out.println("│           성적  출력        │");
        System.out.println("└───────────────────────────┘");
        System.out.println();

        //int size = list.current;

        for (int i = 0; i < size; i++) {
            Exam exam = this.get(i);//this.exams[i];
            int kor = exam.getKor();
            int eng = exam.getEng();
            int math = exam.getMath();

            int total = exam.total();//kor + eng + math;
            float avg = exam.avg();//total / 3.0f;

            System.out.printf("국어 : %d\n", kor);
            System.out.printf("영어 : %d\n", eng);
            System.out.printf("수학 : %d\n", math);

            System.out.printf("총점 : %3d\n", total);
            System.out.printf("평균 : %6.2f\n", avg);
            System.out.println("─────────────────────────────");
        }
    }

    private Exam get(int i) {
        return this.exams[i];
    }

    public void inputList() {
        Scanner scan = new Scanner(System.in);
        System.out.println("┌───────────────────────────┐");
        System.out.println("│           성적  입력        │");
        System.out.println("└───────────────────────────┘");
        System.out.println();

        int kor,eng,math;

        do {
            System.out.printf("국어:");
            kor = scan.nextInt();

            if(kor < 0 || 100 < kor)
                System.out.println("국어성적은 0~100까지의 범위만 입력이 가능합니다.");
        }while(kor < 0 || 100 < kor);

        do {
            System.out.printf("영어:");
            eng = scan.nextInt();

            if(eng < 0 || 100 < eng)
                System.out.println("영어성적은 0~100까지의 범위만 입력이 가능합니다.");
        }while(eng < 0 || 100 < eng);

        do {
            System.out.printf("수학:");
            math = scan.nextInt();

            if(math < 0 || 100 < math)
                System.out.println("수학성적은 0~100까지의 범위만 입력이 가능합니다.");
        }while(math < 0 || 100 < math);

        Exam exam = new Exam(kor,eng,math);

        /*----여기까지 사용자 입력 처리 부분---------------------------------*/
        /*----여기서 부터 데이터 추가 작업---------------------------------*/

        add(exam);

    }

    private void add(Exam exam) {
        Exam[] exams = this.exams;
        int size = current;

        if (exams.length == size){
            //1. 크기가 더 큰 새로운 배열 생성
            Exam[] temp = new Exam[size + 5];
            //2. 값의 이동
            for (int i = 0; i < size ; i++){
                temp[i] = exams[i];
            }
            //3. list.exams가 새로만든 temp배열을 참조하도록 조정
            exams = temp;
        }

        exams[current] = exam;
        current++;
    }

    public ExamList() {
        exams = new Exam[3];
        current = 0;
    }
}