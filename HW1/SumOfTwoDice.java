public class SumOfTwoDice {
    public static void main(String[] args) {
        int die1 = 1 + (int)(Math.random() * 6);
        int die2 = 1 + (int)(Math.random() * 6);
        int sum = die1 + die2;

        System.out.println(sum);
    }
}
