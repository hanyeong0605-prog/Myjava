package PoketMonster01;

public class AtPoketMon extends PoketMon {
    double atk; // 공격력 수치
    String skillname1; // 이거는 포켓몬 스킬 1번
    String skillname2; // 이거는 포켓몬 스킬 2번

    public AtPoketMon(String name, String type, String skillname1, String skillname2) {
        super(name, type);
        this.atk = atk;
        this.skillname1 = skillname1;
        this.skillname2 = skillname2;
    }

    public double getAtk() {
        return atk;
    }

    public String getSkillname1() {
        return skillname1;
    }

    public String getSkillname2() {
        return skillname2;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
