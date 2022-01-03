public class Pizza
{
  private String name;
  private double initialPrice;
  private int numberOfToppings;
  public static final int MAX_NUMBER_OF_TOPPINGS = 5;
  Topping[] toppings= new Topping[MAX_NUMBER_OF_TOPPINGS];

  public Pizza(String name, double initialPrice)
  {
    this.name=name;
    this.initialPrice=initialPrice;
    this.numberOfToppings=0;
  }

  public int getNumberOfToppings(){
    return numberOfToppings;
  }

  public void addTopping(Topping topping){

    if (getNumberOfToppings()<5){
      for (int i=toppings.length-2;i>=0;i--){
        toppings[i+1]=toppings[i];
      }
      toppings[0]=topping;
    }

  }

  public void removeTopping(String toppingName){
    if (getNumberOfToppings()>0){
      for (int i=0;i<=toppings.length-1;i++){
        if(toppings[i].getName().equals(toppingName)){
          toppings[i]=null;
          for (int j=i; j<=toppings.length-1;j++){
            toppings[j]=toppings[j+1];
          }
          toppings[toppings.length-1]=null;
        }
      }
    }
  }
  public double getTotalPrice(){
    int totalToppingPrice=0;
    for (int i=0; i<toppings.length-1;i++){
      totalToppingPrice+=toppings[i].getPrice();
    }
    return initialPrice+totalToppingPrice;
  }
}
