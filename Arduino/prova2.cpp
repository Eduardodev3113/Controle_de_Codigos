int vetor[5];
int push = 2;
int ledg = 11;
int ledv = 10;
int valorpot = 0;
int j = 0;
int i=0;
void setup()
  
{
  Serial.begin(9600);
  pinMode(ledg, OUTPUT);
  pinMode(ledv, OUTPUT);
  pinMode(push, INPUT);
}

void loop()
{
  Serial.println(i);
  valorpot = analogRead(A0);
  if (i<=4){
    if (digitalRead(push) == HIGH){
    vetor[i] = valorpot;
    analogWrite(ledg,HIGH);
    delay(100);
    analogWrite(ledg,LOW);
    Serial.print(vetor[i]);
	Serial.println(" Foi salvo no vetor");
    Serial.println(i);
    i++;
      if (i == 4){
      j = 5;
      }
    }
  }
    if (digitalRead(push) == HIGH && j>=5){
    analogWrite(ledv,HIGH);
    delay(100);
    analogWrite(ledv,LOW);
    Serial.println("Vetor Cheio");
    }

}