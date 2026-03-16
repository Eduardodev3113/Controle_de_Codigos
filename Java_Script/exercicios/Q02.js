var notas = [];

for (var i = 1; i <= 4; i++) {
  notas.push(parseInt(prompt("Digite a nota " + i + ": ")));
}

var media = notas.reduce((prevVal, nota) => prevVal + nota, 0) / notas.length;

console.log("Notas: " + notas);
console.log("Média: " + media.toFixed(2));