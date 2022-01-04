import java.util.Arrays;


public class EmployeeList
{

  private int size;
  Employee[] list = new Employee[size];

  public EmployeeList(int maxNumberOfEmployees)
  {
    this.size = maxNumberOfEmployees;

  }

  public void addEmployee(Employee employee)
  {
    for (int i = list.length - 2; i >= 0; i--)
    {
      list[i + 1] = list[i];
      list[0] = employee;
    }
  }

  public void removeEmployee(Employee employee)
  {
    for (int i = 0; i <= list.length - 1; i++)
    {
      if (list[i].equals(employee))
      {
        list[i] = null;
        for (int j = i; j <= list.length - 1; j++)
        {
          list[j] = list[j + 1];
        }
      }
    }
  }

  public int getNumberOfEmployees()
  {
    int counter = 0;
    for (int i = 0; i <= list.length - 1; i++)
    {
      if (list[i] != null)
      {
        counter++;
      }
    }
    return counter;
  }



  public Employee[] getAllEmployees()
  {
    return list;
  }

  public double getTotalEarningsPerWeek()
  {
    int totalEarnings=0;
    for (int i = 0; i <= list.length - 1; i++)
    {
      totalEarnings+=list[i].earningsPerWeek();
    }
    return totalEarnings;
  }

  public String toString(){
    String tostring="";
    for (int i = 0; i <= list.length - 1; i++){
      tostring+= list[i];
      if (i<= list.length-2)
      {
        tostring += ", ";
      }
    }
    return tostring;
  }

  public boolean equals(Object obj){
    if (!(obj instanceof EmployeeList)){
      return false;
    }
    EmployeeList other=(EmployeeList)obj;

    if ((getNumberOfEmployees()== other.getNumberOfEmployees())){
      return getAllEmployees() == other.getAllEmployees();
      }
    return false;
    }
  }

