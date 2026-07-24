const Observador = require('../pai/Observador');

class Pessoa extends Observador{
    constructor(nome, idade){
        super();
        this.nome = nome;
        this.idade = idade;
    }

    atualizarInfo(itens){
        console.log(`Olá ${this.nome}! Seu pedido foi alterado! Nova lista do pedido: ${itens}`);
    }
}

module.exports = Pessoa;