/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alexandre.conta;

import java.util.Scanner;

/**
 *
 * @author Alexandre
 */
public class TesteTodasContas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Conta1 primeiroObj = new Conta1();
        
        System.out.print("Digite o nome do primeiro Objeto: ");
        String name = input.nextLine();
        primeiroObj.setName(name);
        
        Conta2 segundoObj = new Conta2("Gomes");
        Conta2 terceiroObj = new Conta2("Silva");
        
        System.out.printf("Os nomes dos objetos são: %s %s %s",
        primeiroObj.getName(), segundoObj.getName(), terceiroObj.getName());
    }
}
