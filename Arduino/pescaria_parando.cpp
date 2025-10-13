int cesto[3][6] = {
  {1, 3, 9, 30, 0, 0},  // Cesto 1: [min, max, limite quantidade, limite peso, quantidade atual, peso total]
  {4, 6, 7, 45, 0, 0},  // Cesto 2
  {7, 10, 6, 65, 0, 0}  // Cesto 3
};
int peso = 0;
int push = 2;
bool fim = false;

void setup() {
  Serial.begin(9600);
  pinMode(push, INPUT);
}

void guarda() {
  Serial.println("Pescado KG: " + String(peso));
  for (int linha = 0; linha < 3; linha++) {  // Ajuste o laço para iterar corretamente sobre as 3 linhas da matriz
    if (peso >= cesto[linha][0] && peso <= cesto[linha][1]) {  // Verifica o peso no intervalo do cesto
      if (cesto[linha][4] < cesto[linha][2]) {  // Verifica se não ultrapassou o limite de quantidade
        if (cesto[linha][5] + peso <= cesto[linha][3]) {  // Verifica se o peso não ultrapassou o limite do cesto
          cesto[linha][4] = cesto[linha][4] + 1;  // Aumenta a quantidade do cesto
          cesto[linha][5] = cesto[linha][5] + peso;  // Aumenta o peso no cesto
        } else {
          Serial.println("Limite de peso atingido no cesto " + String(linha + 1));
          fim = true;  // Marca que o processo foi finalizado
        }
      } else {
        Serial.println("Limite de quantidade atingido no cesto " + String(linha + 1));
        fim = true;  // Marca que o processo foi finalizado
      }
    }
  }
}

void mostramatriz() {
  for (int linha = 0; linha < 3; linha++) {
    for (int coluna = 0; coluna < 6; coluna++) {
      Serial.print(cesto[linha][coluna]);
      Serial.print(" ");
    }
    Serial.println();
  }
}

void loop() {
  if (fim == true) {
    Serial.println("Fim do processo. Resultados finais:");
    mostramatriz();
    while (true);  // Para o código aqui
  }

  mostramatriz();
  peso = map(analogRead(A0), 0, 1023, 1, 10);  // Lê o valor do sensor e mapeia
  Serial.println("Peso atual: " + String(peso));

  if (digitalRead(push) == HIGH && fim == false) {
    guarda();
  }
  delay(1000);
}

