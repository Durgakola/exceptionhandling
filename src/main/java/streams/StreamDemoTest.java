package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class StreamDemoTest {
    public static void main(String[] args) {
        Employee e=new Employee("0","ECE");
        System.out.println(e.hashCode());
        List<Employee> employeeList=new ArrayList<>();
        employeeList.add(new Employee("1","CSE"));
        employeeList.add(new Employee("2","ECE"));
        employeeList.add(new Employee("3","MECH"));
        employeeList.add(new Employee("4","ECE"));


         int startIndex=0;
         int endIndex= employeeList.size();
         for(int startI=0;startI< employeeList.size();startI++){
             System.out.println(employeeList.get(startI).getEmployeeId()+"   "+employeeList.get(startI).hashCode()+"  "+startI);
         }

         employeeList.stream().forEach(myEmp ->{
             System.out.println(myEmp.getEmployeeId()+" "+myEmp.hashCode());
         });

        Predicate<Employee> deptPredicate =(empPredicate) -> empPredicate.getDept().equals("ECE");
        long eceEmpCount=employeeList.stream().filter(emp -> deptPredicate.test(emp)).count();
        System.out.println(eceEmpCount);
    }
}
