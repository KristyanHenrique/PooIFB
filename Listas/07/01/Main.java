public class Main {
    public static void main(String[] args) {
        DVD dvd = new DVD();
        dvd.setCodigo(1);
        dvd.setPreco(19.99);
        dvd.setNome("DVD Example");
        dvd.setNFaixas(12);
        dvd.setTipo(1);

        CD cd = new CD();
        cd.setCodigo(2);
        cd.setPreco(9.99);
        cd.setNome("CD Example");
        cd.setNome("CD Example");
        cd.setNMusicas(15);
        cd.setTipo(0);

        System.out.println(dvd.toString());
        System.out.println(cd.toString());
    }
}


public class Midia{
    private int codigo;
    private double preco;
    private String nome;
    private boolean tipo;//0- Cd | 1 - dvd

    public void Midia() {}
    public void Midia(int c, double p, String n, boolean t) {
        this.codigo = c;
        this.preco = p;
        this.nome = n;
        this.tipo = t;

    }
    public String toString(){
        if(this.tipo == 1){
            return "Codigo: " + this.codigo + "Preco: " + this.preco + "Nome: " + this.nome + " DVD";
        }else{
            return "Codigo: " + this.codigo + "Preco: " + this.preco + "Nome: " + this.nome + " CD";
        }
           
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
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

public class DVD extends midia{
    private int nFaixas;

    public int getNFaixas() {
        return this.nFaixas;
    }

    public void setNFaixas(int nFaixas) {
        this.nFaixas = nFaixas;
    }

}

public class CD extends midia{
    private int nMusicas;

    public int getNMusicas() {
        return this.nMusicas;
    }

    public void setNMusicas(int nMusicas) {
        this.nMusicas = nMusicas;
    }

}

