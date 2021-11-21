package Abstraction;

public class CITIBank extends Bank{
    public CITIBank(int noOfDENOMINATION) {
        super(noOfDENOMINATION);
    }

    @Override
    public void bankName() {
        System.out.println("Bank Name is  CITI Bank");
    }

    @Override
    public void numOfDenomination() {
        System.out.println("Denomination rate of CITIBANK is :"+noOfDENOMINATION);
    }
}
