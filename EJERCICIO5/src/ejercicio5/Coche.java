package ejercicio5;

public class Coche {
	private String modelo;
	private String marca;
	
	public String getModelo() {
		return modelo;
	}
	public String getMarca() {
		return marca;
	}
	
	public void setModelo(String a) {
		modelo = a;
	}
	public void setMarca(String b) {
		marca = b;
	}
	
	public Coche() {
	}
	public Coche(String a, String b) {
		modelo = a;
		marca = b;
	}
}