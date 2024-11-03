/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package db4o_aula;

import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;

public class Db4o_aula {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
Livro umLivro = new Livro();
ObjectContainer db;

db = Db4o.openFile("meubanco2.dbo");
umLivro.setTitulo("Banco de Dados Orientado a Objetos");
umLivro.setAutor("Fernando");
umLivro.setEditora("UNINASSAU");
umLivro.setAnoedicao("2024");
umLivro.setLocalizacao("Recife/PE");
db.store(umLivro); // store
db.close();

db = Db4o.openFile("meubanco2.dbo");
umLivro.setTitulo("Paradigmas de Programação");
umLivro.setAutor("Flávio");
umLivro.setEditora("UNINASSAU");
umLivro.setAnoedicao("2023");
umLivro.setLocalizacao("Olinda/PE");
db.store(umLivro);
db.close();

db = Db4o.openFile("meubanco2.dbo");
umLivro.setTitulo("Metodologia Científica");
umLivro.setAutor("Maria Antonieta");
umLivro.setEditora("UNINASSAU");
umLivro.setAnoedicao("2020");
umLivro.setLocalizacao("Paulista/PE");
db.store(umLivro);
db.close();

ObjectSet<Livro> lista;

db = Db4o.openFile("meubanco2.dbo");
lista = db.query(Livro.class);
while (lista.hasNext()){
	umLivro = lista.next();
	System.out.println("###################");
	System.out.println(umLivro.getTitulo());
	System.out.println(umLivro.getAutor());
	System.out.println(umLivro.getEditora());
	System.out.println(umLivro.getAnoedicao());
	System.out.println(umLivro.getLocalizacao());
}

db.close();
    }
    
}
