// 12S21053 - Chesya Ivana J. M Sitorus import java.util.*;
// 12S21060 - Glory Natasya Hutahaean
import java.util.*;
import java.lang.Math;

public class T03 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String iSBN, juduul, penulis, tahun, penerbit, format, kategori, diskon, tUB;
        double hargabuku, margin, rating, totaldiskon;
        int stok, persen;
        
        persen = 100;
        do {
            iSBN = input.nextLine();
            if (!iSBN.equals("---")) {
                juduul = input.nextLine();
                penulis = input.nextLine();
                tahun = input.nextLine();
                penerbit = input.nextLine();
                format = input.nextLine();
                hargabuku = Double.parseDouble(input.nextLine());
                margin = Double.parseDouble(input.nextLine());
                totaldiskon = margin / hargabuku * persen;
                if (totaldiskon > 0) {
                    diskon = "---";
                } else {
                    if (totaldiskon < -40) {
                        diskon = "Once in a lifetime";
                    } else {
                        if (totaldiskon < -20) {
                            diskon = "Never come twice";
                        } else {
                            diskon = "No regret";
                        }
                    }
                }
                stok = Integer.parseInt(input.nextLine());
                rating = Double.parseDouble(input.nextLine());
                if (rating >= 4.7) {
                    kategori = "Best Pick";
                } else {
                    if (rating >= 4.5) {
                        kategori = "Must Read";
                    } else {
                        if (rating >= 4.0) {
                            kategori = "Recommended";
                        } else {
                            if (rating >= 3.0) {
                                kategori = "Average";
                            } else {
                                kategori = "Low";
                            }
                        }
                    }
                }
                if (diskon.equals("once in a lifetime") && kategori.equals("Best Pick")) {
                    tUB = "The unlimate best";
                } else {
                    tUB = "---";
                }
                System.out.println(iSBN + "|" + juduul + "|" + penulis + "|" + tahun + "|" + penerbit + "|" + format + "|" + hargabuku + "|" + margin + "|" + stok + "|" + rating + "|" + kategori + "|" + diskon + "|" + tUB);
            }
        } while (!iSBN.equals("---"));
    }
}
