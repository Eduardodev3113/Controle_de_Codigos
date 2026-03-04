export class Conta {
    constructor(titular) {
    this.titular = titular;
    this.saldo = 0;
    }

    depositar (valor) {
        if (valor <= 0){
            throw "Valor Insuficiente"
        }

        this.saldo += valor;
    }

    /*this.sacar = (valor) =>{
        this.saldo -= valor;
    }
    */
    
    sacar (valor) {
        if(this.saldo < valor){
        throw "Saldo Insuficiente"
        }
        this.saldo -= valor;

    }

    transferir (outraConta,valor) {
        this.sacar(valor);
        outraConta.depositar(valor);
    
    }
}

let conta1 = new Conta("Dudu");
let conta2 = new Conta("Vivi")

conta1.depositar(2000);
conta2.depositar(3000);

console.log("Transação 01")
console.log(conta1.titular + " - R$ " + conta1.saldo)
console.log(conta2.titular + " - R$ " + conta2.saldo)

try {

    conta1.sacar(2900);
    conta2.sacar(1000);

} catch (error) {
    console.error("Erro: " + error );
}

console.log("Transação 02")
console.log(conta1.titular + " - R$ " + conta1.saldo)
console.log(conta2.titular + " - R$ " + conta2.saldo)

conta2.transferir(conta1, 500);

console.log("Transação 03")
console.log(conta1.titular + " - R$ " + conta1.saldo)
console.log(conta2.titular + " - R$ " + conta2.saldo)

try{

    conta1.depositar(0);

} catch (error) {
    console.error ("Erro: " + error);
}

console.log("Transação 4")
console.log(conta1.titular + " - R$ " + conta1.saldo)