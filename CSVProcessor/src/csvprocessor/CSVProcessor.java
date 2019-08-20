package csvprocessor;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CSVProcessor {

    public static void main(String[] args) {
        
        List<Employee> employees = readEmployeeCSV("D:\\MITALI\\borivali\\demos\\Employee.csv");
        //display employee list
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the option:\n 1. Sort By Age\n 2.Sort By Salary");
        int choice = scan.nextInt();
        if(choice == 1)
        {
            Collections.sort(employees, new AgeComparator());
            System.out.println("EmployeeID Employee Name City Age Salary");
        for(Employee employee : employees)
        {
            System.out.println(employee);
        } 
            
        }
        else
        {
            Collections.sort(employees, new SalaryComparator());
            System.out.println("EmployeeID Employee Name City Age Salary");
        for(Employee employee : employees)
        {
            System.out.println(employee);
        } 
        }
           
    }
    //to read csv file
    private static List<Employee> readEmployeeCSV(String fileName) {
        List<Employee> empList = new ArrayList<>();
        Path path = Paths.get(fileName);

        try (BufferedReader br = Files.newBufferedReader(path)) 
        {
            String line = br.readLine();            
            while (line != null)
            {  
                String[] records = line.split(",");
                Employee emp = addEmployee(records);

                empList.add(emp);
                line = br.readLine();
            }

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return empList;
    }
  
    private static Employee addEmployee(String[] data) {
        int id= Integer.parseInt(data[0]);
        String name = data[1];
        String city = data[2];
        int age = Integer.parseInt(data[3]);
        int salary = Integer.parseInt(data[4]);

        return new Employee(id,name,city,age,salary);
    }
    
}
