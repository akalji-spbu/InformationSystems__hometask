/**
 * Created by akalji on 03.10.2017.
 */
import java.math.BigInteger;

public class main {
    public static void main(String[] args) {
        int a = 12;
        int b = -30;
        System.out.println(GCD.gcd_my(a,b));
        System.out.println(GCD.gcd_floorMod(a,b));
        System.out.println(GCD.gcd_abs(a,b));
    }
}
