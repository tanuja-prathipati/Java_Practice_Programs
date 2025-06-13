
import java.util.*;

public class reverseNum {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int digit;
        int res=0;
        while(n!=0){
            digit=n%10;
            res=res*10+digit;
            n=n/10;
        }
        System.out.println(res);
    }
}
