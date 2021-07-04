#include <SoftwareSerial.h>
#define RX 2
#define TX 3
const byte relay = 13;
SoftwareSerial bluetooth (RX,TX);

void setup()
{
      bluetooth.begin (9600);
      pinMode(relay,OUTPUT);
}
    
void loop()
{
  char bleutoothData = bluetooth.read();
  if (bleutoothData == '1')
      {
        digitalWrite(relay,HIGH);
      }

  if (bleutoothData == '0')
      {
        digitalWrite(relay,LOW);
      }
}
