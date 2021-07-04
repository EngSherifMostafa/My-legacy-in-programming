/*
 this class send/recieve the commands to ROV uC 
 via serial port 
 */
/* Author : Mohammed hemed  */
package RovController;
import jssc.SerialPort; 
import jssc.SerialPortException;

public class RovCommunication
{    
SerialPort rovPort;    
public void serialInit(String portNum )
{
try
{
SerialPort rovPort = new SerialPort(portNum);
/* open ROV port */
rovPort.openPort(); 
/* set baud rate and  important parameters */
rovPort.setParams(SerialPort.BAUDRATE_115200, SerialPort.DATABITS_8,SerialPort.STOPBITS_1, SerialPort.PARITY_NONE);
rovPort.setFlowControlMode(SerialPort.FLOWCONTROL_RTSCTS_IN | SerialPort.FLOWCONTROL_RTSCTS_OUT);
}
catch (SerialPortException ex)
{
/* ^-^ */
}
}

/* Send data to ROV */
/*-----------------------*/
public void sendRovByte (byte mydata){
try
{
rovPort.writeByte(mydata);
}
catch (SerialPortException a) {}
}

public void sendRovBytes (String buffer){
try {
rovPort.writeString(buffer);
}
catch (SerialPortException a) {}
}


public String RovListener(){
try{
return rovPort.readString();
}
catch(SerialPortException a){
}
return ("Communication Error");
}
}    