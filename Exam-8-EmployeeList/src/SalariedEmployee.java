public class SalariedEmployee extends Employee
{

  private double weeklySalary;

  public SalariedEmployee(String name, Date birthday, double weeklySalary)
  {
    super(name, birthday);
    this.weeklySalary = weeklySalary;
  }

  public void setWeeklySalary(double weeklySalary)
  {
    this.weeklySalary = weeklySalary;
  }

  public double getWeeklySalary()
  {
    return weeklySalary;
  }

  public double earningsPerWeek()
  {
    return weeklySalary;
  }

  public String toString()
  {
    return "The weekly salary of "+name+" (born on "+birthday+")  is "+weeklySalary;
  }

  public boolean equals(Object obj){
    if (!(obj instanceof SalariedEmployee)){
      return false;
    }
    SalariedEmployee other=(SalariedEmployee) obj;

    return super.equals(obj)&&weeklySalary==other.weeklySalary;
  }
}
