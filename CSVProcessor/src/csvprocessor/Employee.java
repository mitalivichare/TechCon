package csvprocessor;

public class Employee {
    
    private int empId;
    private String empName;
    private String empCity;
    private int empAge;
    private int empSal;
    
    public Employee(int empId, String empName, String empCity, int empAge, int empSal)
    {
        this.empId = empId;
        this.empName = empName;
        this.empCity= empCity;
        this.empAge = empAge;
        this.empSal = empSal;
    }

    /**
     * @return the empId
     */
    public int getEmpId() {
        return empId;
    }

    /**
     * @param empId the empId to set
     */
    public void setEmpId(int empId) {
        this.empId = empId;
    }

    /**
     * @return the empName
     */
    public String getEmpName() {
        return empName;
    }

    /**
     * @param empName the empName to set
     */
    public void setEmpName(String empName) {
        this.empName = empName;
    }

    /**
     * @return the empCity
     */
    public String getEmpCity() {
        return empCity;
    }

    /**
     * @param empCity the empCity to set
     */
    public void setEmpCity(String empCity) {
        this.empCity = empCity;
    }

    /**
     * @return the empSal
     */
    public int getEmpSal() {
        return empSal;
    }

    /**
     * @param empSal the empSal to set
     */
    public void setEmpSal(int empSal) {
        this.empSal = empSal;
    }
    
    @Override
    public String toString()
    {
        return empId+" "+empName+" "+empCity+"  "+empAge+"  "+empSal;
    }

    /**
     * @return the empAge
     */
    public int getEmpAge() {
        return empAge;
    }

    /**
     * @param empAge the empAge to set
     */
    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }
    
}
