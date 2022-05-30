import java.util.Scanner;

public class mixedFractions {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 1;
        Scanner kd = new Scanner(System.in);


        while ((num1!=0) && (num2!=0)){
            num1 = kd.nextInt();
            num2 = kd.nextInt();
            if((num1==0)&&(num2==0)) { System.exit(0);}
            int num3 = num1/num2;
            int rem = num1%num2;
            System.out.printf("%d %d / %d \n",num3,rem,num2);
        }

    }
}
