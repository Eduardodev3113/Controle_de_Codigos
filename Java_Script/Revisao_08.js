import { Pessoa } from "./Pessoa.js";
import { Produtos } from "./final/produto.js";
import { Carrinho } from "./final/carrinho.js";

let Pessoa1 = new Pessoa("Dudu", 17, "49999190143")
let Pessoa2 = new Pessoa("Vivi", 18, "49999190432")

let produto1 = new Produtos("Maça", 7, 20);
let produto2 = new Produtos("Chocolate", 15, 25);
let produto3 = new Produtos("Table", 1500, 2);

let carrinho1 = new Carrinho(Pessoa1);
let carrinho2 = new Carrinho(Pessoa2);

carrinho1.addProduto(produto3)
carrinho1.addProduto(produto2)

carrinho2.addProduto(produto1)
carrinho2.addProduto(produto2)