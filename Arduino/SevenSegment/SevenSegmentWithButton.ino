#define dT 500
#define onMode HIGH
#define offMode LOW

int e = 0;
int n = 0;
int t = 0;
void setup() {
  pinMode(1, OUTPUT);
  pinMode(2, OUTPUT);
  pinMode(3, OUTPUT);
  pinMode(4, OUTPUT);
  pinMode(5, OUTPUT);
  pinMode(6, OUTPUT);
  pinMode(7, OUTPUT);

  pinMode(8, INPUT);
  pinMode(9, INPUT);
  pinMode(10, INPUT);
}

void loop() {
  e = digitalRead(8);
  n = digitalRead(9);
  t = digitalRead(10);

  if (e == 0 && n == 0 && t == 0) {
    Zero();
    delay(dT);
  }

  if (e == 0 && n == 0 && t == 1) {
    One();
    delay(dT);
  }

  if (e == 0 && n == 1 && t == 0) {
    Two();
    delay(dT);
  }

  if (e == 0 && n == 1 && t == 1) {
    Three();
    delay(dT);
  }

  if (e == 1 && n == 0 && t == 0) {
    Four();
    delay(dT);
  }

  if (e == 1 && n == 0 && t == 1) {
    Five();
    delay(dT);
  }

  if (e == 1 && n == 1 && t == 0) {
    Six();
    delay(dT);
  }

  if (e == 1 && n == 1 && t == 1) {
    Seven();
    delay(dT);
  }
  /*
  Eight();
  delay(dT);

  Nine();
  delay(dT);
*/
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