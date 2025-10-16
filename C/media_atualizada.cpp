/******************************************************************************************************************************************
digitar duas notas, calcular a media e mostrar se o estudante foi aprovado ou reprovado ou está em exame.
aprovado - maior ou igual a 6 
reprovado - menor que 5
em exame - entre 5.1 e 5.9
******************************************************************************************************************************************/

#include <stdio.h>

int main()
{
    float nota1, nota2, media, exame, mediafinal;
    
    printf("informe a primeira nota: ");
    scanf("%f", &nota1);
    
    printf("informe a segunda nota: ");
    scanf("%f", &nota2);
    
    media=(nota1+nota2)/2;
    printf ("A média é %.2f", media);
    
    if (media>=6)
    printf ("\nAprovado");
    
    if (media>5 && media<5.9)
    
{
    printf("\nEM EXAME");
    
    printf("\nInforme a nota do exame: ");
    scanf("%f", &exame);
    
    mediafinal=(media+exame)/2;
    
    if (mediafinal>=5)
    printf ("Aprovado em exame");
    
    else
    printf("REPROVADO");
}
    
    
    if (media<5)
    printf ("\nREPROVADO");
}
