import java.util.Scanner;

public class chicken {
    public static void main(String[] args) {
        Scanner kd = new Scanner(System.in);

        int num1 = kd.nextInt();
        int num2 = kd.nextInt();

        if(num2<num1){
            if(num1-num2==1){
                System.out.println("Dr. Chaz needs 1 more piece of chicken!");
            }
            else {
                System.out.printf("Dr. Chaz needs %d more pieces of chicken!",num1-num2);
            }
        }
        else{
            if(num2-num1==1){
                System.out.println("Dr. Chaz will have 1 piece of chicken left over!");
            }
            else {
                System.out.printf("Dr. Chaz will have %d pieces of chicken left over!", num2 - num1);
            }
        }

    }
}
