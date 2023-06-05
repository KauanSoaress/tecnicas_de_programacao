// Decorator concreto
public class Rede extends Decorator {

    Rede (Mesa mesa) {
        super(mesa);
    }
    void rede() {
        System.out.println("Agora uma mesa com rede");
    }
    void executar() {
        super.executar();
        this.rede();
    }
}