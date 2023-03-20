#define dT 500
#define onMode HIGH
#define offMode LOW

void setup() {
  pinMode(1, OUTPUT);
  pinMode(2, OUTPUT);
  pinMode(3, OUTPUT);
  pinMode(4, OUTPUT);
  pinMode(5, OUTPUT);
  pinMode(6, OUTPUT);
  pinMode(7, OUTPUT);
}

void loop() {
  Zero();
  delay(dT);

  One();
  delay(dT);

  Two();
  delay(dT);
 
  Three();
  delay(dT);

  Four();
  delay(dT);

  Five();
  delay(dT);

  Six();
  delay(dT);
    
  Seven();
  delay(dT);
  
  Eight();
  delay(dT);

  Nine();
  delay(dT);
}

void Zero() {
  digitalWrite(1, onMode);
  digitalWrite(2, onMode);
  digitalWrite(3, onMode);
  digitalWrite(4, onMode);
  digitalWrite(5, onMode);
  digitalWrite(6, onMode);
  digitalWrite(7, offMode);
}

void One() {
  digitalWrite(1, offMode);
  digitalWrite(2, onMode);
  digitalWrite(3, onMode);
  digitalWrite(4, offMode);
  digitalWrite(5, offMode);
  digitalWrite(6, offMode);
  digitalWrite(7, offMode);
}

void Two() {
  digitalWrite(1, onMode);
  digitalWrite(2, onMode);
  digitalWrite(3, offMode);
  digitalWrite(4, onMode);
  digitalWrite(5, onMode);
  digitalWrite(6, offMode);
  digitalWrite(7, onMode);
}

void Three() {
  digitalWrite(1, onMode);
  digitalWrite(2, onMode);
  digitalWrite(3, onMode);
  digitalWrite(4, onMode);
  digitalWrite(5, offMode);
  digitalWrite(6, offMode);
  digitalWrite(7, onMode);
}

void Four() {
  digitalWrite(1, offMode);
  digitalWrite(2, onMode);
  digitalWrite(3, onMode);
  digitalWrite(4, offMode);
  digitalWrite(5, offMode);
  digitalWrite(6, onMode);
  digitalWrite(7, onMode);
}

void Five() {
  digitalWrite(1, onMode);
  digitalWrite(2, offMode);
  digitalWrite(3, onMode);
  digitalWrite(4, onMode);
  digitalWrite(5, offMode);
  digitalWrite(6, onMode);
  digitalWrite(7, onMode);
}

void Six() {
  digitalWrite(1, onMode);
  digitalWrite(2, offMode);
  digitalWrite(3, onMode);
  digitalWrite(4, onMode);
  digitalWrite(5, onMode);
  digitalWrite(6, onMode);
  digitalWrite(7, onMode);
}

void Seven() {
  digitalWrite(1, onMode);
  digitalWrite(2, onMode);
  digitalWrite(3, onMode);
  digitalWrite(4, offMode);
  digitalWrite(5, offMode);
  digitalWrite(6, offMode);
  digitalWrite(7, offMode);
}

void Eight() {
  digitalWrite(1, onMode);
  digitalWrite(2, onMode);
  digitalWrite(3, onMode);
  digitalWrite(4, onMode);
  digitalWrite(5, onMode);
  digitalWrite(6, onMode);
  digitalWrite(7, onMode);
}

void Nine() {
  digitalWrite(1, onMode);
  digitalWrite(2, onMode);
  digitalWrite(3, onMode);
  digitalWrite(4, onMode);
  digitalWrite(5, offMode);
  digitalWrite(6, onMode);
  digitalWrite(7, onMode);
}
