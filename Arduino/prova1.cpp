int r = 3;
int g = 5;
int b = 11;
int push = 2;
int verde = 9;
int vermelho = 10;
int azul = 6;

void setup() {
  Serial.begin(9600);
  pinMode(r, OUTPUT);
  pinMode(g, OUTPUT);
  pinMode(b, OUTPUT);
  pinMode(verde, OUTPUT);
  pinMode(vermelho, OUTPUT);
  pinMode(azul, OUTPUT);
  pinMode(push, INPUT);
}

void loop() {
  int valorpot = analogRead(A0);

  if (valorpot <= 341) { // LED vermelho
    if (digitalRead(push) == HIGH) {
      analogWrite(r, 0);
      digitalWrite(vermelho, HIGH);
    } else {
      analogWrite(r, 255);
      digitalWrite(vermelho, LOW);
    }
  }
  else if (valorpot <= 755) { // LED verde
    if (digitalRead(push) == HIGH) {
      analogWrite(g, 0);
      digitalWrite(verde, HIGH);
    } else {
      analogWrite(g, 255);
      digitalWrite(verde, LOW);
    }
  }
  else { // LED azul
    if (digitalRead(push) == HIGH) {
      analogWrite(b, 0);
      digitalWrite(azul, HIGH);
    } else {
      analogWrite(b, 255);
      digitalWrite(azul, LOW);
    }
  }

  Serial.println(valorpot);
  delay(25);
}
