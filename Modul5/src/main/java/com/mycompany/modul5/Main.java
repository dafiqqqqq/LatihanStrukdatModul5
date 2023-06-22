package com.mycompany.modul5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String cek;
        Scanner add = new Scanner(System.in);
        BinaryTree binaryTree = new BinaryTree();

        do{
            System.out.println(" =========================");
            System.out.print(" | Masukkan Data : ");
            String input = add.nextLine();
            binaryTree.NewNode(input);
            System.out.println(" =========================");
            System.out.print(" | Tambah Data? (y/n) : ");
            cek = add.nextLine();
            System.out.println(" =========================\n");
        }while(cek.equals("y"));
        
        System.out.println(" =========================");
        System.out.print(" | PreOrder  : ");
        binaryTree.preOrder(binaryTree.root);
        System.out.println("\n =========================");
        System.out.print(" | InOrder   : ");
        binaryTree.inOrder(binaryTree.root);
        System.out.println("\n =========================");
        System.out.print(" | PostOrder : ");
        binaryTree.postOrder(binaryTree.root);
        System.out.println("\n =========================");
    }
}