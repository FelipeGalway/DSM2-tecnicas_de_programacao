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
public class TesteConta1 {
    public static void main(String[] args) {
        
        //cria um objeto scanner para obter a entrada a partir do terminal
        Scanner input = new Scanner(System.in);
        
        //cria um objeto Conta1 a partir da Classe Conta1
        Conta1 minhaConta = new Conta1();
        
        //Exibe o valor inicial do nome (null)
        System.out.printf("O valor inicial de nome é: %s%n%n ", minhaConta.getName());
        
        //solicita e lê o nome
        System.out.print("Por favor, entre com o nome: ");
        String name = input.nextLine(); //lê um alinha de texto
        minhaConta.setName(name); // insere name em minhaConta
        System.out.println(); //gera saida de uma linha em branco
        
        //exibe o nome armazenado no objeto minhaConta
        System.out.printf("O nome do obejto em minhaConta é: %s%n%n ", minhaConta.getName());
    }
}//fim da classe TesteConta
