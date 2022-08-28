/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp01;

/**
//  Nome da dupla:  Fernando Avelino da Silva CB3008053
//                  Diego Negrete Alves       CB1740229
*/

public class Demo {

    public static void isDisponivel(LivroDeBiblioteca livro){
        if(Boolean.FALSE.equals(livro.getEmprestado())){
            livro.Empresta();
            System.out.println("O livro "+livro.titulo+" foi emprestado com sucesso! \n" +
                    "Ele deverá ser devolvido em "+livro.diasemprestimo+" dias.");
        } else{
            System.out.println("O livro "+livro.titulo+" não está disponível para empréstimo no momento.");
        }
    }

    public static void main(String[] args) {
        LivroDeBiblioteca L1 = new LivroDeBiblioteca("Introdução à POO usando JAVA", "Rafael Santos", "Campus/SBC", (short) 2003,"g11p17");
        System.out.print("SOBRE O LIVRO\n"+L1.getDados()+"\n----------------------------------------------------------------------------");
        System.out.println("\n");
        isDisponivel(L1);
        System.out.print("\n");
        isDisponivel(L1);
    }
}
