package tic_tac_toe;

import tic_tac_toe.piece.Coin;

public class Board {
    public int size;

    public Coin [][] board;


    public Board(int size) {
        this.size = size;
        this.board = new Coin[size][size];
    }

    public boolean addCoinToBoard(int row, int column, Coin coin){

        if(board[row][column] != null){
            return false;
        }

        board[row][column] = coin;
        return true;

    }

    public void printBoard(){
        for(int i=0; i< size; i++){
            for(int j=0; j < size; j++){
                System.out.print(board[i][j] == null ? "":board[i][j].getCoinType());
                System.out.print("  |  ");
            }
            System.out.println();
        }
    }

}
