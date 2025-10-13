estudo de vetor

int vetor[10];
int i = 0;
int push=2;
int valorpot=0;
int soma = 0;
void setup() {
 Serial.begin(9600);
 pinMode(push, INPUT);

}

void loop() { 
  if (digitalRead(push)== HIGH && i<10){
      valorpot=analogRead(A0);
      vetor[i] = valorpot;
      i++;
      if (i==9){Serial.println("Vetor cheio");}
    }
      if (i==9){
      for (int j=0;j<10;j++){
      Serial.print(vetor[j]);
      Serial.print("-");
      soma = soma + vetor[j];
      }
      Serial.println("Soma: " + String(soma));
      Serial.println("Média: " + String(soma/10));
    }
}
