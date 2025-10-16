/******************************************************************************

somar numeros pares indicados pelo usuário - 
finalizar quando o usuário digitar -1

*******************************************************************************/
#include <stdio.h>

int main()
{
    int j=1, soma=0, num;
    while(j==1)
{
    printf("\ninforme um numero inteiro par qualquer: ");
    scanf("%d", &num);
    if(num%2==0)
    soma=soma+num;
    printf("\nDeseja continuar?\n Se sim digite 0: ");
    printf("\nSe não digite -1\n: ");
    scanf("%d", &j);
    j++;
}   
    printf("A soma dos números pares é %d", soma);
}