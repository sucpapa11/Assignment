package Polymorphism;

public class OverRidingMain {

    public static void main(String[] args) {
        //object of child class
        OverRiding obj=new OverRiding();
        //object of child class calling method of child class parameter type as String
        obj.addTwoVariables("Hello","Java");
        //object of child class calling method of parent class as parameter type is Int
        obj.addTwoVariables(10,20);
    }
}
