// 12S21053 - Chesya Ivana J. M Sitorus
import java.util.*;
import java.lang.Math;

public class T01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String iSBN, judulBuku, penulis, tahunTerbit, penerbit, formatBuku;
        double hargaBuku, minimumMargin, rating;
        int stok;
        
        iSBN = input.nextLine();
        judulBuku = input.nextLine();
        penulis = input.nextLine();
        tahunTerbit = input.nextLine();
        penerbit = input.nextLine();
        formatBuku = input.nextLine();
        hargaBuku = input.nextDouble();
        minimumMargin = input.nextDouble();
        stok = input.nextInt();
        rating = input.nextDouble();
        System.out.println(iSBN + "|" + judulBuku + "|" + penulis + "|" + tahunTerbit + "|" + penerbit + "|" + formatBuku + "|" + hargaBuku + "|" + minimumMargin + "|" + stok + "|" + rating);
    }
}
