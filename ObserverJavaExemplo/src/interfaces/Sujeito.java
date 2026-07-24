package interfaces;

public interface Sujeito {
    void adicionarObservador(Observador observador);
    void excluirObservador(Observador observador);
    void transmitirInfo();
}
