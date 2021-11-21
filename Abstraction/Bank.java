package Abstraction;

public abstract class Bank {

    protected int noOfDENOMINATION;

    public Bank(int noOfDENOMINATION ){
        this.noOfDENOMINATION=noOfDENOMINATION;
    }

    public abstract void numOfDenomination();
    public abstract void bankName();


}
