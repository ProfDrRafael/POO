/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula24.ex3;

/**
 *
 * @author Rafael
 */
public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private String editora;
    private int numeroPaginas;
    private boolean disponibilidade;

    public boolean emprestar() {
        if (this.disponibilidade == true) {
            this.disponibilidade = false;
            return true;
        }
        else 
            return false;
    }
    
    public void devolver() {
        this.disponibilidade = true;
    }    
    
    public String verificarDisponibilidade() {
        if (this.disponibilidade == true) {
            return "Disponível";
        }
        else {
            return "Indisponível";
        }
    }
    
    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * @return the anoPublicacao
     */
    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    /**
     * @param anoPublicacao the anoPublicacao to set
     */
    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    /**
     * @return the editora
     */
    public String getEditora() {
        return editora;
    }

    /**
     * @param editora the editora to set
     */
    public void setEditora(String editora) {
        this.editora = editora;
    }

    /**
     * @return the numeroPaginas
     */
    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    /**
     * @param numeroPaginas the numeroPaginas to set
     */
    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    /**
     * @return the disponibilidade
     */
    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    /**
     * @param disponibilidade the disponibilidade to set
     */
    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

}
