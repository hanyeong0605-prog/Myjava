package ch06_abstract_interface.cafeinterface;

import ch05_heritance.mybeverage.Beverage04;
import ch05_heritance.mybeverage.Espresso04;
import ch05_heritance.mybeverage.Latte04;

public class InheTest05 {
    static void main(String[] args) {
        Beverage05.STORE_NAME="하하하";
        System.out.println("어서 오세요~~" + Beverage05.STORE_NAME + "입니다.");

        //부모 타입을 사용한 배열 생성.
        Beverage05[] orderList = {
                new Americano05("아메리카노", 5000, 200),
                new Espresso05("에스프레소", 3000, 2),
                new Latte05("라떼", 6000, "붜눼네우유"),
                new SpecialCoffee05("스페셜 커피", 10000, 300, 65, "막걸리"),
                new Cappuccino05("카푸씌노", 4000, "비눗방울", 300.345)
        }; // orderList주문목록 배열 생성.

        System.out.println("주문 잔수 : " + Beverage05.getBeverageCount());

        System.out.println("향상 for문을 활용한 출력");
        for (Beverage05 item : orderList) {
            System.out.println("-----------------------------------------");
            System.out.println(item);


            if (item instanceof Americano05) {
                ((Americano05) item).adjustWater(150);
            } else if (item instanceof Espresso05) {
                ((Espresso05) item).AddShot(1);
            } else if (item instanceof Latte05) {
                ((Latte05) item).changeMilk("맛있는 우유 GT");

            } else if (item instanceof SpecialCoffee05) {
                ((SpecialCoffee05) item).adjustWater(200);
                ((SpecialCoffee05) item).AddShot(5);
                ((SpecialCoffee05) item).changeMilk("쏘쥬");
            }
            else if (item instanceof Cappuccino05) {
                ((Cappuccino05) item).addmilk("보글보글 비눗비눗방울");
                ((Cappuccino05) item).addfoam(30.0);

            }

            item.drink();

        }

    }

        }



