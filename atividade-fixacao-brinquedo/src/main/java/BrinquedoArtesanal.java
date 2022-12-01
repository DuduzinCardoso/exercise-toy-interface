import java.util.UUID;

public class BrinquedoArtesanal extends IBrinquedo{

    private double quantidadeHorasTrabalhadas;

    public BrinquedoArtesanal(String nome, Integer id, Double preco, String dataFabricacao, double quantidadeHorasTrabalhadas) {
        super(nome, id, preco, dataFabricacao);
        this.quantidadeHorasTrabalhadas = quantidadeHorasTrabalhadas;
    }

    @Override
    public double calculoPreco() {
        return getPreco() * quantidadeHorasTrabalhadas;
    }
}
