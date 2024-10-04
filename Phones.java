/*
 * Represents a phone, extending the Electronic class with additional attributes 
 * specific to phones such as weight and megapixels.
 */
public class Phones extends Electronic {
  double weight;
  double megapixel;

  /*
   *  A no-argument constructor that initializes the phone with default values.
   */
   public Phones(){
    super();
    this.weight = 0.0;
    this.megapixel = 0;
   }

 /*
  * Parameterized constructor initializes the phone with specified values.
  *  the model of the phone.
  *  the price of the phone.
  *  the storage capacity of the phone.
  *  the weight of the phone.
  * the megapixels of the phone's camera.
  */
 public Phones( String model, double price, int storage, double weight, double megapixel){
  super (model, price, storage);
  this.weight = weight;
  this.megapixel = megapixel;
 }
/**
 * Returns the weight of the phone.
 *  The weight of the phone is in pounds (Ibs).
 */
public double getWeight(){
return weight;
}
/**
 * Returns the megapixel count of the phone's camera.
 *  The number of megapixels will be returned.
 */
public double getMegapixel(){
return megapixel;
}

/*
 * Sets the weight of the phone to the specified value.
 * The new weight to set for the phone, in pounds.
 */
public void setWeight(double weightChange){
weight = weightChange;
}
/*
 * Sets the megapixel count of the phone's camera to the specified value.
 * The new megapixel count is set for the phone's camera.
 */
public void setMegapixel(double newMegaPixel){
megapixel = newMegaPixel;
}

 /*
  * Returns a string representation of the phone, including its model, price, 
  * storage, weight, and megapixels.
  *  A string that contains the phone's information.
  * The information would be inherited from the electronic superclass 
 */
public String toString(){
 String information = "Device:             Phones";
  information = information + super.toString();
  information = information + "\n Weight(Ibs):        " + weight + "\n Megapixel:          "+ megapixel;
  return information;
}


  

  
 }