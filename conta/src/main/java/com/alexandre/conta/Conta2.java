/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alexandre.conta;

/**
 *
 * @author Alexandre
 */

//a classe Conta2 com um constructor que inicializa o name
public class Conta2 {
    
    private String name; // variável de instância
    
    // o contructor inicializa name com nome do parâmetro
    public Conta2(String name){
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
