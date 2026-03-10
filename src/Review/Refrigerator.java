package Review;

public class Refrigerator extends Appliance {


    boolean issmart;




        @Override
        public void showinfo() {

            super.showinfo();
            if (issmart) {
                System.out.println("스마트 기능을 지원합니다.");}
            else{

                System.out.println("스마트 냉장고가 아닙니다.");
            }

    }
}
