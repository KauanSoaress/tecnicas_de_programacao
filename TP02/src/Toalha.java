// Decorator concreto
public class Toalha extends Decorator {
    Toalha (Mesa mesa) {
        super(mesa);
    }
    void toalha() {
        System.out.println("Agora uma mesa com toalha");
    }
    void executar() {
        super.executar();
        this.toalha();
    }
}

