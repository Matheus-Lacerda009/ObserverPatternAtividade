const Pedido = require('./classes/filho/Pedido');
const Pessoa = require('./classes/filho/Pessoa');

pedido = new Pedido(["RTX 5070"], 4500);

ryan = new Pessoa("Ryan", 16);
matheus = new Pessoa("Matheus", 16);

pedido.adicionarObservador(ryan);
pedido.adicionarObservador(matheus);

pedido.trocaritens(["RTX 5070", "Ryzen 7 7700X"], 5500);