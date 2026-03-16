var estados = [];

for (var i = 1; i <= 4; i++) {
  var nome = prompt("Digite o nome do estado " + i + ": ");
  var abreviatura = prompt("Digite a abreviatura de " + nome + ": ");
  estados.push({ nome: nome, abreviatura: abreviatura.toUpperCase() });
}

var formatados = estados.map(function(estado) {
  return estado.nome + " - " + estado.abreviatura;
});

for (let estado of formatados) {
  console.log(estado);
}