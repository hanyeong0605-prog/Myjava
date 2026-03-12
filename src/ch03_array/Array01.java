package ch03_array;

public class Array01 {
    static void main(String[] args) {
        String[] bts = new String[7];
        bts[0] = "진";
        bts[1] = "뷔";
        bts[2] = "정국";
        bts[3] = "RM";
        bts[4] = "지민";
        bts[5] = "슈가";
        bts[6] = "제이홉";

        for (int i = 0; i < bts.length; i++) {

            System.out.println(bts[i]);


        }
        String[] _bts = {"진", "뷔", "정국", "RM", "지민", "슈가", "제이홉"};
        for (int i = 0; i < _bts.length; i++) {

            System.out.println(_bts[i]);
        }
        //----------------------------------------------------//

        // 선입 선출 (FIFO)
        System.out.println("향상된 for 구문");

        //  for(타입 단수이름 : 복수이름) {   <<<< 향상 for?라고 함.
        for (String item : bts) {
            System.out.println(item);


        }
    }
}
