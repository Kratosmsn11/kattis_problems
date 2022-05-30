import java.util.Scanner;

public class RBN {
    public static void main(String[] args) {
        Scanner kd = new Scanner(System.in);
        int a = kd.nextInt();

        String b = Integer.toBinaryString(a);
        StringBuilder c = new StringBuilder();

        c.append(b);

        String d = String.valueOf(c.reverse());

        int result = Integer.parseInt(d, 2);
        System.out.println(result);
    }
}
