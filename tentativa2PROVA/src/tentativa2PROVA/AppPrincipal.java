package tentativa2PROVA;

import java.util.ArrayList;
import java.util.List;

public class AppPrincipal {
	public static void main(String[] args) {
		List<Desenho> listaDesenhos = new ArrayList<Desenho>();

		List<Forma> forma1 = new ArrayList<Forma>();

		Forma triangulo = new Triangulo(5, 3);
		Forma retangulo = new Retangulo(4, 2);

		forma1.add(triangulo);
		forma1.add(retangulo);

		Desenho desenho1 = new Desenho(forma1);

		List<Forma> forma2 = new ArrayList<Forma>();
		Forma triangulo2 = new Triangulo(5, 3);
		Forma quadrado = new Quadrado(4);
		forma2.add(triangulo2);
		forma2.add(quadrado);
		
		Desenho desenho2 = new Desenho(forma2);
		listaDesenhos.add(desenho1);
		listaDesenhos.add(desenho2);
	
		for(Desenho d1 : listaDesenhos) {
			System.out.println("AREA TOTAL " + d1.calcularAreaTotal());
			
			for (Forma forma : d1.getListaDeFormas()) {
				System.out.println("Area "+ forma.calcularArea());
				
			}
		
			
		}
	}
}
