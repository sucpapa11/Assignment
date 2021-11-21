package Polymorphism;

public class OverloadingExample {

    int larestnum;

    public int largestOfNum(int a, int b) {
        if (a > b)
            System.out.println("largest of two num is = " + a);
        else
            System.out.println("Largest of two num is = " + b);
        return larestnum;

    }

    public int largestOfNum(int a, int b, int c) {
        if (a > b && a > c)
            System.out.println("largest num is = " + a);
        else if (b > a && b > c)
            System.out.println("largest num is = " + b);
        else
            System.out.println("largest num is = " + c);

        return larestnum;

    }

    public static void main(String[] args) {

        OverloadingExample obj = new OverloadingExample();
        obj.largestOfNum(4,9);
        obj.largestOfNum(2,5,7);

    }

}









/*    public int add(int a, int b, int c){
        int sum=a+b+c;
        return sum;
    }

    public static void main(String[] args) {
        OverloadingExample obj=new OverloadingExample();
        System.out.println("Addition of Two Numbers is = " + obj.add(10,20));
        System.out.println("Addition of Three Numbers is = " +obj.add(10,20,30));


    }
}
*/