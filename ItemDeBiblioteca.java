/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp01;

/**
//  Nome da dupla:  Fernando Avelino da Silva CB3008053
//                  Diego Negrete Alves       CB1740229
*/

public interface ItemDeBiblioteca {
    public int diasemprestimo = 7;

    public boolean getEmprestado();
    public String getLocalizacao();
    public void Empresta();
    public void Devolve();

}
