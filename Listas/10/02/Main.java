import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        Gerente gerente = new Gerente("João", "123", 5000.0);
        Assistente assistente = new Assistente("Maria", "456", 2000.0);
        Vendedor vendedor = new Vendedor("Pedro", "789", 1500.0, 500.0);

        funcionarios.add(gerente);
        funcionarios.add(assistente);
        funcionarios.add(vendedor);

        double folhaSalarial = 0.0;
        for (Funcionario funcionario : funcionarios) {
            folhaSalarial += funcionario.calculaSalario();
        }

        System.out.println("Folha salarial: " + folhaSalarial);
    }
}

abstract class Funcionario {
    private String nome;
    private String matricula;
    private double salario_base;

    public Funcionario(String nome, String matricula, double salario_base) {
        this.nome = nome;
        this.matricula = matricula;
        this.salario_base = salario_base;
    }

    public abstract double calculaSalario();

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public double getSalarioBase() {
        return salario_base;
    }
}

class Gerente extends Funcionario {
    public Gerente(String nome, String matricula, double salario_base) {
        super(nome, matricula, salario_base);
    }

    @Override
    public double calculaSalario() {
        return getSalarioBase() * 2;
    }
}

class Assistente extends Funcionario {
    public Assistente(String nome, String matricula, double salario_base) {
        super(nome, matricula, salario_base);
    }

    @Override
    public double calculaSalario() {
        return getSalarioBase();
    }
}

class Vendedor extends Funcionario {
    private double comissao;

    public Vendedor(String nome, String matricula, double salario_base, double comissao) {
        super(nome, matricula, salario_base);
        this.comissao = comissao;
    }

    @Override
    public double calculaSalario() {
        return getSalarioBase() + comissao;
    }
}



// Abstração: A classe abstrata Funcionario é uma abstração que define um método calculaSalario() que deve ser implementado pelas subclasses. Ela também possui atributos e um construtor para armazenar informações comuns a todos os funcionários.

// Herança: As classes Gerente, Assistente e Vendedor são subclasses da classe abstrata Funcionario. Elas herdam os atributos e métodos da classe base e implementam o método calculaSalario() de acordo com as regras específicas de cada cargo.

// Polimorfismo: A lista de funcionários (List<Funcionario>) é capaz de armazenar objetos