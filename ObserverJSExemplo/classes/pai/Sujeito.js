class Sujeito{
    constructor(){}
    adicionarObservador(observador){
        throw new Error("O método adicionarObservador deve ser implementado nas classes filhas!");
    };
    excluirObservador(observador){
        throw new Error("O método excluirObservador deve ser implementado nas classes filhas!");
    };
    transmitirInfo(){
        throw new Error("O método transmitirInfo deve ser implementado nas classes filhas!");
    };
}
module.exports = Sujeito;