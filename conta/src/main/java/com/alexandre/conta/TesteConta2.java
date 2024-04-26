/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alexandre.conta;

/**
 *
 * @author Alexandre
 */

//usando o constructor de Conta2 para inicializar a instância name no momento
//em que cada obejto Conta2 é criado
public class TesteConta2 {
    public static void main(String[] args) {
        
        //cria dois objetos Conta2
        Conta2 minhaConta1 = new Conta2("Alexandre");
        Conta2 minhaConta2 = new Conta2("Gomes");
        
        //exibe o valor dos objetos para cada Conta2
        System.out.printf("Os nomes dos objetos são: %s %s",
                    minhaConta1.getName(), minhaConta2.getName());
    }
}//fim da classe TesteConta2
