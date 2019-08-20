
package csvprocessor;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee> {
    
    public int compare(Employee e1, Employee e2)
    {
       if(e1.getEmpSal()> e2.getEmpSal())
        {
            return 1;
        }
        else if (e1.getEmpSal() < e2.getEmpSal())
        {
            return -1;
        }
        else
        {
            return 0;
        } 
    }
    
}
