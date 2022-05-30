import java.util.Scanner;

public class Statistics {

    public static void main(String[] args) {
        int max=31 ,min=0;
        int count=1;
        Scanner kd = new Scanner(System.in);

        while(kd.hasNext()) {
            int n = kd.nextInt();
            for (int i = 0; i < n; i++) {
                int temp = kd.nextInt();
                if(min < 0 | max >31){
                    System.exit(0);
                }else{
                if (temp < min) {
                    min = temp;
                }  else if (temp > ) {
                    max = temp;
                }
                }
            }

            System.out.println("Case "+count+":"+min +max + (max-min));
            count++;
        }
        
        }
    }
