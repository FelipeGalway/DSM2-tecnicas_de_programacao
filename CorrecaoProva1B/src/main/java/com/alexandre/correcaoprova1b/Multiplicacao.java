/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alexandre.correcaoprova1b;

import java.util.Scanner;

/**
 *
 * @author Alexandre
 */
public class Multiplicacao {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: ");
        int num1  =sc.nextInt();
        
        System.out.print("Digite o segundo número: ");
        int num2  =sc.nextInt();
        
        int resultado = num1 * num2;
        
        System.out.println("O resultado da multiplicação é: " + resultado);
        
        
        
        
    }
    
}
