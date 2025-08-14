import java.util.*;

public class Ques6{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double Principal = sc.nextInt();
        double Rate = sc.nextInt();
        double Time = sc.nextInt();
        double Simple_interest = (Principal * Rate * Time) / 100;
        System.out.println(Simple_interest);
    }
}