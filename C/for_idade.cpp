#include <stdio.h>
int main ()

{
    
    int cont, idade, menoridade=500, maioridade=0;
    for(cont=1; cont<=10; cont++)
    
    {
        printf("\nInforme sua idade: ");
        scanf("%d", &idade);
        if(idade> maioridade)
        maioridade=idade;
        if(idade<menoridade)
        menoridade=idade;
    }
    printf("A maior idade é %d", maioridade);
    printf("\nA menor idade é %d", menoridade);
    
    
    
}
