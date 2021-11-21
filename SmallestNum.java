
public class SmallestNum {
    public static int smallest(int first, int second, int third, int fourth) {
        int min = first;   // min = 5
        if (second < min) {  // 8 < 5
            min = second;
        }
        if (third < min) { // 2 < 5
            min = third;   // min = 2
        }
        if (fourth < min) { // 3 < 2
            min = fourth;
        }
        System.out.println("Smallest number is " + min);
        return min;
    }

    public static void main(String[] args) {
        smallest(5, 8, 2, 3);
    }

}
