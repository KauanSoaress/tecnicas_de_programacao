public class Main {
    public static void main(String[] args) {
        Mesa mesa, rodas, toalha, rede;

        // Concrete component
        mesa = new MesaConcreta();

        // Decoradores - primeira maneira
        rodas = new Rodas(mesa);
        toalha = new Toalha(rodas);
        rede = new Rede(toalha);

        // Decoradores - segunda maneira
        mesa = new Rede(
            new Toalha (
                new Rodas (
                    new MesaConcreta ()
                )
            )
        );

        // Ordem:
        // rede -> toalha -> rodas -> mesa
        rede.executar();
        mesa.executar();
    }
}