
public class Main{
    public static void main(String args[]){
        System.out.println(ConversorUnidadeTempo.ms(1));
        System.out.println(ConversorUnidadeTempo.hm(1));
        System.out.println(ConversorUnidadeTempo.dh(1));
        System.out.println(ConversorUnidadeTempo.sd(1));
        System.out.println(ConversorUnidadeTempo.md(1));
        System.out.println(ConversorUnidadeTempo.ad(1));

    }
}

class ConversorUnidadeTempo{
	public static int ms(int min){
		return (min*60);
	}
    public static int hm(int hora){
		return (hora*60);
	}
    public static int dh(int dia){
		return (dia*24);
	}
    public static int sd(int semana){
		return (semana*7);
	}
    public static int md(int mes){
		return (mes*30);
	}
    public static int ad(int ano){
		return (ano*365);
	}
}