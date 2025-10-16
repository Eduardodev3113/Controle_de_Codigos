/*Faça um progama em c que leia a idade de um nadador e classifique-o de acordo com as categorias abaixo:

- Adulto (idade>=18)

- Juvenil (idade>=14

- Infantil (idade >=9)

- Mirim (idade <9)*/

#include <stdio.h>

int main()
{

int idade;

printf("informe sua idade: ");
scanf ("%d", &idade);

if (idade>=18)
printf("\nVocê é um adulto");

if (idade<=9 && idade<=13 )
printf("\nVocê é um Miril infantil");

if (idade>=14 && idade<=17)
printf("\nVocê é Juvenil");
}