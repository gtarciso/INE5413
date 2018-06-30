
import java.util.*;

public class Grafo {

	HashMap<String, Vertice> vertices;

	public Grafo() {
	
		this.vertices = new HashMap<>();
	
	}

	/*
	 ****************************************************************
     *************** 	Ações básicas de um Grafo	*****************
     ****************************************************************
	 */

	public void addVertice(Vertice v) {
		
		if(!vertices.containsKey(v.getCodigo())) {
			this.vertices.put(v.getCodigo(), v);	
		}
	
	}

	public void removeVertice(Vertice v) {
		
		if(vertices.containsKey(v.getCodigo())) {
			Object codigos[] = this.vertices.keySet().toArray();
			int size = vertices.size();
			for(int i = 0; i < size; i++) {
				Vertice aux = this.vertices.get(codigos[i]);
				desconecta(aux, v);
			}

			this.vertices.remove(v.getCodigo());
		}

	}

	public void conecta(Vertice v1, Vertice v2) {
		
		if(!v1.getSucessores().containsKey(v2.getCodigo())) {
			v1.aumentaGrauSaida();
			v2.aumentaGrauEntrada();
			v1.addSucessor(v2);
			v2.addAntecessor(v1);
		}

	}

	public void desconecta(Vertice v1, Vertice v2) {

		if(v1.getSucessores().containsKey(v2.getCodigo())) {
			v1.diminuiGrauSaida();
			v2.diminuiGrauEntrada();
			v1.removeSucessor(v2);
			v2.removeAntecessor(v1);
		}

	}

	public int getOrdem() {

		return this.vertices.size();

	}

	public HashMap<String, Vertice> getVertices() {

		return this.vertices;

	}

	public Vertice getUmVertice() {

		Object codigos[] = this.vertices.keySet().toArray();
		int size = vertices.size();
		Random rand = new Random();
		int v = rand.nextInt(size);
		return this.vertices.get(codigos[v]);

	}

	public HashMap<String, Vertice> getSucessores(Vertice v) {

		return v.getSucessores();

	}

	public HashMap<String, Vertice> getAntecessores(Vertice v) {
		return v.getAntecessores();
	}

	public int getGrauEntrada(Vertice v) {

		return v.getGrauEntrada();

	}

	public int getGrauSaida(Vertice v) {

		return v.getGrauSaida();

	}

}