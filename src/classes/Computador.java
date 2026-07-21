package classes;

import interfaces.Observador;

public class Computador implements Observador{

    @Override
    public void atualizarInfo(boolean sinalRecebido){
        if(sinalRecebido) {
            System.out.println("Sinal de movimento recebido do sensor por um computador!");
        } else {
            System.out.println("Nenhum sinal de movimento recebido do sensor pelo computador!");
        }
    }
}
