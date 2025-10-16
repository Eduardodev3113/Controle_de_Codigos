#include <stdio.h>
#include <locale.h>
int
main ()
{

  float vlr_unit, soma = 0, valor_final;
  int opc, cont;

  setlocale (LC_ALL, "Portuguese");	//funC'C#o para caracteres em PortuguC*s
  for (cont = 1; cont <= 5; cont++)

    {
      printf ("\ninforme o valor Unitário: ");
      scanf ("%f", &vlr_unit);
      soma = soma + vlr_unit;
    }
  printf ("\na Soma C) %.2f", soma);
  if (soma >= 100)
    {
      printf ("\nDeseja parcelar");
      printf ("\n1 - Sim"); printf ("\n2 - Não \n: "); scanf ("%d", &opc);
      if (opc == 1)
	{
	  valor_final = soma / 2;
	  printf ("O valor a ser pago ser 2x de %2.f", valor_final);
	}
      else
	printf ("O valor a ser pago ser 1x de %2.f", soma);

    }
}