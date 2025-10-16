/* fazer um programa em c que 
some os números de 1 a 30*/




#include <stdio.h>
int
main ()
{
    int impar=0, par=0, j=1, soma=0;
    
    while(j<=30)
    {
        soma=soma+j;
        printf("\nA soma é %d", soma);
        if(soma%2==0)
        {
            par=par+1;
            printf("\té par");
        }
        if(soma%2==1)
        {
            impar=impar+1;
            printf("\tnão é par");
    
        }
        j++;
    }

    printf("\na quantidade de impares é %d", impar);
    printf("\na quantidade de pares é %d", par);
}

