int cesto[3][6] = {
  {1, 3, 9, 30, 0, 0}, 
  {4, 6, 7, 45, 0, 0},  
  {7, 10, 6, 65, 0, 0}  
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
  for (int linha = 0; linha < 3; linha++) {
    if (peso >= cesto[linha][0] && peso <= cesto[linha][1]) {
      if (cesto[linha][4] < cesto[linha][2]) {
        if (cesto[linha][5] + peso <= cesto[linha][3]) {
          cesto[linha][4] = cesto[linha][4] + 1;
          cesto[linha][5] = cesto[linha][5] + peso;
        } else {
          Serial.println("Limite de peso atingido no cesto " + String(linha + 1));
          fim = true;
        }
      } else {
        Serial.println("Limite de quantidade atingido no cesto " + String(linha + 1));
        fim = true;
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

    int total_peixes = 0;
    int total_peso = 0;
    int cesto_mais_peixes = 0;
    int maior_quantidade = 0;

    for (int i = 0; i < 3; i++) {
      total_peixes += cesto[i][4];
      total_peso += cesto[i][5];

      if (cesto[i][4] > maior_quantidade) {
        maior_quantidade = cesto[i][4];
        cesto_mais_peixes = i;
      }
    }

    if (maior_quantidade == 0) {
      Serial.println("Nenhum peixe registrado. Não é possível calcular médias ou porcentagens.");
    } else {
      float media_peso_cesto = cesto[cesto_mais_peixes][5] / (float)cesto[cesto_mais_peixes][4];
      Serial.println("Cesto com mais peixes: Cesto " + String(cesto_mais_peixes + 1));
      Serial.println("Quantidade de peixes: " + String(cesto[cesto_mais_peixes][4]));
      Serial.println("Peso total no cesto: " + String(cesto[cesto_mais_peixes][5]) + " KG");
      Serial.println("Média do peso por peixe (neste cesto): " + String(media_peso_cesto, 2) + " KG");

      for (int i = 0; i < 3; i++) {
        float pct_quantidade = (cesto[i][4] * 100.0) / total_peixes;
        float pct_peso = (cesto[i][5] * 100.0) / total_peso;
        Serial.println("Cesto " + String(i + 1) + ":");
        Serial.println("  % Quantidade: " + String(pct_quantidade, 2) + "%");
        Serial.println("  % Peso: " + String(pct_peso, 2) + "%");
      }
    }

    while (true);
  }

  mostramatriz();
  peso = map(analogRead(A0), 0, 1023, 1, 10);
  Serial.println("Peso atual: " + String(peso));

  if (digitalRead(push) == HIGH && fim == false) {
    guarda();
  }

  delay(1000);
}
