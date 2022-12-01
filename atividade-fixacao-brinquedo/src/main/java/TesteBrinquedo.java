public class TesteBrinquedo {
    public static void main(String[] args) {
        Lojinha lojinha = new Lojinha();

        BrinquedoArtesanal brinquedoArtesanal = new BrinquedoArtesanal(
                "Dudu",
                1,
                8.7,
                "07/01/2002",
                10
        );

        BrinquedoFabrica brinquedoFabrica = new BrinquedoFabrica(
                "Megumin",
                2,
                10.9,
                "23/05/1995"
        );

        lojinha.addBrinquedo(brinquedoFabrica);
        lojinha.addBrinquedo(brinquedoArtesanal);

        System.out.println(lojinha);

        lojinha.exibirBrinquedos();

        System.out.println(lojinha.calculaTotalValor());





    }
}
