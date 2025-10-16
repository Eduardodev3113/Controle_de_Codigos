/* Programa que soma dos números
sqrt Calcula raiz quadrada
pow	potenciação
sin seno
*/

#include <stdio.h> 
#include <math.h>
#include <stdlib.h>
int main() 

{

    int num1, num2;

    printf ("Informe o primeiro número inteiro: ");
    scanf ("%d", &num1); 
    printf ("Informe o segundo número inteiro: ");
    scanf ("%d", &num2); 
    int soma =num1+num2;
    printf("A) A soma é: %d\n", soma);
    int multiplicao = num2 * (num1 * num1);
    printf("B) a multiplicação do segundo pelo quadrado do primeiro é: %d\n", multiplicao); 
    int quadrado = num1 * num1;
    printf("C) o quadrado do primeiro número é: %d\n", quadrado);
    int modulo = abs(num2); 
    printf("D) o modulo do segundo número é: %d\n", modulo);
    int raiz = sqrt(num2);
    printf("E) a raiz quadrada do segundo número é: %d\n", raiz);
    int seno = sin(num1);
    printf("F) o seno do primeiro número é: %d\n", seno);
    
}