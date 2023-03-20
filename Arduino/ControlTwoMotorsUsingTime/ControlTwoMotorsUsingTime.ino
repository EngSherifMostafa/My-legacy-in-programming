const byte waterMotor = 9;
const byte mixMotor = 11;
const byte waterLevel = 13;
const byte runTime = 5;
const byte stopTime = 10;

void setup()
{
  pinMode(waterMotor, OUTPUT);
  pinMode(mixMotor, OUTPUT);
  pinMode(waterLevel, INPUT_PULLUP);
}

void loop()
{
  // If tank is empty
  while (!digitalRead(waterLevel))
  {
    // Turn Off mixMotor
    digitalWrite(mixMotor, HIGH);

    // Turn on waterMotor
    digitalWrite(waterMotor, LOW);

    // Running time
    for (int a = 0 ; a < runTime && (digitalRead (waterLevel) == LOW) ; a++)
      delay(1000);

    // Turn off waterMotor
    digitalWrite(waterMotor, HIGH);

    // Stopping time
    for (int a = 0 ; a < stopTime && (digitalRead (waterLevel) == LOW) ; a++)
      delay(1000);
  }

  // If tank is full
  while (digitalRead(waterLevel))
  {
    // Make sure that last state of waterMotor is turn off
    digitalWrite(waterMotor, HIGH);

    // Turn on mixMotor
    digitalWrite(mixMotor, LOW);
  }
}
