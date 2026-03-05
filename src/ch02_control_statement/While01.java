package ch02_control_statement;

public class While01 {
    static void main(String[] args) {
        int total = 0;
        int i = 1;
        while (i<11) {
            //total = total + i;
            i++; // i는 2 3 4 5 6 7 8 9 10 i = i + 1
            total = total + i; // 얘는 i가 11이 되면 끝나 10까지 실행.

        }


        System.out.println("총합01 : " + total);

        total = 0;
        i = 1;
        while (i <= 100) {
            total += i;
            i+=3;
        }
        System.out.println("총합01 : " + total);

        total = 0;
        i = 97;
        while (i >= 2) {
            total += i;
            i = i-5;
        }
        System.out.println("총합01 : " + total);

        total = 0;
        i = 1;
        while (i < 97) {
            total = total + (i * i);
            i = i+5;
        }
        System.out.println("총합01 : " + total);
    }
}
