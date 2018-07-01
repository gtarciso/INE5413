import java.util.*;

public class Main{

	public static void main(String[] args) {

		tarefaUM();


	}

	public static void tarefaUM() {
		
		Grafo g = new Grafo();
		
		// Primeira fase
		Vertice ine5402 = new Vertice("INE5402", "Programação Orientada à Objetos");
		Vertice eel5105 = new Vertice("EEL5105", "Circuitos e Técnicas Digitais");
		Vertice mtm3100 = new Vertice("MTM3100", "Pré-Cálculo");
		Vertice ine5401 = new Vertice("INE5401", "Introdução à Ciência da Computação");
		Vertice ine5403 = new Vertice("INE5403", "Fundamentos de Matemática Discreta");

		// Segunda fase
		Vertice ine5404 = new Vertice("INE5404", "Programação Orientada à Objetos II");
		Vertice mtm3101 = new Vertice("MTM3101", "Cálculo I");
		Vertice ine5405 = new Vertice("INE5405", "Probabilidade e Estatística");
		Vertice mtm5512 = new Vertice("MTM5512", "Geometria Analítica");
		Vertice ine5406 = new Vertice("INE5406", "Sistemas Digitais");
		Vertice ine5407 = new Vertice("INE5407", "Ciência, Tecnologia e Sociedade");

		// Terceira fase
		Vertice mtm3102 = new Vertice("INE3102", "Cálculo II");
		Vertice ine5408 = new Vertice("INE5408", "Estrutura de Dados");
		Vertice ine5410 = new Vertice("INE5410", "Programação Concorrente");
		Vertice mtm5245 = new Vertice("MTM5245", "Álgebra Linear");
		Vertice ine5411 = new Vertice("INE5411", "Organização de Computadores");

		// Quarta Fase
		Vertice ine5409 = new Vertice("INE5409", "Cálculo Numérico");
		Vertice ine5417 = new Vertice("INE5417", "Engenharia de Software");
		Vertice ine5413 = new Vertice("INE5413", "Grafos");
		Vertice ine5415 = new Vertice("INE5415", "Teoria da Computação");
		Vertice ine5416 = new Vertice("INE5416", "Paradigmas de Programação");
		Vertice ine5412 = new Vertice("INE5412", "Sistemas Operacionais I");
		Vertice ine5414 = new Vertice("INE5414", "Redes de Computadores");
		
		// Quinta Fase
		Vertice ine5419 = new Vertice("INE5419", "Engenharia de Software II");
		Vertice ine5423 = new Vertice("INE5423", "Banco de Dados I");
		Vertice ine5420 = new Vertice("INE5420", "Computação Gráfica");
		Vertice ine5421 = new Vertice("INE5421", "Linguagens Formais e Compiladores");
		Vertice ine5418 = new Vertice("INE5418", "Computação Distribuída");
		Vertice ine5422 = new Vertice("INE5422", "Redes II");

		// Sexta Fase
		Vertice ine5427 = new Vertice("INE5427", "Planejamento e Gestão de Projetos");
		Vertice ine5453 = new Vertice("INE5453", "Introdução ao TCC");
		Vertice ine5425 = new Vertice("INE5425", "Modelagem e Simulação");
		Vertice ine5430 = new Vertice("INE5430", "Inteligência Artificial");
		Vertice ine5426 = new Vertice("INE5426", "Construção de Compiladores");
		Vertice ine5424 = new Vertice("INE5424", "Sistemas Operacionais II");

		// Sétima fase
		Vertice ine5433 = new Vertice("INE5433", "TCC I");
		Vertice ine5432 = new Vertice("INE5432", "Banco de Dados II");
		Vertice ine5429 = new Vertice("INE5429", "Segurança em Computação");
		Vertice ine5431 = new Vertice("INE5431", "Sistemas Multimídia");
		Vertice ine5428 = new Vertice("INE5428", "Informática e Sociedade");

		// Oitava fase
		Vertice ine5434 = new Vertice("INE5434", "TCC II");

		//******************************************************************************

		// Primeira fase
		g.addVertice(ine5402);
		g.addVertice(mtm3100);
		g.addVertice(ine5403);
		g.addVertice(ine5401);
		g.addVertice(eel5105);

		// Segunda fase
		g.addVertice(ine5404);
		g.addVertice(mtm3101);
		g.addVertice(mtm5512);
		g.addVertice(ine5406);
		g.addVertice(ine5407);

		// Terceira fase
		g.addVertice(ine5408);
		g.addVertice(ine5410);
		g.addVertice(mtm3102);
		g.addVertice(ine5405);
		g.addVertice(mtm5245);
		g.addVertice(ine5411);

		// Quarta fase
		g.addVertice(ine5417);
		g.addVertice(ine5413);
		g.addVertice(ine5415);
		g.addVertice(ine5416);
		g.addVertice(ine5409);
		g.addVertice(ine5412);
		g.addVertice(ine5414);

		// Quinta fase
		g.addVertice(ine5419);
		g.addVertice(ine5423);
		g.addVertice(ine5420);
		g.addVertice(ine5421);
		g.addVertice(ine5418);
		g.addVertice(ine5422);

		// Sexta fase
		g.addVertice(ine5427);
		g.addVertice(ine5453);
		g.addVertice(ine5425);
		g.addVertice(ine5430);
		g.addVertice(ine5426);
		g.addVertice(ine5424);

		// Sétima fase
		g.addVertice(ine5433);
		g.addVertice(ine5432);
		g.addVertice(ine5429);
		g.addVertice(ine5431);
		g.addVertice(ine5428);

		// Oitava fase
		g.addVertice(ine5434);

		//******************************************************************************

		// Pre-requisitos segunda fase
		g.conecta(ine5402, ine5404);
		g.conecta(mtm3100, mtm3101);
		g.conecta(eel5105, ine5406);

		// Pre-requisitos terceira fase
		g.conecta(ine5404, ine5408);
		g.conecta(ine5404, ine5410);
		g.conecta(mtm3101, mtm3102);
		g.conecta(mtm3101, ine5405);
		g.conecta(mtm5512, mtm5245);
		g.conecta(ine5406, ine5411);

		// Pre-requisitos quarta fase
		g.conecta(ine5408, ine5417);
		g.conecta(ine5408, ine5413);
		g.conecta(ine5408, ine5415);
		g.conecta(ine5408, ine5416);
		g.conecta(ine5403, ine5413);
		g.conecta(ine5403, ine5415);
		g.conecta(mtm3102, ine5409);
		g.conecta(mtm5512, ine5409);
		g.conecta(ine5411, ine5412);
		g.conecta(ine5410, ine5412);
		g.conecta(ine5404, ine5414);

		// Pre-requisitos quinta fase
		g.conecta(ine5417, ine5419);
		g.conecta(ine5408, ine5423);
		g.conecta(mtm3102, ine5420);
		g.conecta(mtm5245, ine5420);
		g.conecta(ine5408, ine5420);
		g.conecta(ine5415, ine5421);
		g.conecta(ine5412, ine5418);
		g.conecta(ine5414, ine5418);
		g.conecta(ine5414, ine5422);

		// Pre-requisitos sexta fase
		g.conecta(ine5419, ine5427);
		g.conecta(ine5419, ine5453);
		g.conecta(ine5405, ine5425);
		g.conecta(ine5405, ine5430);
		g.conecta(ine5413, ine5430);
		g.conecta(ine5421, ine5426);
		g.conecta(ine5412, ine5424);

		// Pre-requisitos sétima fase
		g.conecta(ine5427, ine5433);
		g.conecta(ine5453, ine5433);
		g.conecta(ine5423, ine5432);
		g.conecta(ine5403, ine5429);
		g.conecta(ine5414, ine5429);
		g.conecta(ine5414, ine5431);
		g.conecta(ine5407, ine5428);

		// Pre-requisito oitava fase
		g.conecta(ine5433, ine5434);
			
		getOrdemTopologica(g);

	}

	/*
	 * Algoritmo para obter ordenação topológica feito seguindo o algoritmo
	 * em pseudo-código em: https://pt.wikipedia.org/wiki/Ordenação_Topológica
	 */
	public static void getOrdemTopologica(Grafo g) {
		// Lista vazia que irá conter os elementos ordenados
		List<Vertice> l = new ArrayList<Vertice>();

		// Conjunto de todos os nós sem arestas de Entrada
		List<Vertice> s = new ArrayList<Vertice>();
		HashMap<String, Vertice> vertices = g.getVertices();
		Object codigos[] = vertices.keySet().toArray();


		for(int i = 0; i < vertices.size(); i++) {
			Vertice aux = vertices.get(codigos[i]);
			if(g.getGrauEntrada(aux) == 0) {
				s.add(aux);
			}
		}

		while(!s.isEmpty()) {
			
			Vertice v = s.remove(0);
			l.add(v);

			HashMap<String, Vertice> suces = g.getSucessores(v);
			Object sucessores[] = suces.keySet().toArray();
			int cont = 0;

			int tam = suces.size();
			for(int i = 0; i < tam; i++) {
				Vertice m = vertices.get(sucessores[i]);
				g.desconecta(v, m);
				cont++;
				if(g.getGrauEntrada(m) == 0) {
					s.add(m);
				}
			}

		}

		boolean ciclo = false;

		HashMap<String, Vertice> vertices2 = g.getVertices();
		for(int i = 0; i < vertices.size(); i++) {
			Vertice aux = vertices2.get(codigos[i]);
			if(g.getGrauEntrada(aux) != 0 || g.getGrauSaida(aux) != 0) {
				ciclo = true;
				break;
			}
		}

		if(ciclo) {

			System.out.println("O grafo possui pelo menos 1 ciclo");

		} else {

			for(Vertice x : l) {
				System.out.println(x.getCodigo());
			}

		}

	}
}