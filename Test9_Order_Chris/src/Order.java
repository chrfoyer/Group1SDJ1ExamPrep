import java.util.Arrays;

public class Order
{
  private int numberOfOrderLines;
  private OrderLine[] orderLines;

  public Order(int maxNumberOfOrderLines)
  {
    numberOfOrderLines = 0;
    orderLines = new OrderLine[maxNumberOfOrderLines];
  }

  public void addOrderLine(Item item, int amount)
  {
    // Create the orderLine object to add
    OrderLine orderLine = new OrderLine(item, amount);
    // Use the copy to add in to respect composition
    orderLines[numberOfOrderLines] = orderLine.copy();
    numberOfOrderLines++;
  }

  public int getNumberOfOrderLines()
  {
    return numberOfOrderLines;
  }

  // Go through each item and add the price to the total
  public double getTotalPrice()
  {
    double total = 0;
    for (int i = 0; i < numberOfOrderLines; i++)
    {
      // Prices should be multiplied by the amount
      total += (getAmountOfOrderItem(i) * orderLines[i].getItem().getPrice());
    }
    return total;
  }

  // Find an OrderLine by the index
  public Item getOrderItem(int orderLineIndex)
  {
    return orderLines[orderLineIndex].getItem();
  }

  public int getAmountOfOrderItem(int orderLineIndex)
  {
    return orderLines[orderLineIndex].getAmount();
  }

  public double getTotalWeightForWeighedItems()
  {
    double total = 0;
    for (int i = 0; i < numberOfOrderLines; i++)
    {
      if (orderLines[i].getItem() instanceof WeighedItem)
      {
        total += ((WeighedItem) orderLines[i].getItem()).getWeight();
      }
    }
    return total;
  }

  @Override public String toString()
  {
    return "Order{" + "numberOfOrderLines=" + numberOfOrderLines
        + ", orderLines=" + Arrays.toString(orderLines) + '}';
  }
}
