package com.example.AlgoritmaKinan;

import java.util.Scanner;

//initial name/nim checker input & algorithm by hafidz
public class AlgoritmaKinan {

    /**
     * @param args the command line arguments
     */
    

    static void tk2() {
        Scanner input = new Scanner(System.in);

        int jmlGenap = 0, jmlGanjil = 0, jmlFibo = 0;
        int num1 = 1, num2 = 1;

        int counter = 1;

        //algoritma1 sembarang angka
        Integer SembarangAngka = 5;
        do {
            if (SembarangAngka < 5 || SembarangAngka > 20) {
                System.out.println("Harap Masukkan angka antara 5 - 20");
            }
            System.out.println("Masukkan Sembarang Angka [5..20] : ");
            SembarangAngka = input.nextInt();
        } while (SembarangAngka < 5 || SembarangAngka > 20);

//        Bilangan Genap
        System.out.println("\n\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        System.out.println("Deret Bilangan");
        System.out.println("#####");
        System.out.println(SembarangAngka + " Bilangan Genap");
        System.out.println("#####");
        counter = 1;
        int genap = 1;
        while (counter <= SembarangAngka) {
            if (genap % 2 == 0) {
                counter += 1;
                System.out.print(genap + "  ");
                jmlGenap += genap;

            }
            genap++;

        };
        System.out.println("\nHasil Penjumlahan Genap = " + jmlGenap);

//        Bilangan Ganjil
        System.out.println("#####");
        System.out.println(SembarangAngka + " Bilangan Ganjil");
        counter = 1;
        int ganjil = 1;
        while (counter <= SembarangAngka) {
            if (ganjil % 2 == 1) {
                counter += 1;
                System.out.print(ganjil + "  ");
                jmlGanjil += ganjil;
            }
            ganjil++;
        };

        System.out.println("\nHasil Penjumlahan Ganjil = " + jmlGanjil);
//        Bilangan Fibonnaci
        jmlFibo = 0;
        System.out.println("#####");
        System.out.println(SembarangAngka + " Bilangan Fibonnaci");
        counter = 1;
        while (counter <= SembarangAngka) {

            // Print the number
            System.out.print(num1 + " ");
            counter = counter + 1;
            // Swap
            jmlFibo += num1;
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;

        }

        System.out.println("\nHasil Penjumlahan Fibonnaci = " + jmlFibo);

    }

    ; //End of Angka Function
    


    ; //End of function 
    public static void main(String[] args) {
        //utk checker karakter nama dan nim, pakai .length , dan untuk bagian mastiinnya pakai do-while

        Scanner scInputEnd = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        char isRepeat;
        String nama = "a";
//        Start of Intro
        do {
            if (nama.length() > 25 || nama.equals("")) {
                System.out.println("Harap Masukkan Nama 1 - 25 karakter");
            }
            System.out.println("Masukkan nama Anda [1...25] : ");
            nama = input.nextLine();
        } while (nama.length() > 25 || nama.equals(""));

        String nim;
        do {
            System.out.println("Masukkan NIM Anda [Harus 10 Karakter] : ");
            nim = input.nextLine();
        } while (nim.length() != 10);
//        int NIM = Integer.parseInt(nim);

        System.out.println("\n\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        System.out.println("\n\nRegistrasi Sukses");
        System.out.println("Selamat Datang " + nama + " [NIM : " + nim + "].. ^^v");
        System.out.println("Mari belajar macam-macam deret bilangan..");

        System.out.println("\n\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
//        End of Intro
//        Start Perhitungan

        tk2();
        isRepeat = 'g';

        // Cek isRepeat
        do {
            do {

                System.out.print("Anda ingin mengulang (y/t) : ");
                isRepeat = scInputEnd.next().toLowerCase().charAt(0); //validate char 1st index
                if (isRepeat != 'y' && isRepeat != 't') {
                    System.out.println("Tolong masukkan input y atau t");
                };

            } while (isRepeat != 'y' && isRepeat != 't');
            if (isRepeat == 'y') {
                tk2();
            }

        } while (isRepeat == 'y');

    }
;
}
