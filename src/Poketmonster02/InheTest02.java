package Poketmonster02;

public class InheTest02 {
    static void main() {
        Poketmonster02 Monster01 = new Attack02("파치리스", "전기",100 );
        Poketmonster02 Monster02 = new Attack02("꼬부기", "물", 100);
        Poketmonster02 Monster03 = new Defense02("잉어킹","물",100);
        System.out.println("name : "+Monster01.getName());
        System.out.println("type : "+Monster01.getType());
    }
}
