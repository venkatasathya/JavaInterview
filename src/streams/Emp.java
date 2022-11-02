package streams;

import java.util.Objects;

public class Emp {
    private int salary;
    private String name;
    private String deptName;
    private String address;
    private String status;
    private int empId;

    public Emp() {
    }

    public Emp(int empId,int salary, String name, String deptName, String address, String status) {
        this.salary = salary;
        this.name = name;
        this.deptName = deptName;
        this.address = address;
        this.status = status;
        this.empId = empId;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Emp emp = (Emp) o;
        return salary == emp.salary && deptName == emp.deptName && empId == emp.empId && name.equals(emp.name) && address.equals(emp.address) && status.equals(emp.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(salary, name, deptName, address, status, empId);
    }

    @Override
    public String toString() {
        return "Emp{" +
                "salary=" + salary +
                ", name='" + name + '\'' +
                ", deptName=" + deptName +
                ", address='" + address + '\'' +
                ", status='" + status + '\'' +
                ", empId=" + empId +
                '}';
    }

}
