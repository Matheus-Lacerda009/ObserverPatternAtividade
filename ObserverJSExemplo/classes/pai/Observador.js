class Observador{
    constructor(){}
    atualizarInfo(){
        throw new Error("O método atualizarInfo deve ser implementado nas classes filhas!");
    };
}

module.exports = Observador;