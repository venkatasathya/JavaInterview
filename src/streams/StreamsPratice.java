package streams;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsPratice {
    public static void main(String[] args) {

        get_Emp_Count_Based_on_Each_Dept();
    }
    static void get_Emp_Details_Based_on_Dept(){

        List<Emp> empData = getEmpData();
        Map<String, List<Emp>> collect = empData.stream().collect(Collectors.groupingBy(Emp::getDeptName, Collectors.toList()));
        collect.entrySet().forEach(System.out::println);
        empData.stream().filter(emp -> emp.getStatus()=="Active").forEach(System.out::println);
    }

    static void get_Unique_Names_Emp(){
        List<Emp> empData = getEmpData();
        //Duplicate Occurance
        Map.Entry<String, Long> entryStream = empData.stream()
                .collect(Collectors.groupingBy(Emp::getName, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .findFirst()
                .get();
        //List<Map.Entry<String, Long>> collect2 = collect1.entrySet().stream().filter(entry -> entry.getValue() > 1).collect(Collectors.toList());
        System.out.println(entryStream);
        //Find duplicate Names
        Set<String> duplicate=new HashSet<>();
        Set<String> collect = empData.stream()
                .map(Emp::getName)
                .filter(names -> !duplicate.add(names))
                .collect(Collectors.toSet());
        duplicate.forEach(System.out::println);
    }

    static void get_Active_And_InActive_Emp(){
        List<Emp> empData = getEmpData();
        Map<String, Long> collect = empData.stream()
                .collect(Collectors.groupingBy(Emp::getStatus,Collectors.counting()));
        collect.entrySet().forEach(System.out::println);
    }
    static void get_Highest_Salary_In_Each_Department(){
        List<Emp> empData = getEmpData();
        Map<String, Optional<Emp>> collect = empData.stream()
                .collect(Collectors
                        .groupingBy(Emp::getDeptName, Collectors
                                .reducing(BinaryOperator
                                        .maxBy(Comparator
                                                .comparing(Emp::getSalary)))));

        collect.entrySet().forEach(System.out::println);
    }

    static void get_Max_Salary_Emp(){
        List<Emp> empData = getEmpData();
        Optional<Integer> integer = Optional.of(empData.stream()
                .max(Comparator.comparing(Emp::getSalary))
                .map(Emp::getSalary).get());
        System.out.println("Max Salary of Emp :"+integer.get());
    }

    static void get_Min_Salary_Emp(){
        List<Emp> empData = getEmpData();
        Optional<Emp> min = Optional.of(empData.stream().min(Comparator.comparing(Emp::getSalary)).get());
        System.out.println("min Salary of Emp :"+min);
    }
    static void get_Emp_Count_Based_on_Each_Dept(){
        List<Emp> empData = getEmpData();
        Map<String, Long> collect = empData.stream().filter(emp -> Objects.equals(emp.getStatus(), "Active")).collect(Collectors.groupingBy(Emp::getDeptName, Collectors.counting()));
        collect.entrySet().forEach(System.out::println);
    }

    static List<Emp> getEmpData(){
        Emp emp=new Emp(101,40000,"Mike","Developer","Blr","Active");
        Emp emp1=new Emp(102,200000,"Mike2","Manager","Noida","Active");
        Emp emp2=new Emp(103,200000,"Mike","Manager","Chennai","InActive");
        Emp emp3=new Emp(104,35000,"Mike4","Developer","Blr","Active");
        Emp emp4=new Emp(105,20000,"Mike5","HR","Noida","Active");
        Emp emp5=new Emp(106,40000,"Mike","Tester","Blr","InActive");
        Emp emp6=new Emp(107,22000,"Mike7","Tester","Noida","Active");
        Emp emp7=new Emp(108,40000,"Mike8","Developer","Blr","Active");
        Emp emp8=new Emp(109,50000,"Mike9","UI","Blr","Active");
        Emp emp9=new Emp(110,35000,"Mike10","UI","Blr","InActive");
        Emp emp10=new Emp(111,38000,"Mike11","Developer","Blr","Active");

        List<Emp> employee=new ArrayList<>();
        employee.add(emp);
        employee.add(emp1);
        employee.add(emp2);
        employee.add(emp3);
        employee.add(emp4);
        employee.add(emp5);
        employee.add(emp6);
        employee.add(emp7);
        employee.add(emp8);
        employee.add(emp9);
        employee.add(emp10);
        return employee;
    }

}
