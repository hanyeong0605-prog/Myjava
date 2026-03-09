package ch04_class;

public class NBA {
    //변수 선언(멤버 변수)
    private String team;
    private String player;
    private int backnumber;
    private int score;

    //변수 정보(NBA정보)

    public void setBacknumber(int _backnumber) {
        backnumber = _backnumber;
    }

    public int getBacknumber() {
        return backnumber;
    }
    //---------------------------------------//

    public void setTeam(String _team) {
        team = _team;
    }

    public String getTeam() {
        return team;
    }
    //---------------------------------------//

    public void setPlayer(String _player) {
        player = _player;
    }

    public String getPlayer() {
        return player;
    }

    //-------------------------------------//
    void setScore(int _score) {
        score = _score;
    }

    int getScore() {
        return score;
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

