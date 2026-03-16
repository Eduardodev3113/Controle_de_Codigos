var pessoas = [];

for (var i = 1; i <= 4; i++) {
  var nome = prompt("Digite o nome da pessoa " + i + ": ");
  var idade = parseInt(prompt("Digite a idade de " + nome + ": "));
  pessoas.push({ nome: nome, idade: idade });
}

var idosas = pessoas.filter(function(pessoa) {
  return pessoa.idade >= 60;
});

for (let idosa of idosas) {
  console.log(idosa.nome + " - " + idosa.idade + " anos");
}