// 12S21053 - Chesya Ivana J. M Sitorus
// 12S21056 - Endang Siregar
import java.util.*;
import java.lang.Math;

public class T04S {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String[] iSBN = new String[3];
        double[] harga = new double[3];
        int[] jumlahBuku = new int[3];
        int n, jumlahBook0, jumlahBook1, jumlahBook2;
        
        n = 0;
        harga[0] = 0;
        harga[1] = 0;
        harga[2] = 0;
        jumlahBuku[0] = 0;
        jumlahBuku[1] = 0;
        jumlahBuku[2] = 0;
        jumlahBook0 = 0;
        jumlahBook1 = 0;
        jumlahBook2 = 0;
        double hargaBukuAkhir;
        double[] hargaBuku = new double[3];
        
        hargaBuku[0] = 0;
        hargaBuku[1] = 0;
        hargaBuku[2] = 0;
        String nama0, nama1, nama2;
        
        nama0 = "good";
        nama1 = "good";
        nama2 = "good";
        int nol, satu, dua;
        
        nol = 0;
        satu = 1;
        dua = 2;
        while (n < 3) {
            iSBN[n] = input.nextLine();
            if (iSBN[n].equals("---")) {
                n = 3;
            } else {
                if (iSBN[n].equals(iSBN[0])) {
                    if (nol == 0) {
                        nama0 = iSBN[n];
                    }
                    if (iSBN[0].equals(nama0)) {
                        n = 0;
                        harga[n] = Double.parseDouble(input.nextLine());
                        jumlahBuku[n] = Integer.parseInt(input.nextLine());
                        jumlahBook0 = jumlahBook0 + jumlahBuku[n];
                        nol = 3;
                        n = n + 1;
                    } else {
                        if (satu == 1) {
                            nama1 = iSBN[n];
                        }
                        if (iSBN[0].equals(nama1)) {
                            n = 1;
                            harga[n] = Double.parseDouble(input.nextLine());
                            jumlahBuku[n] = Integer.parseInt(input.nextLine());
                            jumlahBook1 = jumlahBook1 + jumlahBuku[n];
                            nol = 3;
                            n = n + 1;
                        } else {
                            n = 2;
                            harga[n] = Double.parseDouble(input.nextLine());
                            jumlahBuku[n] = Integer.parseInt(input.nextLine());
                            jumlahBook2 = jumlahBook2 + jumlahBuku[n];
                            nol = 3;
                            n = 0;
                        }
                    }
                } else {
                    if (iSBN[n].equals(iSBN[1])) {
                        if (satu == 1) {
                            nama1 = iSBN[n];
                        }
                        if (iSBN[1].equals(nama1)) {
                            n = 1;
                            harga[n] = Double.parseDouble(input.nextLine());
                            jumlahBuku[n] = Integer.parseInt(input.nextLine());
                            jumlahBook1 = jumlahBook1 + jumlahBuku[n];
                            satu = 3;
                            n = n + 1;
                        } else {
                            n = 2;
                            harga[n] = Double.parseDouble(input.nextLine());
                            jumlahBuku[n] = Integer.parseInt(input.nextLine());
                            jumlahBook2 = jumlahBook2 + jumlahBuku[n];
                            satu = 3;
                            n = 0;
                        }
                    } else {
                        if (iSBN[n].equals(iSBN[2])) {
                            if (dua == 2) {
                                nama2 = iSBN[n];
                            }
                            if (iSBN[2].equals(nama2)) {
                                n = 2;
                                harga[n] = Double.parseDouble(input.nextLine());
                                jumlahBuku[n] = Integer.parseInt(input.nextLine());
                                jumlahBook2 = jumlahBook2 + jumlahBuku[n];
                                dua = 3;
                                n = 0;
                            }
                        }
                    }
                }
            }
        }
        if (jumlahBook0 >= 20) {
            harga[0] = harga[0] - harga[0] * 12 / 100;
        } else {
            if (jumlahBook0 >= 10) {
                harga[0] = harga[0] - harga[0] * 5 / 100;
            } else {
                if (jumlahBook0 >= 5) {
                    harga[0] = harga[0] - harga[0] * 2 / 100;
                }
            }
        }
        hargaBuku[0] = harga[0] * jumlahBook0;
        if (jumlahBook1 >= 20) {
            harga[1] = harga[1] - harga[1] * 12 / 100;
        } else {
            if (jumlahBook1 >= 10) {
                harga[1] = harga[1] - harga[1] * 5 / 100;
            } else {
                if (jumlahBook1 >= 5) {
                    harga[1] = harga[1] - harga[1] * 2 / 100;
                }
            }
        }
        hargaBuku[1] = harga[1] * jumlahBook1;
        if (jumlahBook2 >= 20) {
            harga[2] = harga[2] - harga[2] * 12 / 100;
        } else {
            if (jumlahBook2 >= 10) {
                harga[2] = harga[2] - harga[2] * 5 / 100;
            } else {
                if (jumlahBook2 >= 5) {
                    harga[2] = harga[2] - harga[2] * 2 / 100;
                }
            }
        }
        hargaBuku[2] = harga[2] * jumlahBook2;
        hargaBukuAkhir = hargaBuku[0] + hargaBuku[1] + hargaBuku[2];
        System.out.println(toFixed(hargaBukuAkhir,2));
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}

