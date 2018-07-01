
import java.util.*;

public class Vertice {

	private HashMap<String, Vertice> sucessores;
	private HashMap<String, Vertice> antecessores;
	private int grauEntrada;
	private int grauSaida;
	private String codigo;
	private String nome;
	private int creditos;

	public Vertice() {

		this.sucessores = new HashMap<>();
		this.antecessores = new HashMap<>();
		this.grauEntrada = 0;
		this.grauSaida = 0;
		this.creditos = 0;
		this.codigo = "";
		this.nome = "";
	
	}

	public Vertice(String _codigo, String _nome, int _creditos) {
	
		this.sucessores = new HashMap<>();
		this.antecessores = new HashMap<>();
		this.grauEntrada = 0;
		this.grauSaida = 0;
		this.creditos = _creditos;
		this.codigo = _codigo;
		this.nome = _nome;	
	
	}

	public Vertice(String _codigo, String _nome) {
	
		this.sucessores = new HashMap<>();
		this.antecessores = new HashMap<>();
		this.grauEntrada = 0;
		this.grauSaida = 0;
		this.creditos = 0;
		this.codigo = _codigo;
		this.nome = _nome;	
	
	}

	public void aumentaGrauSaida() {
	
		this.grauSaida++;
	
	}

	public void aumentaGrauEntrada() {
	
		this.grauEntrada++;
	
	}

	public void diminuiGrauSaida() {
	
		this.grauSaida--;
	
	}

	public void diminuiGrauEntrada() {
	
		this.grauEntrada--;
	
	}

	public void addSucessor(Vertice v) {
	
		this.sucessores.put(v.getCodigo(), v);
	
	}

	public void addAntecessor(Vertice v) {
	
		this.antecessores.put(v.getCodigo(), v);
	
	}

	public void removeSucessor(Vertice v) {
	
		this.sucessores.remove(v.getCodigo());
	
	}

	public void removeAntecessor(Vertice v) {
	
		this.antecessores.remove(v.getCodigo());
	
	}

	public String getCodigo() {
	
		return this.codigo;
	
	}

	public HashMap<String, Vertice> getSucessores() {
	
		return this.sucessores;
	
	}

	public HashMap<String, Vertice> getAntecessores() {

		return this.antecessores;

	}

	public int getGrauEntrada() {

		return this.grauEntrada;

	}

	public int getGrauSaida() {

		return this.grauSaida;

	}

	public int getCreditos() {

		return this.creditos;

	}
}