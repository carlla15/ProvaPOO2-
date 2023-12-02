package tentativa2PROVA;

public class Quadrado extends Forma{
private double lado;

public double getLado() {
	return lado;
}

public void setLado(double lado) {
	this.lado = lado;
}

public Quadrado(double lado) {
	this.lado=lado;
}

@Override
public double calcularArea() {
	// TODO Auto-generated method stub
	return Math.pow(lado, 2);
}

}
