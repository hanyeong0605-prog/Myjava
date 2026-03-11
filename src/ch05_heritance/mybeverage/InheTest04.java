package ch05_heritance.mybeverage;
public class InheTest04 {
    static void main(String[] args) {
        //승급(업캐스팅) : 낮은 등급의 클래스가 높은 등급의 클래스 타입으로 한시적 형태가 바뀌는 동작
        //전제 조건 : 반드시 상속 관계이어야 합니다. 부모클래스 입장에서 자식클래스를 구분하고 쓰는데 쉽게 하기 위해서.
        Beverage04 beverage01 = new Americano04("아메리카노", 4000.0, 200.0);
        Beverage04 beverage02 = new Espresso04("에스프레소", 5000.0, 2);
        Beverage04 beverage03 = new Latte04("라뗴", 6000.0, "아몬드우유");


        //슈퍼클래스내 들어 있는 메소드는 상속의 개념에 의하여 접근이 가능합니다.


        beverage01.showInfo();
        Americano04 coffee = (Americano04) beverage01; //강등.명시적 형변환.(강제로 생성자 바꿔버리기)
        coffee.sipAmericano();

        beverage02.showInfo();
        Espresso04 shot = (Espresso04) beverage02;
        shot.drinkEspresso();

        beverage03.showInfo();
        Latte04 milk = (Latte04) beverage03;
        milk.selectmilk();


        Beverage04[] beverage = {
                beverage01,
                new Espresso04("마이뿌레소", 2000.0, 1),
                new Latte04("보내나 라뗴", 7000.0, "바나나 우유")
        };
        for (int i = 0; i < beverage.length ; i++)
        {

            System.out.println("-------------------------------------------");
            beverage[i].showInfo();


            //instanceof : 승급된 객체 변수가 수많은 서브 클래스 중에서 어떤 클래스로
            //생성이 되었는 지를 판단하고자 할때 사용합니다.
            if(beverage[i] instanceof Americano04) { // 아메리카노  [i]번째
                //객체를 아메리카노 클래스로 만든거 맞니
                Americano04 ameri = (Americano04)beverage[i]; //강등시킴
                ameri.sipAmericano();
            }
            else if(beverage[i] instanceof Espresso04) {

                Espresso04 esspress = (Espresso04) beverage[i];
                esspress.drinkEspresso();// 에스프레소


            } else if(beverage [i] instanceof Latte04) {
                Latte04 latt = (Latte04)beverage[i];
                latt.selectmilk();// 라떼


            }
            else {


            }

            System.out.println(beverage[i]);//beverage는 객체를 출력하라는 말인데
            //암시적으로 toString 하라는 것과 같대.
            //객체를 프린트하면 암시적으로 toString() 메소드가 호출이 됩니다.
            //상속받았기 때문에 이런식(주소값)으로 나옴.
            //데이터로 받고싶으면 재정의 해줘야함. Overriding.



        }
    }
    }


