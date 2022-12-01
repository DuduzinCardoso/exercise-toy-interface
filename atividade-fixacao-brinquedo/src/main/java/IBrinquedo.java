import java.util.UUID;

public abstract class IBrinquedo {

    private String nome;
    private Integer id;
    private Double preco;
    private String dataFabricacao;

    public IBrinquedo(String nome, Integer id, Double preco, String dataFabricacao) {
        this.nome = nome;
        this.id = id;
        this.preco = preco;
        this.dataFabricacao = dataFabricacao;
    }

    public abstract double calculoPreco();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(String dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    @Override
    public String toString() {
        return "IBrinquedo{" +
                "nome='" + nome + '\'' +
                ", id=" + id +
                ", preco=" + preco +
                ", dataFabricacao='" + dataFabricacao + '\'' +
                '}';
    }
}
