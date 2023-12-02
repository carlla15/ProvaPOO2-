package tentativa2PROVA;

public class Retangulo extends Forma{
private double comprimento;
private double largura;
public double getComprimento() {
	return comprimento;
}
public void setComprimento(double comprimento) {
	this.comprimento = comprimento;
}
public double getLargura() {
	return largura;
}
public void setLargura(double largura) {
	this.largura = largura;
}
public Retangulo(double comprimento,double largura) {
	this.comprimento= comprimento;
	this.largura= largura;
}
public Retangulo() {
	// TODO Auto-generated constructor stub
}
@Override
public double calcularArea() {
	// TODO Auto-generated method stub
	return comprimento*largura;
}
}
