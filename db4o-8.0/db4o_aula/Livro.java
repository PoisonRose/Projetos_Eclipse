package db4o_aula;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author flavi
 */
public class Livro {
private String titulo;
private String autor;
private String editora;
private String anoedicao;
private String localizacao;

public Livro() {}
public void setTitulo(String _titulo) {titulo = _titulo;}
public void setAutor(String _autor) {autor = _autor;}
public void setEditora(String _editora) {editora = _editora;}
public void setAnoedicao(String _anoedicao) {anoedicao = _anoedicao;}
public void setLocalizacao(String _localizacao) {localizacao = _localizacao;}

public String getTitulo () {return titulo;}
public String getAutor () {return autor;}
public String getEditora () {return editora;}
public String getAnoedicao () {return anoedicao;}
public String getLocalizacao () {return localizacao;}
    
}
