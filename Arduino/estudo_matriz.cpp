matriz

int i = 0;
int matriz[5][3]={
  {255,0,0},
  {0,255,0},
  {0,0,255},
  {190,255,0},
  {190,0,255}
};
int pushe=12;
int pushd=2;
int rgb[3] = {11,10,9};
void setup() {
for (int pino = 0;pino<3;pino++){
    pinMode(rgb[pino],OUTPUT);
    }  
  pinMode(pushe,INPUT);
  pinMode(pushd,INPUT);
}

void loop() {
  if (digitalRead(pushe) == HIGH && i>=0){i--;}
  if (digitalRead(pushd) == HIGH && i<5){i++;}
    analogWrite(rgb[0],matriz[i][0]);
    analogWrite(rgb[1],matriz[i][1]);
    analogWrite(rgb[2],matriz[i][2]);
    delay(1000);
  
}
