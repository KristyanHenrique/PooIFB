public class Main {
    public static void main(String[] args) {
        PF pessoaFisica = new PF();
        pessoaFisica.setNome("João");
        pessoaFisica.setCPF("1234567890");

        PJ pessoaJuridica = new PJ();
        pessoaJuridica.setNome("Empresa XYZ");
        pessoaJuridica.setCNPJ("0987654321");

        System.out.println(pessoaFisica.toString());
        System.out.println(pessoaJuridica.toString());
    }
}



public class Pessoa{
    private String nome;
	private boolean tipo;
    public void Midia() {}
	
    public void Pessoa(String n, boolean t) {
        this.nome = n;
		this.tipo = t;

    }

    public String toString(){
        if(this.tipo == 1){
			return "Nome: " + this.nome + " PF";
		}else{
			return "Nome: " + this.nome + " PJ";
		}
    }
	

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isTipo() {
		return this.tipo;
	}

	public void setTipo(boolean tipo) {
		this.tipo = tipo;
	}
}

public class PF extends Pessoa{
	private String CPF;

	public String getCPF() {
		return this.CPF;
	}

	public void setCPF(String CPF) {
		this.CPF = CPF;
	}
	@override
	public void Pessoa(String n) {
        this.nome = n;
		this.tipo = 1;
    }
}

public class PJ extends Pessoa{
	private String CNPJ;

	public String getCNPJ() {
		return this.CNPJ;
	}

	public void setCNPJ(String CNPJ) {
		this.CNPJ = CNPJ;
	}
	@override
	public void Pessoa(String n) {
        this.nome = n;
		this.tipo = 0;

    }
}