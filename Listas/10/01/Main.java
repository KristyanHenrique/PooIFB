public Main{
    public static void main(String args[]){
        Elevador elevador = new Elevador(10, 8, 0);
        System.out.println("Andar atual: " + elevador.andarAtual);
        System.out.println("Número de pessoas: " + elevador.nPessoas);
        elevador.entrar();
        elevador.entrar();
        elevador.subir();
        System.out.println("Andar atual: " + elevador.andarAtual);
        System.out.println("Número de pessoas: " + elevador.nPessoas);
        elevador.sair();
        elevador.descer();
        elevador.descer();
        System.out.println("Andar atual: " + elevador.andarAtual);
        System.out.println("Número de pessoas: " + elevador.nPessoas);
    }
}

public Elevador{
    private int andarAtual;
    private int nAndares;
    private int maxPessoas;
    private int nPessoas;

    public Elevador(int nAndares,int maxPessoas,int nPessoas){
        this.andarAtual = 0;
        this.nAndares = nAndares;
        this.maxPessoas = maxPessoas;
        this.nPessoas = nPessoas;
    }

    public void entrar(){
        if(this.nPessoas < this.maxPessoas){
            this.nPessoas++; 
        }
    }

    public void sair(){
        if(this.nPessoas > 0){
            this.nPessoas--; 
        }
    }

    public void descer(){
        if(this.andarAtual > 0){
            this.andarAtual--; 
        }
    }

    public void subir(){
        if(this.andarAtual < this.nAndares){
            this.andarAtual++; 
        }
    }

	public int getNAndares() {
		return this.nAndares;
	}

	public void setNAndares(int nAndares) {
		this.nAndares = nAndares;
	}

	public int getMaxPessoas() {
		return this.maxPessoas;
	}

	public void setMaxPessoas(int maxPessoas) {
		this.maxPessoas = maxPessoas;
	}

	public int getNPessoas() {
		return this.nPessoas;
	}

	public void setNPessoas(int nPessoas) {
		this.nPessoas = nPessoas;
	}



}