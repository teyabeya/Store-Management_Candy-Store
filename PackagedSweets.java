public class PackagedSweets extends Candy{

  //INSTANCE VARIABLES
  private String brand;
  private String type;

  //CONSTRUCTORS

  /*
  *no argument constructor
  */
  public PackagedSweets(){
    this(0.0, false, false, "N/A", "N/A");
  }

  /*
  *paramaterized constructor
  */
  public PackagedSweets(double price, boolean hasNuts, boolean isBagged, String brand, String type){
    super(price, hasNuts, isBagged);
    this.brand = brand;
    this.type = type;
  }

  //ACCESSOR METHODS

  /*
  *retuns value of brand
  */
  public String getBrand(){
    return brand;
  }

  /*
  *returns value of type of candy
  */
  public String getType(){
    return type;
  }

  //MUTATOR METHODS

  /*
  *changes value of brand
  */
  public void setBrand(String brand){
    this.brand = brand;
  }

  /*
  *changes value of type of candy
  */
  public void setType(String type){
    this.type = type;
  }

  //TO STRING

  /*
  *prints all values of packaged candy to console log
  */
  public String toString(){
    return "\nPrice: " + getPrice() + "\nContains Nuts: " + getHasNuts() + "\nIn a Store Bag: " + getIsBagged() + "\nBrand: " + brand + "\nType of Candy: " + type;
  }


  
}