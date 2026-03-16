var numeros = [];

for (var i = 1; i <= 4; i++) {
  numeros.push(parseInt(prompt("Digite o número " + i + ": ")));
}

var pares = numeros.filter(function(numero) {
  return numero % 2 === 0;
});

console.log("Números: " + numeros);
console.log("Pares: " + pares);