
void setup() {
  pinMode(0, OUTPUT); //enable 1, 2
  pinMode(1, OUTPUT); //input 1
  pinMode(2, OUTPUT); //input 2
}

void loop(){
  //enable 1, 2
  digitalWrite(0, HIGH);
  
  //turn right
  digitalWrite(1, HIGH);
  digitalWrite(2, LOW); 
  
  delay(3000);
  
  //turn left
  digitalWrite(2, HIGH);
  digitalWrite(1, LOW);
  
  delay(3000);
}