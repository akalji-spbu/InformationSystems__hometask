/**
 * Created by akalji on 03.10.2017.
 */
import java.lang.Math.*;

public class GCD {
    public static int gcd_my(int a, int b){
        while (b !=0) {
            int tmp = a%b;
            a = b;
            b = tmp;
        }

        return a;
    }

    public static int gcd_floorMod(int a, int b) {
        while (b != 0) {
            int tmp = Math.floorMod(a,b);
            a = b;
            b = tmp;
        }
        return a;
    }

    public static int gcd_abs(int a, int b){
        while (b !=0) {
            int tmp = Math.abs(a%b);
            a = b;
            b = tmp;
        }

        return a;
    }
}


