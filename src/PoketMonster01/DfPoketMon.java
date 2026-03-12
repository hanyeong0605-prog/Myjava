package PoketMonster01;

public class DfPoketMon extends PoketMon {
    double health; // 수비 포켓몬의 체력.
    boolean isAlive; // 수비 포켓몬 생존여부.

    public DfPoketMon(String name, String type,double health, boolean isAlive) {
        super(name, type);
        this.health = health;
        this.isAlive = isAlive;
    }

    public double getHealth() {
        return health;
    }

    public boolean isAlive() {
        return isAlive;
    }

    @Override
    public String toString() {
        return super.toString();

    }
}
