package ch05_heritance;

public class AnimalMain {
   public static void main(String[] args) {
      //어떤 동물인지. 객체 생성>>★ 클래스 이름 객체이름 = new 생성자 이름.★
        Dog retriver = new Dog();  // 리트리버라는 객체 생성.
        retriver.name = "김리트리버";
        retriver.age = 2;
        retriver.feed = "사료";
        retriver.guide = false;

        System.out.println("객체 정보");
        System.out.println(retriver.toString());


        retriver.display(); // 강아지를 상속 받았기 때문에.
        retriver.eat();
        retriver.bark();


        Dog maltese = new Dog();
        maltese.name = "이말티즈";
        maltese.age = 7;
        maltese.feed = "뼉다구";
        maltese.guide = true;

        maltese.display();
        maltese.eat();
        maltese.bark();

        //고양이 :

        Cat persian = new Cat();
        persian.name = "남궁페르시안";
        persian.age = 30;
        persian.feed = "츄르";
        persian.indoor = true;

        persian.display();
        persian.eat();
        persian.bark();


        Cat siamese = new Cat();
        siamese.name = "제갈샴";
        siamese.age = 65;
        siamese.feed = "참치";
        siamese.indoor = false;

        siamese.display();
        siamese.eat();
        siamese.bark();

    }


}
