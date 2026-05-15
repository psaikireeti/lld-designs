package tic_tac_toe.piece;

import tic_tac_toe.enums.CoinEnum;

public class Coin {

    CoinEnum coinType;


    public Coin(CoinEnum coinType) {
        this.coinType = coinType;
    }

    public CoinEnum getCoinType() {
        return coinType;
    }

    public void setCoinType(CoinEnum coinType) {
        this.coinType = coinType;
    }
}
