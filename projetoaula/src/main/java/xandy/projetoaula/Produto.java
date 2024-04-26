/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xandy.projetoaula;

import java.util.Scanner;

/**
 *
 * @author Alexandre
 */
public class Produto {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
        int a, b, c, resultado;
        
        System.out.print("Entre com o primeiro inteiro: ");
        a = input.nextInt();
        
        System.out.print("Entre com o segundo inteiro: ");
        b = input.nextInt();
        
        System.out.print("Entre com o terceiro inteiro: ");
        c = input.nextInt();
        
        resultado = a * b * c;
        
        System.out.printf("O produto é %d%n", resultado);
        
    }
    
}
