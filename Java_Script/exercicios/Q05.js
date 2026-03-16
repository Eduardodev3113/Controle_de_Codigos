var numeros = [];

for (var i = 1; i <= 4; i++) {
  numeros.push(parseInt(prompt("Digite o número " + i + ": ")));
}

function fatorial(n) {
  if (n === 0 || n === 1) return 1;
  var resultado = 1;
  for (var i = 2; i <= n; i++) {
    resultado *= i;
  }
  return resultado;
}

var fatoriais = numeros.map(function(numero) {
  return numero + "! = " + fatorial(numero);
});

for (let fat of fatoriais) {
  console.log(fat);
}