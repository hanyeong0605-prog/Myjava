package PoketMonster01;

public class PoketMon {
   private String  name;//이거는~ 푸키몬 이름~
   private String type;//이거는 물불전기 타입~

   public PoketMon(String name, String type) {
      this.name = name;
      this.type = type;

   }

   public String getName() {
      return name;
   }

   public String getType() {
      return type;
   }

   @Override
   public String toString() {
      return "";
   }
}
