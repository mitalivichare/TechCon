package csvprocessor;

import java.util.Comparator;

public class AgeComparator implements Comparator<Employee>{
    public int compare(Employee e1, Employee e2)
    {
        if(e1.getEmpAge() > e2.getEmpAge())
        {
            return 1;
        }
        else if (e1.getEmpAge() < e2.getEmpAge())
        {
            return -1;
        }
        else
        {
            return 0;
        }
    }
    
}
