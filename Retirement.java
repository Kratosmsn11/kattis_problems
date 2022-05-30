import java.util.Scanner;

public class Retirement {
    public static void main(String[] args) {
        Scanner kd = new Scanner(System.in);

        int p1a = kd.nextInt();
        int p1r = kd.nextInt();
        int p1s = kd.nextInt();
        int p2a = kd.nextInt();
        int p2s = kd.nextInt();

        int a = (p1r - p1a)*p1s;

        p2a += Math.ceil(a/p2s+1);

        System.out.println(p2a);
    }
}
