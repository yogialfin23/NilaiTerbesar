package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String petugas;
        int nMhs;
        int nBesar;
        int nKecil;
        int nilaiMhs;
        Scanner scn = new Scanner(System.in);

        System.out.println("======Program Nilai Terbesar dan Terkecil Nilai Mahasiswa======");

        System.out.print("Masukkan Nama Petugas : ");
        petugas = scn.next();

        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        nMhs = scn.nextInt();

        nBesar = 0;
        nKecil = 100;

        for (int i = 1; i <= nMhs; i++) {
            System.out.print("Masukkan Nilai Mahasiswa ke-" + i + " = ");
            nilaiMhs = scn.nextInt();

            nBesar = ((nBesar <= nilaiMhs) ? nilaiMhs : nBesar);
            nKecil = ((nKecil >= nilaiMhs) ? nilaiMhs : nKecil);
        }

        System.out.print("\nNilai Terbesar adalah : " + nBesar);
        System.out.println("\nNilai Terkecil adalah : " + nKecil);
        System.out.println("");
        System.out.println("Petugas\t : " + petugas);
    }

}
