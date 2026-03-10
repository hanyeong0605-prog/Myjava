package ch05_heritance;

public class Animal {

    String name;
    int age;
    String feed; // 먹이

    @Override // 얘는 object의 메서드를 호출(오버라이팅)한거.
    public String toString() {
        // 메소드 은닉화 :오버라이딩시 본의 아니게 메소드 접근이 막히는 현상
        String imsi = "이름 : " + name + ", 나이"+ age + ", 먹이" + feed;
        return imsi;

    }

    //eat(), bark()

    public void eat() {
        System.out.println(name + "(이/가)" + feed + "(를/을) 먹습니다.");

    }

    public  void bark() {
        System.out.println(name + "(이/가)" + "짖습니다." );
    }

    public void display() {
        System.out.println("이름 : "+name);
        System.out.println("나이 : "+age);
//        System.out.println(" : "+guide);
//        System.out.println(" : "+indoor);

    }

}
