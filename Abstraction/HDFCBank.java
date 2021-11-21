package Abstraction;

public class HDFCBank extends Bank{
    public HDFCBank(int noOfDENOMINATION) {
        super(noOfDENOMINATION);
    }

    @Override
    public void bankName() {
        System.out.println("Bank name is HDFC Bank");
    }

    @Override
    public void numOfDenomination() {
        System.out.println("Denomination rate for HDFC bank is :" + noOfDENOMINATION );
    }
}
