package streams;

public class Employee {
    int i;
    String jeff_bezos;
    double v;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public String getJeff_bezos() {
        return jeff_bezos;
    }

    public void setJeff_bezos(String jeff_bezos) {
        this.jeff_bezos = jeff_bezos;
    }

    public double getV() {
        return v;
    }

    public void setV(double v) {
        this.v = v;
    }

    public Employee(int i, String jeff_bezos, double v) {
        this.i = i;
        this.jeff_bezos = jeff_bezos;
        this.v = v;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "i=" + i +
                ", jeff_bezos='" + jeff_bezos + '\'' +
                ", v=" + v +
                '}';
    }
}
