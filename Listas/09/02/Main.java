public class Main {
    public static void main(String[] args) {
        Prova prova1 = new Prova("Prova 1", 8.5, true);
        Seminario seminario1 = new Seminario("Seminário 1", 9.2, 60.0);
        EstudoDirigido estudoDirigido1 = new EstudoDirigido("Estudo Dirigido 1", 7.8, "Matemática", 10);

        System.out.println(prova1);
        System.out.println(seminario1);
        System.out.println(estudoDirigido1);

        Bimestre bimestre1 = new Bimestre(1, prova1, seminario1, estudoDirigido1);
        System.out.println(bimestre1);
    }
}

public abstract class Avaliacao {
    private String nome;
    private double nota;

    public Avaliacao(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public double getNota() {
        return nota;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Avaliação [nome=" + nome + ", nota=" + nota + "]";
    }
}

public class Prova extends Avaliacao {
    private boolean consultaAutorizado;

    public Prova(String nome, double nota, boolean consultaAutorizado) {
        super(nome, nota);
        this.consultaAutorizado = consultaAutorizado;
    }

    @Override
    public String toString() {
        return "Prova [nome=" + getNome() + ", nota=" + getNota() + ", consultaAutorizado=" + consultaAutorizado + "]";
    }
}

public class Seminario extends Avaliacao {
    private double tempo;

    public Seminario(String nome, double nota, double tempo) {
        super(nome, nota);
        this.tempo = tempo;
    }

    @Override
    public String toString() {
        return "Seminario [nome=" + getNome() + ", nota=" + getNota() + ", tempo=" + tempo + "]";
    }
}
public class EstudoDirigido extends Avaliacao {
    private String tema;
    private int numeroDePagina;

    public EstudoDirigido(String nome, double nota, String tema, int numeroDePagina) {
        super(nome, nota);
        this.tema = tema;
        this.numeroDePagina = numeroDePagina;
    }

    @Override
    public String toString() {
        return "EstudoDirigido [nome=" + getNome() + ", nota=" + getNota() + ", tema=" + tema + ", numeroDePagina=" + numeroDePagina + "]";
    }
}
public class Bimestre {
    private int idBimestre;
    private Avaliacao av1;
    private Avaliacao av2;
    private Avaliacao av3;

    public Bimestre(int idBimestre, Avaliacao av1, Avaliacao av2, Avaliacao av3) {
        this.idBimestre = idBimestre;
        this.av1 = av1;
        this.av2 = av2;
        this.av3 = av3;
    }

    @Override
    public String toString() {
        return "Bimestre [idBimestre=" + idBimestre + ", av1=" + av1 + ", av2=" + av2 + ", av3=" + av3 + "]";
    }
}
