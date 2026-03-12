package PoketMonster01;

import java.util.Scanner;

public class PoketMonMain {
    static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int select;

        PoketMon poketMon1 = new AtPoketMon("파치리스","전기", "천만볼트","번개");
        PoketMon poketMon2 = new AtPoketMon("피카츄","전기", "백만볼트","전기쇼크");
        PoketMon poketMon3 = new DfPoketMon("꼬부기","물", 100, true);
        PoketMon poketMon4 = new DfPoketMon("잉어킹","물", 100, true);

        System.out.println("-----------------------------------------");
        System.out.println("사용하실 포켓몬을 골라주세요 : 1.파치리스 2.피카츄");
        System.out.println("-----------------------------------------");
        System.out.print(">>");
        select = scan.nextInt();
        if (select == 1) {
            AtPoketMon myAtk = (AtPoketMon) poketMon1;
            System.out.println("<선택하신 포켓몬 이름>");
            System.out.println(poketMon1.getName());
            System.out.println("타입: "+ poketMon1.getType()+"타입");
            System.out.println("보유중인 기술: "+myAtk.getSkillname1()+" , "+myAtk.getSkillname2());


        }
            else if (select == 2) {
            AtPoketMon myAtk = (AtPoketMon) poketMon2;
            System.out.println("<선택하신 포켓몬 이름>");
            System.out.println(poketMon2.getName());
            System.out.println("타입: "+ poketMon2.getType()+"타입");
            System.out.println("보유중인 기술 >>"+myAtk.getSkillname1()+" , "+myAtk.getSkillname2());

            }
            else {
            System.out.println("잘못된 입력입니다. 1번 아니면 2번으로 골라주세요.");
        }


    }
}
