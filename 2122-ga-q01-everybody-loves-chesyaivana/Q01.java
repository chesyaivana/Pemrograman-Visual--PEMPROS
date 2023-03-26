// 12S21053 - Chesya Ivana J. M Sitorus
// 12S21060 - Glory Natasya Hutahaean

import java.util.*;
import java.lang.Math;

public class Q01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String iSBN, juduul, penulis, tahun, penerbit, format, kategori, diskon;
        double hargabuku, margin, rating, totaldiskon;
        int stok, persen;
        
        persen = 100;
        iSBN = input.nextLine();
        juduul = input.nextLine();
        penulis = input.nextLine();
        tahun = input.nextLine();
        penerbit = input.nextLine();
        format = input.nextLine();
        hargabuku = input.nextDouble();
        margin = input.nextDouble();
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
        stok = input.nextInt();
        rating = input.nextDouble();
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
        System.out.println(iSBN + "|" + juduul + "|" + penulis + "|" + tahun + "|" + penerbit + "|" + format + "|" + hargabuku + "|" + margin + "|" + stok + "|" + rating + "|" + kategori + "|" + diskon);
    }
}

