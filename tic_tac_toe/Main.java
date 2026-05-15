package tic_tac_toe;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Starting Game in : ");
        System.out.println("3");
        Thread.sleep(1000);
        System.out.println("2");
        Thread.sleep(1000);
        System.out.println("1");
        Thread.sleep(1000);



        TicTacToe game = new TicTacToe();

        game.initGame();
        game.startGame();






    }
}
