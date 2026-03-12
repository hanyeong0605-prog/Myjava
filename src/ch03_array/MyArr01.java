package ch03_array;

public class MyArr01 {
    static void main(String[] args) {
        int x = 3;
        int y = 5;
        //배열 정의 : 정수 3개를 배열로 만들기.
        // 타입[] 배열 이름 = new 타입 [요소개수];
        // 요소 개수는 "배열이름.length" 라는 메소드로 접근이 가능합니다.
        // new 연산자를 사용하여 배열 정의


        int[] arr = new int[3]; // arr은 배열 이름입니다. 배열은 0부터 시작.

        //확장 for문

        arr[0] = x - y + 6;  // 0번 주소에 4 저장.
        arr[2] = arr[0] + 3; // 2번 주소에 7 저장.
        arr[1] = arr[0] + arr[2];

        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }

        for (int result : arr)
            System.out.println(result);
        System.out.println("-----------------------------------------------------");


        //방법02: 초기화 기법.
        int[] brr = {15, 30, 22};  // 배열 개수 3개
        for (int i = 0; i < brr.length ; i++) {

            System.out.println(brr[i]);

        }
        for (int result2 : brr)
            System.out.println(result2);
        System.out.println("-----------------------------------------------------");



    }
}
