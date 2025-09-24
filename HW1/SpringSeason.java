import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int d = sc.nextInt();
        boolean isSpring = false;
        if ((m == 3 && d >= 20 && d <= 31)
                || (m == 4 && d >= 1 && d <= 30)
                || (m == 5 && d >= 1 && d <= 31)
                || (m == 6 && d >= 1 && d <= 20)
        ) {
            isSpring = true;
        }

        System.out.println(isSpring);
    }
}
