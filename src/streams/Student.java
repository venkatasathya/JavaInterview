package streams;

import java.util.List;
import java.util.Objects;

public class Student {

   @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", location=" + location +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return getId() == student.getId() && Objects.equals(getName(), student.getName()) && Objects.equals(getLocation(), student.getLocation());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getLocation());
    }

    public Student(int id, String name, Location location) {
        this.id = id;
        this.name = name;
        this.location = location;
    }

    public Student() {
    }

    private int id ;
    private String name;
    private Location location;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setName(String name) {
        this.name = name;
    }


}
