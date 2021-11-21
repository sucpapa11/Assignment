package Polymorphism;

public class OverRidingExample {

    public void addTwoVariables(int a, int b){
        int sum = a+b;
        System.out.println("Addition Of Two numbers is =" + sum);

    }

    public void addTwoVariables(String a, String b){

        String Concat= a + b;

    }

    public static void main(String[] args) {
        OverRidingExample obj=new OverRidingExample();
      //  System.out.println("Print the concatenation of two strings = " + obj.addTwoVariables("Hello", "Java"););
       // System.out.println("Print the addition of two integers = "  obj.addTwoVariables(10,20););

    }
}
