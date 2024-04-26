/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.alexandre.conta;

/**
 *
 * @author Alexandre
 */

// Classe Conta1 que contem uma variável de instância name e métodos para configurar e obter o seu valor
public class Conta1 {
    private String name; //variavel de instância

    //método para definir o nome no objeto
    public void setName(String name) {
        this.name = name; // armazena o nome
    }
    
   //método para recuperar o nome no objeto
    public String getName() {
        return name; //retorna valor do nome para o chamador
    }
} // fim da classe Conta1
