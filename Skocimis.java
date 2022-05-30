import java.util.Scanner;

public class Skocimis {

    public static void main(String[] args) {
        int a,b,c;
        Scanner kd = new Scanner(System.in);
        a = kd.nextInt();
        b = kd.nextInt();
        c = kd.nextInt();

        System.out.println(Math.max(b-a,c-b)-1);
    }
}
