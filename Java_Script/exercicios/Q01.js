var notas = [];

for (var i = 1; i <= 4; i++) {
  var nota = parseInt(prompt("Digite a nota " + i + ": "));
  notas.push(nota);
}

var soma = notas.reduce(function(prevVal, nota) {
  return prevVal + nota;
}, 0);

var media = soma / notas.length;

console.log("Notas: " + notas);
console.log("Média: " + media.toFixed(2));