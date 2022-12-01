import java.util.ArrayList;
import java.util.List;

public class Lojinha {

    private List<IBrinquedo> brinquedos;

    public Lojinha() {
        brinquedos = new ArrayList<>();
    }

    public void addBrinquedo(IBrinquedo it){
        brinquedos.add(it);
    }

    public Double calculaTotalValor() {
        double total = 0.0;
        for (IBrinquedo it : brinquedos) {
            total += it.calculoPreco();
        }
        return total;
    }

    public void exibirBrinquedos(){
        System.out.println("Lista de todos os brinquedos");
        System.out.println(brinquedos);
    }

    @Override
    public String toString() {
        return "Lojinha{" +
                "brinquedos=" + brinquedos +
                '}';
    }
}
