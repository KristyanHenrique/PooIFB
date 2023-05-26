
public class Main{
    public static void main(String args[]){
        System.out.println(ConversaoDeTemperatura.cf(1));
        System.out.println(ConversaoDeTemperatura.fc(1));
        System.out.println(ConversaoDeTemperatura.ck(1));
        System.out.println(ConversaoDeTemperatura.kc(1));
        System.out.println(ConversaoDeTemperatura.cRe(1));
        System.out.println(ConversaoDeTemperatura.Rec(1));
        System.out.println(ConversaoDeTemperatura.kr(1));
        System.out.println(ConversaoDeTemperatura.rk(1));
    }
}

class ConversaoDeTemperatura{
    public static double cf (double c){
		return ((9*c)/5)+32; 
	}
    public static double fc (double f){
		return (f - 32)*+(5/9);  
	}
    public static double ck (double c){
		return (c + 273.15);  
	}
    public static double kc (double k){
		return (k - 273.15);  
	}
    public static double cRe (double c){
		return (c * (4/5));  
	}
    public static double Rec (double Re){
		return (Re * (5/4));  
	}
    public static double kr (double k){
		return (k * 1.8);  
	}
    public static double rk (double r){
		return (r/1.8);  
	}

    
}