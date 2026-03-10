package ch05_heritance;


//상속을 해주는 Animal 클래스를 Dog 클래스가 상속을 받습니다.
//class 서브 클래스 extends 수퍼클래스
// 수퍼클래스 = 부모클래스,
// 서브클래스 = 자식클래스


public class Dog extends Animal {
    boolean guide; //안내견 여부


    @Override
    public void bark() {
        System.out.println(name+"이(가) 멍멍하고 짖습니다." +age);
    }

    @Override // Animal부모 클래스의 display라는 메소드를 자식이 다시 정의하기위해
    //override 시킴. (상속 관계에서 해당) 참고로 overloading은 같은 클래스 내에서만 가능.
    public void display() {

        super.display(); // super는 부모클래스이니. super.display는 animal.display와 같은느낌
        if(guide){
            System.out.println("안내견 여부 : 적합");
        }else{
            System.out.println("안내견 여부 : 부적합");
        }






    }

}
