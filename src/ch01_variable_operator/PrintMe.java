package ch01_variable_operator;

public class PrintMe {
    static void main() {
        //이름 나이 키 몸무게 혈액형 Type 진위
        //변수 정의
        String name ;
        int age ;
        double height, weight ;
        String blood ;
        char type ;
        boolean bool ;


        name = "김한영";
        age = 27;
        height = 177.1;
        weight = 72.2;
        blood = "A";
        type = 'B';
        bool = true;

        System.out.println("이름은 : "+ name);
        System.out.println("나이는 : "+ age );
        System.out.println("키는 : "+ height);
        System.out.println("몸무게는 : "+ weight);
        System.out.println("혈액형은 : "+ blood);
        System.out.println("타입은 : "+ type);
        System.out.println("진위 : " +bool);


    }
}
