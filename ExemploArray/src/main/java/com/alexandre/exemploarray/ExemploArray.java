/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.alexandre.exemploarray;

import java.util.Scanner;

/**
 *
 * @author Alexandre
 */
public class ExemploArray {

    public static void main(String[] args) {
        
        //Cria um array com tamanho 5
        int[] numeros = new int[5];
        
        //Preenche o array com numeros informados pelo usuário
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < numeros.length; i++ ){
            System.out.print("Informe o " + (i+1) +"º número: ");
            numeros[i] = input.nextInt();
        }
        
        //imprime os números do array
        System.out.print("Números informados: ");
        for(int i = 0; i < numeros.length; i++ ){
            System.out.print(" [" + numeros[i] + "] ");
        }
        
        //calcula a média dos números
        double soma = 0;
        for(int i = 0; i < numeros.length; i++){
            soma += numeros[i];
        }
        double media = soma / numeros.length;
        System.out.println("Média dos números: "+ media);
    }
}
