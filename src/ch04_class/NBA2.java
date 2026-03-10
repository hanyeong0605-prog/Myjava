package ch04_class;

public class NBA2 {
    //변수 선언(멤버 변수)
    private String team;

    private String team0;
    private String team1;
    private String team2;
    private String team3;
    private String team4;

    private String player;
    private int backnumber;
    private int score;

    //변수 정보(NBA정보)

    public NBA2(String player, String team, int backnumber, int score) {
        this.player = player;
        this.team = team;
        this.backnumber = backnumber;
        this.score = score;

    }

    public void show() {
        System.out.println("득점은 : "+player);
        System.out.println("소속팀은 : "+team);
        System.out.println("등번호는 : "+backnumber);
        System.out.println("득점은 : "+score);
    }

    public NBA2(String team0, String team1, String team2, String team3, String team4) {
        this.team0 = team0;
        this.team1 = team1;
        this.team2 = team2;
        this.team3 = team3;
        this.team4 = team4;
    }
    public void showTeamRank() {
        System.out.println(" 1위:" + team0 + ", 2위:" + team1 + ", 3위:" + team2 + ", 4위:" + team3 + ", 5위:" + team4);
    }




    /// /----------------------------------////
    String MVP() {
        if (score >= 30) {
            return ("MVP");
        } else if (score >= 20) {
            return ("All Star");
        } else {
            return ("Bench");

        }
    }
}

