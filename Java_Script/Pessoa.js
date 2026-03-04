export class Pessoa {
    constructor(nome, idade, telefone) {
    this.nome = nome;
    this.idade = idade;
    this.telefone = telefone;
    }

    maiorIdade () {
        if (this.idade < 18){
            throw "Menor de Idade"
        }
        return "Maior de Idade";

    }
}

let p = new Pessoa ("dudu", 18, 49999110143)

try{
    console.log(p.maiorIdade());

}catch (error){
    console.error("Erro: " + error);
}