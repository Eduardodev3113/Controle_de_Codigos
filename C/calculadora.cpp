#include <stdio.h>

int main()
{
  float num1, num2, adicao, subtracao, multiplicacao, divisao, operacao;
 
  printf("Informe o primeiro número: ");
  scanf("%f", &num1);
  
  printf("Informe o segundo número: ");
  scanf("%f", &num2);  
  
  printf("Informe qual será a operação utilizada sendo: \n1)adição \n2)subtração \n3)multiplicação \n4)divisão \n: ");
  scanf("%f", &operacao);
  
  adicao = num1 + num2;
  subtracao = num1 - num2;
  multiplicacao = num1 * num2;
  divisao = num1/num2;
  
  if(operacao == 1)
  printf(" o resultado da sua opereção é %.2f", adicao);
  
  if(operacao == 2)
  printf(" o resultado da sua opereção é %.2f", subtracao);
  
  if(operacao == 3)
  printf(" o resultado da sua opereção é %.2f", multiplicacao);
  
  if(operacao == 4)
  printf(" o resultado da sua opereção é %.2f", divisao);
  
  
  
  
}

