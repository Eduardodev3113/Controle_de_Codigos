import { Pessoa } from "./Pessoa.js";

export class Conta {
    constructor(titular) {
        this.titular = titular;
        this.saldo = 0;
        this.historico = [];
    }

    depositar(valor) {
        if (valor <= 0) {
            throw "Valor inválido";
        }

        this.saldo += valor;
        this.historico.push("Depósito: R$ " + valor.toFixed(2));
    }

    sacar(valor) {
        if (this.saldo < valor) {
            throw "Saldo insuficiente";
        }

        this.saldo -= valor;
        this.historico.push("Saque: R$ " + valor.toFixed(2));
    }

    transferir(outraConta, valor) {
        this.sacar(valor);
        outraConta.depositar(valor);

        this.historico.push(
            "Transferência enviada para " +
            outraConta.titular.nome +
            " - R$ " + valor.toFixed(2)
        );

        outraConta.historico.push(
            "Transferência recebida de " +
            this.titular.nome +
            " - R$ " + valor.toFixed(2)
        );
    }

    exibirHistorico() {
        console.log("Conta de: " + this.titular.nome);

        if (this.historico.length === 0) {
            console.log("Nenhuma operação realizada");
        } else {
            for (let operacao of this.historico) {
                console.log(this.historico[operacao]);
            }
        }

        console.log("Saldo atual: R$ " + this.saldo.toFixed(2));
    }
}