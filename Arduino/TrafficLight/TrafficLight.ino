const byte redLight = 2;
const byte yellowLight = 4;
const byte greenLight = 6;
const byte runTime = 10;
const byte stopTime = 5;

void setup ()
{
  pinMode (redLight, OUTPUT);
  pinMode (yellowLight, OUTPUT);
  pinMode (greenLight, OUTPUT);
}

void loop ()
{
  for (byte a = 0 ; a <= runTime ; a++)
  {
    digitalWrite (redLight, HIGH);
    digitalWrite (yellowLight, LOW);
    digitalWrite (greenLight, LOW);
    delay (1000);
  }

  for (byte a = 0 ; a <= stopTime ; a++)
  {
    digitalWrite (redLight, LOW);
    digitalWrite (yellowLight, HIGH);
    digitalWrite (greenLight, LOW);
    delay (1000);
  }

  for (byte a = 0 ; a <= runTime ; a++)
  {
    digitalWrite (redLight, LOW);
    digitalWrite (yellowLight, LOW);
    digitalWrite (greenLight, HIGH);
    delay (1000);
  }
}
