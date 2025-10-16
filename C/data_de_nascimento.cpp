/* Programa que soma dos números*/

#include <stdio.h> 

int main() 

{

    int num1, num2, result;

    printf("Informe sua data de nascimento: ");
    scanf("%d", &num1);
    printf("digite o ano atual:");
    scanf("%d", &num2);
    result=num2-num1;
    printf("Sua idade atual é: %.1d", result);
}