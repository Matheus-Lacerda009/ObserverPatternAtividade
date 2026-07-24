const Sujeito = require('../pai/Sujeito');
const Pessoa = require('./Pessoa');

class Pedido extends Sujeito{
    constructor(itens, preco){
        super();
        this.itens = itens;
        this.preco = preco;
        this.observadores = [];
    }

    trocaritens(itens, preco){
        this.itens = itens;
        this.preco = preco;
        this.transmitirInfo();
    }

    adicionarObservador(observador){
        this.observadores.push(observador);
    }

    excluirObservador(observador){
        this.observadores.splice(observadores.indexOf(observador), 1);
    }

    transmitirInfo(){
        this.observadores.forEach(observador => {
            observador.atualizarInfo(this.itens);
        });
    }
}

module.exports = Pedido;