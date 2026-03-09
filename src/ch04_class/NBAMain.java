package ch04_class;

public class NBAMain {

    static void main(String[] args) {

        NBA game = new NBA();

        game.setPlayer("Stephen Curry");
        //game.getPlayer();

        game.setTeam("GoldenState Warriors");
        //game.getTeam();

        game.setBacknumber(30);
        //game.getBacknumber();

        game.setScore(10);
        //game.getScore();

        String Ranking = game.MVP();



        System.out.println("선수의 팀 : "+game.getTeam());
        System.out.println("선수의 이름 : "+game.getPlayer());
        System.out.println("선수의 등번호 : "+game.getBacknumber());
        System.out.println("선수의 득점 : "+game.getScore());
        System.out.println("선수의 능력치 : "+Ranking);

    }



}
