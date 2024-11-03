package main;

public class Pedido implements Comparable<Pedido>{
	private int codigo;
	private String data;
	private String pais;
	
	public Pedido(int codigo, String data, String pais) {
		this.codigo = codigo;
		this.data = data;
		this.pais = pais;
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	
	@Override
	public int compareTo(Pedido other) {
		int result = Integer.compare(this.codigo, other.codigo);
	    if (result != 0) return result;

	    result = this.data.compareTo(other.data);
	    if (result != 0) return result;

	    return this.pais.compareTo(other.pais);
	}
}
