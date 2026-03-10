package ch05_heritance;

public class Cat extends Animal {

    boolean indoor; // 애완묘, 길고양이

    @Override
    public void bark() {
        System.out.println(super.name + "으하하하"+ "하고 울어버립니다.");
    }

    @Override
    public void display() {

        super.display();
        if(indoor){
            System.out.println("집고양이 여부 : 맞음");
        }else{
            System.out.println("집고양이 여부 : 아님");

        }

    }

}


