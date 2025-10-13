#include <LiquidCrystal_I2C.h>
LiquidCrystal_I2C lcd(0x27, 16, 2);

int rgb[] = {11, 10, 6};
int valorpot = A0;
int cont = 0;

String cor[5] = {"Vermelho", "Verde", "Azul", "Amarelo", "Branco"};
int matriz[5][3] = {
  {255, 0, 0},
  {0, 255, 0},
  {0, 0, 255},
  {190, 255, 0},
  {190, 255, 255}
};

void setup() {
  Serial.begin(9600);
  lcd.init();
  lcd.setBacklight(HIGH);

  for (int i = 0; i < 3; i++) {
    pinMode(rgb[i], OUTPUT);
  }
}

void loop() {
    
  int valorpot = analogRead(valorpot);

  if (valorpot < 205) {
    cont = 0;
  }
  if (valorpot >= 205 && valorpot < 410) {
    cont = 1;
  }
  if (valorpot >= 410 && valorpot < 615) {
    cont = 2;
  }
  if (valorpot >= 615 && valorpot < 820) {
    cont = 3;
  }
  if (valorpot >= 820) {
    cont = 4;
  }

  int r = matriz[cont][0];
  int g = matriz[cont][1];
  int b = matriz[cont][2];
  Serial.print("valorpot: ");
  Serial.print(valorpot);
  Serial.print(" => Cor: ");
  Serial.print(cor[cont]);
  Serial.print(" - RGB(");
  Serial.print(r);
  Serial.print(", ");
  Serial.print(g);
  Serial.print(", ");
  Serial.print(b);
  Serial.println(")");

  lcd.setCursor(0, 0);
  lcd.print("Cor: ");
  lcd.print(cor[cont]);
  lcd.setCursor(0, 1);
  lcd.print("R:" + String(r) + " G:" + String(g) + " B:" + String(b));

  analogWrite(rgb[0], r);
  analogWrite(rgb[1], g);
  analogWrite(rgb[2], b);

  delay(1000);
  lcd.clear();
}
