package tentativa2PROVA;

import java.util.ArrayList;
import java.util.List;

public class Desenho {
List<Forma> listaDeFormas = new ArrayList<Forma>();

public Desenho(List<Forma> forma1) {
	this.listaDeFormas=forma1;
}
public List<Forma> getListaDeFormas() {
	return listaDeFormas;
}
public void setListaDeFormas(List<Forma> listaDeFormas) {
	this.listaDeFormas = listaDeFormas;
}
public void Desenho1(List<Forma> forma2) {
	// TODO Auto-generated constructor stub
}
public double calcularAreaTotal() {
	double contador=0;
	for (Forma forma : listaDeFormas) {
		contador +=forma.calcularArea();
	}
	return contador;


}
}