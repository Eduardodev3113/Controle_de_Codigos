import { Conta } from "./Conta.js";
import { Pessoa } from "./Pessoa.js";



let pessoa1 = new Pessoa("Dudu", 18, 49999190145);
let pessoa2 = new Pessoa("Vivi", 18, 49999190123);

try {
    pessoa1.maiorIdade();
    pessoa2.maiorIdade();
}    catch (error){
        console.log(error);
    }

let conta1 = new Conta (pessoa1)
let conta2 = new Conta (pessoa2)

conta1.depositar(5000)
conta1.depositar(1500)
conta2.depositar(3000)

console.log("Inicio")
console.log(conta1.titular.nome + " - R$" + conta1.saldo);
console.log(conta2.titular.nome + " - R$" + conta2.saldo);
try {
    
    conta1.sacar(1900)
    conta2.sacar(1000)

} catch (error) {
    console.log(error);
}

try {
    conta2.sacar(9999)

} catch (error) {
    console.log(error)
}

try {
    conta1.transferir(conta2, 1200);
} catch (error) {
    console.log(error)
}

console.log("=== EXTRATO FINAL ===");
conta1.exibirHistorico();
console.log("-----------------------")
conta2.exibirHistorico();


