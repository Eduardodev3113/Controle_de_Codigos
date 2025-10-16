/* Fazer um programa em "C" que solicita o total gasto pelo cliente de uma loja, 
imprime as opções de pagamento, solicita a opção desejada e imprime o valor total das prestações (se houverem).
1) Opção: a vista com 10% de desconto
2) Opção: em duas vezes (preço da etiqueta)
3) Opção: de 3 até 10 vezes com 3% de juros ao mês (somente para compras acima de R$ 100,00).
*/
#include <stdio.h>
int main()
{

    float valor, final, desconto, acrescimo;
    int pagamento, parcelas;
    
    printf("Informe o valor de sua compra:");
    scanf("%f", &valor);
    
    printf("Infome a forma de pagamento: ");
    printf("\n1) Opção: a vista com 10 por cento de desconto ");
    printf("\n2) Opção: em duas vezes (preço da etiqueta) ");
    printf("\n3) Opção: de 3 até 10 vezes com 3 por cento de juros ao mês (somente para compras acima de R$ 100,00) ");
    printf("\nFavor escrever somento o número. ");
    printf("\n: ");
    scanf("%d", &pagamento);

    if(pagamento==1)
{
    desconto = valor*0.10;
    final = valor - desconto;
    printf("O valor da sua compra é %.2f", final);
}    
    
    if(pagamento==2)
    printf("O valor da sua compra é %.2f", valor);

    if(pagamento==3)    
{   
    printf("Informe a quantidade de parcelas:");
    scanf("%d", &parcelas);
    if(valor<100)
    printf("não é possível parcelar uma compra com um valor meno que R$100 ");
    
    if(valor>=100 &&  parcelas ==3)
    {
        acrescimo=valor*0.09;
        final=valor+acrescimo;
        printf("O valor final é %.2f", final);
    }
    if(valor>=100 &&  parcelas ==4)
    {
        acrescimo=valor*0.12;
        final=valor+acrescimo;
        printf("O valor final é %.2f", final);
    }
    if(valor>=100 &&  parcelas ==5)
    {
        acrescimo=valor*0.15;
        final=valor+acrescimo;
        printf("O valor final é %.2f", final);
    }
    if(valor>=100 &&  parcelas ==6)
    {
        acrescimo=valor*0.18;
        final=valor+acrescimo;
        printf("O valor final é %.2f", final);
    }
    if(valor>=100 &&  parcelas ==7)
    {
        acrescimo=valor*0.21;
        final=valor+acrescimo;
        printf("O valor final é %.2f", final);
    }
    if(valor>=100 &&  parcelas ==8)
    {
        acrescimo=valor*0.24;
        final=valor+acrescimo;
        printf("O valor final é %.2f", final);
    }
    if(valor>=100 &&  parcelas ==9)
    {
        acrescimo=valor*0.27;
        final=valor+acrescimo;
        printf("O valor final é %.2f", final);
    }
    if(valor>=100 &&  parcelas ==10)
    {
        acrescimo=valor*0.30;
        final=valor+acrescimo;
        printf("O valor final é %.2f", final);
    }
  }
}
