
public class Main{
    public static void main(String args[]){
        System.out.println(Calculadora.soma2(1,2));
        System.out.println(Calculadora.soma(1,2,3));
        System.out.println(Calculadora.sub2(1,2));
        System.out.println(Calculadora.sub(1,2,3));
        System.out.println(Calculadora.mult2(1,2));
        System.out.println(Calculadora.mult(1,2,3));
        System.out.println(Calculadora.div2(1,2));
        System.out.println(Calculadora.div(1,2,3));
       

    }
}

class Calculadora{
    public static int soma2 (int n1, int n2){
		return (n1+n2+0);
	}
	public static int soma (int n1, int n2, int n3){
		return (n1+n2+n3);
	}
    public static int sub2 (int n1, int n2){
		return (n1-n2);
	}
	public static int sub (int n1, int n2, int n3){
		return (n1-n2-n3);
	}
    public static int mult2 (int n1, int n2){
		return (n1*n2);
	}
    public static int mult (int n1, int n2, int n3){
		return (n1*n2*n3);
	}

    public static float div2 (int n1, int n2){
		return (n1/n2);
	}
    public static float div (int n1, int n2, int n3){
		return (n1/n2/n3);
	}
}