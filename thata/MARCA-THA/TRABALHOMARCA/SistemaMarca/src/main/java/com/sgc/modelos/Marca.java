package main.java.com.sgc.modelos;

public class Marca {

    // Atributos
    private String nome;
    private String fundador;
    private int anoFundacao;
    private String segmento;

    // Construtor vazio
    public Marca() {
    }

    // Construtor com parâmetros
    public Marca(String nome, String fundador, int anoFundacao, String segmento) {
        this.nome = nome;
        this.fundador = fundador;
        this.anoFundacao = anoFundacao;
        this.segmento = segmento;
    }

    // Método específico
    public String verificarTempoMercado() {
        if (anoFundacao < 2000) {
            return "Marca tradicional no mercado.";
        } else {
            return "Marca moderna no mercado.";
        }
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFundador() {
        return fundador;
    }

    public void setFundador(String fundador) {
        this.fundador = fundador;
    }

    public int getAnoFundacao() {
        return anoFundacao;
    }

    public void setAnoFundacao(int anoFundacao) {
        this.anoFundacao = anoFundacao;
    }

    public String getSegmento() {
        return segmento;
    }

    public void setSegmento(String segmento) {
        this.segmento = segmento;
    }

    // toString
    @Override
    public String toString() {
        return "Marca{" +
                "nome='" + nome + '\'' +
                ", fundador='" + fundador + '\'' +
                ", anoFundacao=" + anoFundacao +
                ", segmento='" + segmento + '\'' +
                '}';
    }
}