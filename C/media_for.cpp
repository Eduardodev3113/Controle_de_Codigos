#include<stdio.h>
//#include <Windows.h>
int
main ()
{

  int n;			//variC!vel de controle

  int soma = 0;

  char S[1];

  printf
    ("Digite um numero positivo para ser somado, um nC:mero negativo para diminuir S para sair: ");

  scanf ("%d", &n);

  while (n >= 1)
    {

      soma = soma + n;

      printf
	("Digite um numero positivo para ser somado, um nC:mero negativo para diminuir S para sair: ");

      scanf ("%d", &n);

    }

  while (n <= 0)
    {

      soma = soma - n;

      printf
	("Digite um numero positivo para ser somado, um nC:mero negativo para diminuir S para sair: ");

      scanf ("%d", &n);

    }

  while (n = S)
    {

      soma = soma + n;

      printf
	("Digite um numero positivo para ser somado, um nC:mero negativo para diminuir S para sair: ");

      gets (S);

    }

  printf ("A soma C) %d\n", soma);

  return 0;

}
