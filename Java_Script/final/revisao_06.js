const produto1 = new Produtos("Camisa", 50, 10);
const produto2 = new Produtos("Calça", 120, 5);
const produto3 = new Produtos("Tênis", 200, 3);

const cliente1 = "Alice";
const cliente2 = "Bruno";

const carrinho1 = new Carrinho(cliente1);
const carrinho2 = new Carrinho(cliente2);

carrinho1.addProduto(produto1);
carrinho1.addProduto(produto2);

carrinho2.addProduto(produto2);
carrinho2.addProduto(produto3);

Carrinho.prototype.calcularTotal = function() {
    let total = 0;
    for (let produto of this.itens) {
        if (produto.preco == null || produto.preco < 0) {
            console.log("Aviso: produto com preço inválido encontrado e ignorado");
            continue;
        }
        total += produto.preco;
    }
    return total;
}

carrinho1.exibirResumo();
carrinho2.exibirResumo();