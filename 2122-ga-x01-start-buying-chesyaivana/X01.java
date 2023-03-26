// 12S21053 - Chesya Ivana J. M Sitorus
// 12S21060 - Glory Natasya Hutahaean
import java.util.*;
import java.lang.Math;

public class X01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String iSBN;
        double price, totaltransaksi;
        int quantity;
        boolean beli;
        
        beli = true;
        totaltransaksi = 0;
        while (beli) {
            iSBN = input.nextLine();
            if (!iSBN.equals("---")) {
                price = Double.parseDouble(input.nextLine());
                quantity = Integer.parseInt(input.nextLine());
                totaltransaksi = price * quantity + totaltransaksi;
            } else {
                beli = false;
                System.out.println(toFixed(totaltransaksi,2));
            }
        }
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
