package ch04_class;

public class Jumsu {

    private String name = "";
    private int kor;
    private int math;
    private int eng ;

    private int total;
    private double average;


    public void setName(String name, int kor, int math, int eng   ) {
        if (name==null || kor<0 || math<0 || eng<0 ) {
            System.out.print("오류");
            return;
        }

        this.name = name;
        this.kor = kor;
        this.math = math;
        this.eng = eng;
    }

//    public void setKor(int kor) {
//        this.kor = kor;
//    }
//    public void setMath(int math) {
//         this.math = math;
//    }
//    public void setEng(int eng) {
//         this.eng = eng;
//    }

// 총합 평균을 구하기 위한 메서드를 만들기 위해 getter 선언 해줘야함.
    public void Calc () {
        ADD();
        Avg();
        show_resualt();
    }
    private void Avg() {
        this.average = total/3;
    }
    private void ADD() {
        this.total = kor + math + eng;
    }
    public void show_resualt(){

        for (int i = 0; i <= 5; i++) {
            System.out.println(total+"nu"+average);
        }


    }




}




