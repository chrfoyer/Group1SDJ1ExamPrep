public abstract class Car
{
  private Customer rentedTo;
  private String licenseNo;
  private double price;

  public Car(String licenseNo, double price)
  {
    this.licenseNo=licenseNo;
    this.price=price;
    this.rentedTo=null;
  }

  public String getLicenseNo()
  {
    return licenseNo;
  }

  public double getPrice()
  {
    return price;
  }

  public void setPrice(double price)
  {
    this.price=price;
  }

  public abstract String getType();

  public Customer getRentedTo()
  {
    return rentedTo;
  }

  public void setRentedTo(Customer customer)
  {
    this.rentedTo=customer;
  }

  public boolean isAvailable()
  {
    return rentedTo == null;
  }
}
