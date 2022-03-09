package br.com.dio.exercicios;

import java.io.IOException;

import java.util.Scanner;

public class Teste {

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i = 0;

        for(i=0;i<n+1;i++){
            if(i%2==0 && i!=0){

                System.out.println(i);
                //System.out.printf("%",i );

            }

        }

    }
}
