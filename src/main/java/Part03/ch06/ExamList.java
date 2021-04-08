package Part03.ch06;

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
        Exam[] exams = this.exams;

        for (int i = 0; i < size; i++) {

            Exam exam = exams[i];

            if (exam == null){
                System.out.println("입력한 값이 없습니다. 성적을 입력하세요");
                return;
            }

            int kor = exam.kor;
            int eng = exam.eng;
            int math = exam.math;

            int total = kor + eng + math;
            float avg = total / 3.0f;

            System.out.printf("국어 : %d\n", kor);
            System.out.printf("영어 : %d\n", eng);
            System.out.printf("수학 : %d\n", math);

            System.out.printf("총점 : %3d\n", total);
            System.out.printf("평균 : %6.2f\n", avg);
            System.out.println("─────────────────────────────");
        }
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

        Exam exam = new Exam();
        exam.kor = kor;
        exam.eng = eng;
        exam.math = math;

        Exam[] exams = this.exams;
        int size = current;

        //exams의 추가입력 가능한 공간이 없을 경우 배열의 크기 증가
        //1.amount개 확장한 새로운 배열 temp를 생성
        //2. list에 있는 데이터를 temp배열로 이동
        //3. temp가 참조하는 객체를 list가 참조하도록 변경
        //4. 현재 capacity의 값을 +10증가 조치
        //if(list.exams.length == list.current)
        //System.out.println("list.exams.length: " + list.exams.length);
        //System.out.println("list.current: " + list.current);

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
