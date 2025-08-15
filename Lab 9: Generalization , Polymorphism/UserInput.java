import java.io.*;
class UserInput {
 public static String getString() {
String line;
InputStreamReader isr = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(isr);
try {
line=br.readLine();
return line;
}
catch(Exception e) {
return "Exception - Lathos";
}
 }
 public static int getInteger() { 
String line;
InputStreamReader isr = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(isr);
try {
line=br.readLine();
int i=Integer.parseInt(line);
return i;
}
 catch(Exception e) {
 return -1;
 }
 }
 public static short getShort() { 
String line;
InputStreamReader isr = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(isr);
try {
line = br.readLine();
short i = Short.parseShort(line);
return i;
}
 catch(Exception e) {
 return (short)-1;
 }
 }
 public static long getLong() {
String line;
InputStreamReader isr = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(isr);
try {
line = br.readLine();
long i = Long.parseLong(line);
return i;
}
 catch(Exception e) {
 return -1L;
 }
 }
 public static float getFloat() { 
String line;
InputStreamReader isr = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(isr);
try {
line = br.readLine();
float f = Float.parseFloat(line);
return f;
}
 catch(Exception e) {
 return -1f;
 }
 }
 public static double getDouble() { 
String line;
InputStreamReader isr = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(isr);
try {
line = br.readLine();
double d = Double.parseDouble(line);
return d;
}
 catch(Exception e) {
 return -1.0;
}
}
}