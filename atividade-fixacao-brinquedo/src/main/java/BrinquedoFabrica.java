import java.util.UUID;

public class BrinquedoFabrica extends IBrinquedo {

    public BrinquedoFabrica(String nome, Integer id, Double preco, String dataFabricacao) {
        super(nome, id, preco, dataFabricacao);
    }

    @Override
    public double calculoPreco() {
        return getPreco();
    }
}
