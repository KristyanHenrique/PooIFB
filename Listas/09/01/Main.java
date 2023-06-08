
abstract class Pagamento {

    protected double valor;



    public Pagamento(double valor) {

        this.valor = valor;

    }



    public abstract String imprimir();

}



class PagamentoEmDinheiro extends Pagamento {

    private double valorRecebido;

    private double troco;



    public PagamentoEmDinheiro(double valor, double valorRecebido) {

        super(valor);

        this.valorRecebido = valorRecebido;

        this.troco = valorRecebido - valor;

    }



    @Override

    public String imprimir() {

        return "Pagamento em dinheiro:\n" + "Valor total: R$" + valor + "\n" + "Valor recebido: R$" + valorRecebido + "\n" + "Troco: R$" + troco;

    }

}



class PagamentoEmCartao extends Pagamento {

    private String bandeira;

    private long numeroTransacao;



    public PagamentoEmCartao(double valor, String bandeira, long numeroTransacao) {

        super(valor);

        this.bandeira = bandeira;

        this.numeroTransacao = numeroTransacao;

    }



    @Override

    public String imprimir() {

        return "Pagamento em cartão:\n" + "Valor total: R$" + valor + "\n" + "Bandeira: " + bandeira + "\n" + "Número da transação: " + numeroTransacao;

    }

}



public class NotaFiscal {

    private int numero;

    private String resumo;

    private Pagamento pagamento;



    public NotaFiscal(int numero, String resumo, Pagamento pagamento) {

        this.numero = numero;

        this.resumo = resumo;

        this.pagamento = pagamento;

    }



    public void imprimirNota() {

        System.out.println("Nota Fiscal Número: " + numero);

        System.out.println("Resumo da compra:\n" + resumo);

        System.out.println("Forma de Pagamento:");

        System.out.println(pagamento.imprimir());

    }

}



public class NotaFiscalMain {

    public static void main(String[] args) {

    

        Pagamento pagamentoDinheiro = new PagamentoEmDinheiro(100.0, 150.0);

        NotaFiscal notaDinheiro = new NotaFiscal(1, "Descrição dos itens comprados", pagamentoDinheiro);

        notaDinheiro.imprimirNota();



    

        Pagamento pagamentoCartao = new PagamentoEmCartao(200.0, "Visa", 123456789);

        NotaFiscal notaCartao = new NotaFiscal(2, "Descrição dos itens comprados", pagamentoCartao);

        notaCartao.imprimirNota();

    }

}

