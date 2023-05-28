public class Veiculo {
    private String placa;
    private int ano;

    public Veiculo() {}

    public Veiculo(String placa, int ano) {
        this.placa = placa;
        this.ano = ano;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Veiculo{" + "placa=" + placa +", ano=" + ano + '}';
    }
}
public class Onibus extends Veiculo {
    private int assentos;

    public Onibus(String placa, int ano, int assentos) {
        super(placa, ano);
        this.assentos = assentos;
    }

    public int getAssentos() {
        return assentos;
    }

    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }

    @Override
    public String toString() {
        return "Onibus{" + "placa=" + getPlaca() + ", ano=" + getAno() + ", assentos=" + assentos + '}';
    }
}
public class Caminhao extends Veiculo {
    private int eixos;

    public Caminhao() {
        super();
    }

    public Caminhao(String placa, int ano, int eixos) {
        super(placa, ano);
        this.eixos = eixos;
    }

    public int getEixos() {
        return eixos;
    }

    public void setEixos(int eixos) {
        this.eixos = eixos;
    }

    @Override
    public String toString() {
        return "Caminhao{" + "placa=" + getPlaca() + ", ano=" + getAno() + ", eixos=" + eixos + '}';
    }
}
