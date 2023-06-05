// Classe Decorator, subclasse de Mesa também
abstract class Decorator extends Mesa{
    Mesa mesa;

    Decorator (Mesa mesa) {
        this.mesa = mesa;
    }

    void executar() {
        mesa.executar();
    }
}