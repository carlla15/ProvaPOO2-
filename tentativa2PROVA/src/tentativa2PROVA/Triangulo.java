package tentativa2PROVA;

public class Triangulo extends Forma {
private double base;
private double  altura;
public double getBase() {
	return base;
}
public void setBase(double base) {
	this.base = base;
}
public double getAltura() {
	return altura;
}
public void setAltura(double altura) {
	this.altura = altura;
}

public Triangulo(double base,double  altura) {
this.altura=altura;
this.base=base;
}
@Override
public double calcularArea() {
	// TODO Auto-generated method stub
	return (base*altura)/2;
}
}
