package ch04_class;

public class NBAMain2 {

    public static void main(String[] args) {


        NBA2 First = new NBA2("Stephen Curry", "GoldenState Warriors", 30, 10);


        String Ranking = First.MVP();


        First.show();


        System.out.println("선수의 능력치 : " + Ranking);


        int size = 3;
        System.out.println("여기서부터는 배열로 선수 이름 표기.");
        int[] arr = new int[3];


        NBA2[] List = new NBA2[size];

        List[0] = new NBA2("Lebron James", "LA Lakers", 23, 30);
        List[1] = new NBA2("Kevin Durand", "Huston Rokets", 35, 22);
        List[2] = new NBA2("Damian Lillard", "Potland Trailblazers", 0, 23);


        for (int i = 0; i < List.length; i++) {
            System.out.println(i + "번째 선수 정보 : ");
            List[i].show();
        }
        System.out.println("------------------------------------------");
        System.out.println("현재 NBA TEAM들 상위 5등.");

        NBA2[] TeamRankingArray = {
            new NBA2("오클라호마 시티","미네소타","샌안토니오","휴스턴","LA")

        };
        for (int i = 0; i < TeamRankingArray.length ; i++) {
            System.out.print("서부 컨퍼런스 순위 :");
            TeamRankingArray[i].showTeamRank();

        }

    }

}
