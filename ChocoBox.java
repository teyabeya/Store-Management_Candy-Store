public class ChocoBox extends Candy{

  //INSTANCE VARIABLES
  private int numOfChoco;
  private String filling;

  //CONSTRUCTORS

  /*
  *no argument constructor
  */
  public ChocoBox(){
    this(0.0, false, false, 0, "N/A");
  }

  /*
  *paramaterized constructor
  */
  public ChocoBox(double price, boolean hasNuts, boolean isBagged, int numOfChoco, String filling){
    super(price, hasNuts, isBagged);
    this.numOfChoco = numOfChoco;
    this.filling = filling;
  }

  //ACCESSOR METHODS

  /*
  *retuns value of number of chocolates in box
  */
  public int getNumOfChoco(){
    return numOfChoco;
  }

  /*
  *returns value of type of filling
  */
  public String getFilling(){
    return filling;
  }

  //MUTATOR METHODS

  /*
  *changes value of chocolates in box
  */
  public void setNumOfChoco(int numOfChoco){
    this.numOfChoco = numOfChoco;
  }

  /*
  *changes value of type of filling
  */
  public void setFilling(String filling){
    this.filling = filling;
  }

  //TO STRING

  /*
  *prints all values of boxed chocolates to console log
  */
  public String toString(){
    return "\nPrice: " + getPrice() + "\nContains Nuts: " + getHasNuts() + "\nIn a Store Bag: " + getIsBagged() + "\nNumber of Chocolates in Box: " + numOfChoco + "\nType of Filling: " + filling;
  }


  
}