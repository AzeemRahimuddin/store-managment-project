/**
 * Represents a laptop, extending the Electronic class with additional attributes 
 * specific to laptops such as screen size and RAM.
 */
public class Laptops extends Electronic{
   double screenSize;
   int Ram;
  
    /*
     * No-argument constructor initializes the laptop with default values.
     */
  public Laptops(){
  super();
  this.screenSize = 0.0;
  this.Ram = 0;
  }

/*
 * Parameterized constructor initializes the laptop with specified values.
 *  The model of the laptop.
 * The price of the laptop.
 *  The storage capacity of the laptop.
 *  The screen size of the laptop.
 * The RAM of the laptop.
  */
public Laptops( String model, double price, int storage, double screenSize, int Ram){
super ( model, price, storage);
this.screenSize = screenSize;
this.Ram = Ram;
}
/*
 * Returns the screen size of the laptop.
 * It would return it in inches. 
 */
public double getScreenSize(){
return screenSize;
}
/*
 * Returns the amount of RAM in the laptop.
 *  The amount of RAM is in GB.
 */
public int getRam(){
return Ram;
}
/*
 * Sets the screen size of the laptop to the specified value.
 *  The screen size to set for the laptop is in inches.
 */
public void setScreenSize(double screenSize){
this.screenSize = screenSize;
}

/*
 * Sets the RAM of the laptop to the specified value.
 * The amount of RAM to set for only the laptop, in GB.
 */
public void setRam( int Ram){
this.Ram = Ram;  
}


 /*
  * Returns a string representation of the laptop, including its model, price, 
  * storage, screen size, and RAM.
  * Returns a string containing the  information about the laptop. 
  */
public String toString(){
String information = "Device:             Laptops";
information = information + super.toString();
information = information + "\n Screen Size(in):    " + screenSize;
information = information + " \n RAM(GB):            " + Ram;
return information;
}






  
}