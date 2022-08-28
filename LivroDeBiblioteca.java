/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp01;

/**
//  Nome da dupla:  Fernando Avelino da Silva CB3008053
//                  Diego Negrete Alves       CB1740229
*/

public class LivroDeBiblioteca extends Livro implements ItemDeBiblioteca {
    private String localizacao;
    private boolean emprestado;

    public LivroDeBiblioteca(String titulo, String autor, String editora, short anoEdicao, String localizacao){
        super(titulo, autor, editora, anoEdicao);
        this.localizacao = localizacao;
        this.emprestado = false;
    }


    @Override
    public boolean getEmprestado() {
        return emprestado;
    }

    @Override
    public String getLocalizacao() {
        return localizacao;
    }

    @Override
    public void Empresta() {
        this.emprestado = true;
    }

    @Override
    public void Devolve() {
        this.emprestado = false;
    }

    @Override
    public String getDados(){
            return "Título: " + titulo +
                    "\nAutor: " +autor+
                    "\nEditora: " +editora+
                    "\nAno: "+anoEdicao+
                    "\nLocalização: "+localizacao;
    }
}
