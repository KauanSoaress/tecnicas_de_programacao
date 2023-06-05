// Decorator concreto
public class Rodas extends Decorator {
    Rodas (Mesa mesa) {
        super(mesa);
    }
    void rodas() {
        System.out.println("Agora uma mesa com rodas");
    }
    void executar() {
        super.executar();
        this.rodas();
    }
}