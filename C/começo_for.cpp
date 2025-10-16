#include <stdio.h>
#include <locale.h>
int main()
{
    int num;
    
setlocale(LC_ALL, "Portuguese"); //função para caracteres em Português
printf("\n\t\tImprimir os números de 1 até 50 : \n");
for(num=50;num>=0;num--)
{
    printf(" %d", num);
}