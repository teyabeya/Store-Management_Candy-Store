public class StoreRunner {
  public static void main(String[] args) {
    
    System.out.println("Packaged Sweets:\n");

    PackagedSweets delicious = new PackagedSweets();
    System.out.println("\nDelicious Packaged Sweet:" + delicious);
    delicious.setPrice(3.95);
    delicious.setBrand("Dum Dums");
    delicious.setType("Lollipop");
    delicious.setIsBagged(true);
    System.out.println("\nNew Delicious Packaged Sweet:"+ delicious);
    

    PackagedSweets mnms = new PackagedSweets(2.50, true, false, "M&Ms", "Chocolate Candy");
    System.out.println("\nMnMs Packaged Sweet: "+mnms);
    mnms.setHasNuts(false);
    mnms.setIsBagged(true);
    System.out.println("\nNew MnMs Packaged Sweet: "+mnms);

    System.out.println("\nChocolate Boxes:");
    
    ChocoBox small = new ChocoBox();
    System.out.println("\nSmall Chocolate Box:" + small);
    small.setPrice(6.75);
    small.setFilling("Raspberry Jelly");
    small.setNumOfChoco(4);
    System.out.println("\nNew Small Chocolate Box:" + small);

    ChocoBox large = new ChocoBox(15.50, false, true, 12, "Caramel");
    System.out.println("\nLarge Chocolate Box:" + large);
    large.setHasNuts(true);
    large.setFilling("Almonds");
    large.setIsBagged(false);
    System.out.println("\nNew Large Chocolate Box:" + large);
    
  }
}