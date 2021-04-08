package Part03.ch12;

public class ExamList {
    private Exam[] exams;
    private int current;

    public Exam get(int i) {
        return this.exams[i];
    }

    public void add(Exam exam) {
        Exam[] exams = this.exams;
        int size = this.current;

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

    public int size() {
        return current;
    }
}
