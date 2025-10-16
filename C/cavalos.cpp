#include <stdio.h>
int main()
{
    int cavalos;
    float ferraduras;
    printf("quantos cavalos a fazenda tem? ");
    scanf("%d", &cavalos);
    printf("quanto custa a ferradura? ");
    scanf("%f", &ferraduras);
    float valor = cavalos * ferraduras;
    printf("o valor gasto será %.2f",valor);
    
}


