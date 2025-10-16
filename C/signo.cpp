/*Áries: 21 de março a 20 de abril
Touro: 21 de abril a 20 de maio
Gêmeos: 21 de maio a 20 de junho
Câncer: 21 de junho a 22 de julho
Leão: 23 de julho a 22 de agosto
Virgem: 23 de agosto a 22 de setembro
Libra: 23 de setembro a 22 de outubro
Escorpião: 23 de outubro a 21 de novembro
Sagitário: 22 de novembro a 21 de dezembro
Capricórnio: 22 de dezembro a 20 de janeiro
Aquário: 21 de janeiro a 19 de fevereiro
Peixes: 19 de fevereiro a 20 de março*/


#include <stdio.h>

int main()
{

    int dia, mes;
    printf("Informe o dia que vc nasceu:");
    scanf("%d", &dia);
    
    printf("informe o mês que vc nasceu:");
    scanf("%d", &mes);
    
    if (dia>= 22 && dia<=30 && mes==12 || dia>=1 && dia<=20 && mes==1)
    printf("Seu signo é Capricórnio ");
    
    if (dia>= 21 && dia<=30 && mes==1 || dia>=1 && dia<=19 && mes==2)
    printf("Seu signo é Aquários ");
    
    if (dia>= 19 && dia<=30 && mes==2 || dia>=1 && dia<=20 && mes==3)
    printf("Seu signo é Peixes ");
    
    if (dia>= 21 && dia<=30 && mes==3 || dia>=1 && dia<=20 && mes==4)
    printf("Seu signo é Áries");
    
    if (dia>= 21 && dia<=30 && mes==4 || dia>=1 && dia<=20 && mes==5)
    printf("Seu signo é Touro");
    
    if (dia>= 21 && dia<=30 && mes==5 || dia>=1 && dia<=20 && mes==6)
    printf("Seu signo é Gêmeos");
    
    if (dia>= 21 && dia<=30 && mes==6 || dia>=1 && dia<=22 && mes==7)
    printf("Seu signo é Câncer");
    
    if (dia>= 23 && dia<=30 && mes==7 || dia>=1 && dia<=22 && mes==8)
    printf("Seu signo é Leão");
    
    if (dia>= 23 && dia<=30 && mes==8 || dia>=1 && dia<=22 && mes==9)
    printf("Seu signo é Virgem ");
    
    if (dia>= 23 && dia<=30 && mes==9 || dia>=1 && dia<=22 && mes==10)
    printf("Seu signo é Libra ");
    
    if (dia>= 23 && dia<=30 && mes==10 || dia>=1 && dia<=21 && mes==11)
    printf("Seu signo é Escorpião ");
    
    if (dia>= 22 && dia<=30 && mes==11 || dia>=1 && dia<=21 && mes==12)
    printf("Seu signo é Sagitário ");
    
}
    