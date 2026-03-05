package ch02_control_statement;

public class SumOneToN {
    static void main(String[] args) {
        int n = 5;
        int total = 0;
        for (int i = 1; i <= n; i++) {
            total = total + i;
        }

        System.out.println("1부터"+n+"까지의 총합은"+total+"입니다.");
    }
}
