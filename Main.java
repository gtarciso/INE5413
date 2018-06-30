
public class Main{

	public static void main(String[] args) {
		Grafo g = new Grafo();
		Vertice v = new Vertice("a", "a");
		Vertice w = new Vertice("b", "c");
		g.addVertice(v);
		g.addVertice(w);
		g.conecta(v, w);

		System.out.println(g.getGrauEntrada(v));
		System.out.println(g.getGrauSaida(v));

		System.out.println(g.getGrauEntrada(w));
		System.out.println(g.getGrauSaida(w));

		g.desconecta(v, w);

		System.out.println(g.getGrauEntrada(v));
		System.out.println(g.getGrauSaida(v));

		System.out.println(g.getGrauEntrada(w));
		System.out.println(g.getGrauSaida(w));

		System.out.println(g.getOrdem());


	}
}