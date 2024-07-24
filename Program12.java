import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Student implements Comparable<Student>
{
    private int rollNo;
    private String name;

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Student other)
    {
        return this.rollNo - other.rollNo;
    }

    @Override
    public String toString() {
        return "Student [rollNo=" + rollNo + ", name=" + name + "]";
    }
}

public class Program12 {
    public static void main(String[] args) {
        List<Student> li = new ArrayList<Student>();
        li.add(new Student(37, "Surya"));
        li.add(new Student(31, "Yashwanth"));
        li.add(new Student(34, "Ritesh"));
        li.add(new Student(38, "Manohar"));

        // Using Comparable -> compareTo()
        Collections.sort(li);
        System.out.println(li);

        // Using Comparator -> compare()
        Collections.sort(li, (a, b) -> a.getName().compareTo(b.getName()));
        System.out.println(li);


        Map<Integer, Student> map = new HashMap<>();
        li.forEach(e -> map.put(e.getRollNo(), e));

        map.forEach((k, v) -> System.out.println(k + " " + v));
        map.entrySet().forEach(e -> System.out.println(e));
    }
}
