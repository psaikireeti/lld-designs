package tic_tac_toe;

import tic_tac_toe.enums.CoinEnum;
import tic_tac_toe.model.Player;
import tic_tac_toe.piece.Coin;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TicTacToe {

    Deque<Player> players;

    Board board;




    public void initGame(){

        players = new LinkedList<>();
        Player p1 = new Player("Kireeti", new Coin(CoinEnum.X));
        Player p2 = new Player("Sai", new Coin(CoinEnum.O));

        players.addFirst(p1);
        players.addLast(p2);

        board = new Board(3);
    }



    public void startGame(){


        boolean noWinner = true;
        board.printBoard();
        Scanner sc = new Scanner(System.in);

        while (noWinner){

            Player currentPlayer = players.removeFirst();



            System.out.println(currentPlayer.getName()+"'s move : ");
            String input = sc.nextLine();

            String[] arr = input.split(",");


            int row = Integer.parseInt(arr[0]);
            int column = Integer.parseInt(arr[1]);

            board.addCoinToBoard(row,column,currentPlayer.getCoin());

            String message = board.checkWinner();
            if(message != null){
                System.out.println(message);
                noWinner = false;
            }

            board.printBoard();


            players.addLast(currentPlayer);

        }





    }




    public void scanInput(){
        Scanner sc = new Scanner(System.in);
    }
}
