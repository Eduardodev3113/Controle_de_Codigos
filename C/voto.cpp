/*Faça um programa em C que leia uma idade e informe se a pessoa pode votar:

menor que  16 anos  - não pode votar

16 ate 17 -  facultativo

18 até 69 ou mais obrigatório

70 ou mais - facultativo*/

#include <stdio.h>

int main()
{

int idade;

printf("informe sua idade: ");
scanf ("%d", &idade);

if (idade<16)
printf("\nVocê não pode votar");

if (idade>=16 && idade<=17 || idade>=70 )
printf("\nVocê não é obrigado a votar, mas pode se quiser");

if (idade>=18 && idade<=69)
printf("\nVocê é OBRIGADO a votar");
}


