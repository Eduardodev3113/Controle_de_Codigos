export class Carrinho {
    constructor(cliente) {
        this.cliente = cliente;  
        this.itens = [];          
    }

    addProduto(produto){
        this.itens.push(produto);
    }
    calcularTotal(){
        let total = 0

        for (let produtos in this.itens){
            console.log(produtos)
            total += produtos.preco
        }
        return total
    }

    exibirResumo() {
    console.log("Resumo do carrinho de " + this.cliente + ":");

    if (this.itens.length === 0) {
        console.log("O carrinho está vazio.");
        return;
    }

    let contador = 1;
    for (let produto of this.itens) {
        console.log(contador + ". " + produto.nome + " - R$ " + produto.preco.toFixed(2));
        contador++;
    }

    console.log("Total: R$ " + this.calcularTotal().toFixed(2));
}
}
