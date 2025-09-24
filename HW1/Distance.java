import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Distance {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(sqrt(x * x + y * y));
    }
}
