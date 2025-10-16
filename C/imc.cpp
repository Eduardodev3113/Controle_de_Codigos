/*O IMC ? Indice de Massa Corporal é um critério da Organização Mundial de Saúde para dar umaindicação sobre a condição de peso de uma pessoa adulta.

A fórmula é IMC = peso / ( altura *altura)

Elabore um algoritmo que leia o peso e a altura de um adulto e mostre sua condição de acordo com a tabela abaixo.

Abaixo de 18,5 Abaixo do peso

Entre 18,5 e 25 Peso normal

Entre 25 e 30 Acima do peso

Acima de 30 obeso */



#include <stdio.h> 
int main()


{
    float num1, num2, imc;
    
    printf("Informe seu peso: ");
    scanf("%f", &num1);
    
    printf("Informe sua altura: ");
    scanf("%f", &num2);
    
    imc=num1/(num2 * num2);
    
    if(imc<18.5)
    printf("\nVc está abaixo do peso com: %.2f Kg", imc);
    
    if(imc>=18.5 && imc<=25)
    printf("\nvc está no peso normal com: %.2f Kg", imc );
    
    if(imc>=25 && imc<=30)
    printf("\nvc está acima do peso com: %.2f Kg", imc);
    
    if(imc>=30)
    printf("\nVc está obeso com: %.2f Kg", imc);
    
    
    



}
