public abstract class Figura {
    private String Cor;

	public String getCor() {
		return this.Cor;
	}

	public void setCor(String Cor) {
		this.Cor = Cor;
	}
}

public class Retangulo extends Figura {
    private double lado1;
    private double lado2;

    public Retangulo(double lado1, double lado2, String cor) {
        super.setCor(cor);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    @Override
    public double calcularArea() {
        return lado1 * lado2;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (lado1 + lado2);
    }

    @Override
    public String toString() {
        return "Retangulo [Lado 1: " + lado1 + ", Lado 2: " + lado2 + ", Cor: " + super.getCor() + "]";
    }
}
public class Quadrado extends Retangulo {
    public Quadrado(double lado, String cor) {
        super(lado, lado, cor);
    }

    @Override
    public String toString() {
        return "Quadrado [Lado: " + getLado1() + ", Cor: " + getCor() + "]";
    }
}
public class Triangulo extends Figura {
    private double base;
    private double altura;

    public Triangulo(double base, double altura, String cor) {
        super.setCor(cor);
        this.base = base;
        this.altura = altura;
    }

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

    public double calcularArea() {
        return (base * altura) / 2;
    }

    @Override
    public String toString() {
        return "Triangulo [Base: " + base + ", Altura: " + altura + ", Cor: " + super.getCor() + "]";
    }
}
public class Circulo extends Figura {
    private double raio;

    public Circulo(double raio, String cor) {
        super.setCor(cor);
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double calcularDiametro() {
        return 2 * raio;
    }

    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    @Override
    public String toString() {
        return "Circulo [Raio: " + raio + ", Cor: " + super.getCor() + "]";
    }
}
