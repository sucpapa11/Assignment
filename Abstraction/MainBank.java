package Abstraction;

public class MainBank {
    public static void main(String[] args) {
        CITIBank bank1=new CITIBank(15);
        bank1.bankName();
        bank1.numOfDenomination();
        SBIBank bank2=new SBIBank(10);
        bank2.bankName();
        bank2.numOfDenomination();
        HDFCBank bank3=new HDFCBank(13);
        bank3.bankName();
        bank3.numOfDenomination();
        Bank bank4=new CITIBank(20);
        bank4.numOfDenomination();
        bank4.bankName();







    }
}
