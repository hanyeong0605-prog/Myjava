package ch02_control_statement;

public class For01 {
    static void main(String[] args) {
        // 1부터 10까지의 총합
        int total = 0;

        for (int i = 0;    i < 11    ; i= i+1) {
            total += i;
        }

        System.out.println("총합 : " + total); //55

        total = 0;
        for (int i = 1; i <=100; i+=3) {
            total += i;
        }

        System.out.printf(" 1부터 100 까지의 연산 : %d\n",total);

        total = 0;
        for (int i = 97; i > 1; i-=5) {
            total += i;
        }
            System.out.println("결과 : " +total);

        total = 0;
        for (int i = 1; i < 97; i=i+5)
            total = total+(i*i);
        System.out.println("결과 : " +total);

    }
}

/*
total(생성)    i(생성)
0                1
0+1            2
1+2      3
3+3      4
6+4      5
10+5      6
15+6      7
21+7      8
28+8      9
36+9      10
45+10   11(소멸)
출력
total(소멸)
*/