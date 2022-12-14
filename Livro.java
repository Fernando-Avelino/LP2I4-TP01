/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp01;

/**
//  Nome da dupla:  Fernando Avelino da Silva CB3008053
//                  Diego Negrete Alves       CB1740229
*/

public class Livro {

    protected String titulo;
    protected String autor;
    protected String editora;
    protected short anoEdicao;

    public Livro(String titulo, String autor, String editora, short anoEdicao){
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.anoEdicao = anoEdicao;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public void setAnoEdicao(short anoEdicao) {
        this.anoEdicao = anoEdicao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getEditora() {
        return editora;
    }

    public short getAnoEdicao() {
        return anoEdicao;
    }

    public String getDados(){
        return "Título: " + titulo +
                "\nAutor: " +autor+
                "\nEditora: " +editora+
                "\nAno: "+anoEdicao;
    }
}
