/*
 * Represents an electronic product with  attributes such as model,
 * price, and storage capacity.
 */
public class Electronic{
  private String model;
  private double price;
  private int storage;

  
   /*
    * No-argument constructor initializes the electronic product with default values.
    * The model, price and storage. 
    */
  public Electronic(){
   this.model = "N/A";
   this.price = 0.0;
   this.storage = 0;   
  }
 /*
  * Parameterized constructor initializes the electronic product with specified values.
  *  The model of the electronic items. 
  * The price of the electronic items
  * The storage capacity of the electronic items
  */
public Electronic(String model, double price, int storage){
   this.model = model;
   this.price = price;
   this.storage = storage;   
  
 }
/*
 * Returns the model of the electronic product.
 * The products are Phone and Laptop. 
 */
public String getModel(){
  return model;
}
/*
 * Returns the price of the electronic product.
 */
public double getPrice(){
return price;
 
}
/*
 * Returns the storage capacity of the electronic product 
 * Returns it in Gigabytes.
 */
public int getStorage(){
  return storage;
}
/*
 * Sets the model of the electronic product to the specified value.
 * The model to set for the Phones and Laptops
 */
public void setModel(String model){
  this.model = model;
}
/**
 * Sets the price of the electronic product to the specified value
 * The price to set for the electronic product.
 */
public void setPrice(double price){
 this.price = price;
  
}
/*
 * Sets the storage capacity of the electronic product to the specified value.
 * The storage capacity to set for the electronic product which is in Gigabytes. 
 */
public void setStorage(int storage){
 this.storage = storage;
  }
  
/*
 * Returns a string representation of the electronic product, including its model, price, 
 * and storage capacity.
 *  Returns a string containing the information about the electronic product.
 */
public String toString(){
  String information = "\n Model:              " + model + "\n Price($):           " + price + "\n Storage(GB):        " + storage;
  return information;
  
}

  
}
