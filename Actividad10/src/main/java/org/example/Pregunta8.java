package org.example;

class Wallet {
    private int amount;
    public void loanTo(Wallet that) {
// put all of this wallet's money into that wallet
        /*A*/ that.amount += this.amount;
        /*B*/ amount = 0;
    }
    public static void main(String[] args) {
        /*C*/ Wallet w = new Wallet();
        /*D*/ w.amount = 100;
        System.out.println(w.amount);
        /*E*/ w.loanTo(w);
        System.out.println(w.amount);
    }
}/*
class Person {
    private Wallet w;
    public int getNetWorth() {
        /*F*//* return w.amount;
    }
    public boolean isBroke() {
        /*G*//* return Wallet.amount == 0;
    }
}
*/