package classes;

import exceptions.SinalJaFalsoException;
import interfaces.Observador;
import interfaces.Sujeito;

import java.util.ArrayList;

public class Sensor implements Sujeito {
    private ArrayList<Observador> computadores = new ArrayList<>();
    private boolean sinal;

    public void setSinal(boolean sinal) throws SinalJaFalsoException{
        if(!this.sinal && !sinal){
            throw new SinalJaFalsoException("Erro: O sinal já foi setado como falso!");
        }
        this.sinal = sinal;
        transmitirInfo();
    }



    @Override
    public void adicionarObservador(Observador observador){
        computadores.add(observador);
    }

    @Override
    public void excluirObservador(Observador observador){
        computadores.remove(observador);
    }

    @Override
    public void transmitirInfo(){
        for(Observador observador : computadores){
            observador.atualizarInfo(sinal);
        }
    }
}
