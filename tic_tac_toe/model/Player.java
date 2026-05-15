package tic_tac_toe.model;

import tic_tac_toe.piece.Coin;
import tic_tac_toe.piece.CoinX;

public class Player {
    String name;
    Coin coin;

    public Player(String name, Coin coin) {
        this.name = name;
        this.coin = coin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Coin getCoin() {
        return coin;
    }

    public void setCoin(Coin coin) {
        this.coin = coin;
    }
}
