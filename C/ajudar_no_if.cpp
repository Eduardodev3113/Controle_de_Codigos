/*Escreva um programa em C que leia um nC:mero inteiro. Se ele  for positivo mostre o seu dobro. 

Se for negativo mostre o seu triplo.*/
#include <stdio.h>

int main ()
{

  int num1, soma, soma1, soma2;

  printf ("Informe o primeiro numero inteiro: ");
  scanf ("%d", &num1);
  soma = num1;

  if (num1 > 0)
    {
      soma1 = soma + num1;
      printf ("o resultado é: %.2d", soma1);
    }

  if (num1 < 0)
    {
      soma2 = soma + num1 + num1;
      printf ("o resultado é: %.2d", soma2);
    }

}
