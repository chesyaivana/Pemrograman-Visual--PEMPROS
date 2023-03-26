// 12S21053 - Chesya ivana J. M Sitorus
import java.util.*;
import java.lang.Math;

public class T01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int x, y, z;
        int s;
        
        x = input.nextInt();
        y = input.nextInt();
        z = input.nextInt();
        if (x < y) {
            s = x;
        } else {
            s = y;
        }
        if (z < s) {
            s = z;
        }
        System.out.println(s);
    }
}
