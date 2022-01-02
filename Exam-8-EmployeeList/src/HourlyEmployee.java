public class HourlyEmployee extends Employee
{

  private double wagePerHour;
  private double hoursWorkedPerWeek;

  public HourlyEmployee(String name, Date birthday, double wagePerHour,
      double hoursWorkedPerWeek)
  {
    super(name, birthday);
    this.wagePerHour = wagePerHour;
    this.hoursWorkedPerWeek = hoursWorkedPerWeek;
  }

  public void setWagePerHour()
  {
    this.wagePerHour = wagePerHour;
  }

  public double getWagePerHour()
  {
    return wagePerHour;
  }

  public void setHoursWorkedPerWeek(double hoursWorkedPerWeek)
  {
    this.hoursWorkedPerWeek = hoursWorkedPerWeek;
  }

  public double getHoursWorkedPerWeek()
  {
    return hoursWorkedPerWeek;
  }

  public double earningsPerWeek()
  {
    return wagePerHour * hoursWorkedPerWeek;
  }

  public String toString()
  {
    return "The weekly salary of " + name + " (born on " + birthday + ") is "
        + earningsPerWeek();
  }

  public boolean equals(Object obj){
    if (!(obj instanceof HourlyEmployee)){
      return false;
    }
    HourlyEmployee other=(HourlyEmployee) obj;

    double a=wagePerHour;
    double b=other.wagePerHour;
    double c= a-b;
    double d=hoursWorkedPerWeek;
    double e=other.hoursWorkedPerWeek;
    double f= d-e;

    return super.equals(other)&&c==0&&f==0;
  }
}
