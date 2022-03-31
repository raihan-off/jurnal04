package com.company;

import java.util.*;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean running = true;

        while (running){
            System.out.println("Pilihlah menu:");
            System.out.println("1. Input Lagu");
            System.out.println("2. Hapus Lagu");
            System.out.println("3. Mainkan Lagu");
            System.out.println("4. Keluar");

            int opsiUser = in.nextInt();
            if (opsiUser == 1 ){

                System.out.println("Input menu");
                String Judul = in.nextLine();
                String Penyanyi = in.nextLine();

                //add data should be with method linkedlist

                System.out.println("Judul = " + Judul + "; Penyanyi = " + Penyanyi);
                System.out.println("Tambahkan data di awal list? (y/n)");
                String sortList = in.nextLine();

                if(sortList.equals("y")){
                    System.out.println("ditambah ke awal");
                }else {
                    System.out.println("ditambah ke akhir");
                }

            } else if (opsiUser == 2){
                System.out.println("Hapus Lagu");
//                playing.removeFromBack();
            }else if (opsiUser == 3){
                System.out.println("Mainkan Lagu");
//                playing.print();
            }else{
                System.out.println("Keluar");
                running = false;
            }
        }
    }
}
