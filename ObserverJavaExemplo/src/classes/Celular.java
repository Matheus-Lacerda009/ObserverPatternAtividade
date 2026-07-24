package classes;

import interfaces.Observador;

public class Celular implements Observador{

    @Override
    public void atualizarInfo(boolean sinalRecebido){
        if(sinalRecebido) {
            System.out.println("Sinal de movimento recebido do sensor por um celular!");
        } else {
            System.out.println("Nenhum sinal de movimento recebido do sensor pelo celular!");
        }
    }
}
