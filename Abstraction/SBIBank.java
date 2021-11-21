package Abstraction;

public class SBIBank extends Bank{
    public SBIBank(int noOfDENOMINATION) {
        super(noOfDENOMINATION);
    }

    @Override
    public void bankName() {
        System.out.println("The Bank name is SBI Bank");
    }

    @Override
    public void numOfDenomination() {
        System.out.println("Print the denomination rate for SBI bank is:"+noOfDENOMINATION );
    }
}
