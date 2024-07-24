import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StudentTest {
    /**
     * This method is used to get the list of all the students whose percent is greater 90 percent
     * @param students
     * @return List<Student>
     */
    private static List<Student> getStudentsMoreThan90Percent(Student[] students)
    {
        List<Student> filterStudents = new ArrayList<>();
        for(int i=0;i<students.length;i++)
        {
            if(students[i].getAverageScore() >= 90) filterStudents.add(students[i]);
        }
        return filterStudents;
    }

    /**
     * This method is used to get list of students whose percentage is between some values
     * @param students
     * @param lowerLimit
     * @param upperLimit
     * @return
     */
    private static List<Student> getStudentsBetweenPercent(Student[] students, int lowerLimit, int upperLimit)
    {
        List<Student> filterStudents = new ArrayList<>();

        for(Student student : students)
        {
            if(lowerLimit <= student.getAverageScore() && student.getAverageScore() <= upperLimit) filterStudents.add(student);
        }
        return filterStudents;
    }

    /**
     * This method is used to get the list of students whose percent is below 60
     * @param students
     * @return
     */
    private static List<Student> getStudentsBelow60Percent(Student[] students)
    {
        List<Student> filterStudents = new ArrayList<>();

        for(int i=0;i<students.length;i++)
        {
            if(students[i].getAverageScore() <= 60) filterStudents.add(students[i]);
        }
        return filterStudents;
    }

    /**
     * This method is used to get the list of all students who have highest score in a district
     * @param students
     * @param districtName
     * @return
     */
    private static List<Student> getHigherpercentStudentsByDistrict(Student[] students, String districtName)
    {
        double topScore = 0;
        for(Student student : students) topScore = Math.max(topScore, student.getAverageScore());

        List<Student> list = new ArrayList<>();
        for(Student student : students)
        {
            if(student.getAverageScore() == topScore) list.add(student);
        }
        return list;
    }

    public static void main(String[] args) {
        Student[] students = new Student[10];
        Random random = new Random();
        
        String[] cities = {"City1", "City2", "City3", "City4", "City5"};
        String[] districts = {"District1", "District2", "District3", "District4", "District5"};
        String[] states = {"State1", "State2", "State3", "State4", "State5"};
        String country = "Country";

        for (int i = 0; i < students.length; i++) {
            String name = "Student" + (i + 1);
            int age = random.nextInt(10) + 15;
            int percent = random.nextInt(4) + 9;
            int[] subjects = new int[4];
            for (int j = 0; j < subjects.length; j++) {
                subjects[j] = random.nextInt(100) + 1;
            }
            String city = cities[random.nextInt(cities.length)];
            String district = districts[random.nextInt(districts.length)];
            String state = states[random.nextInt(states.length)];

            students[i] = new Student(name, age, percent, subjects, city, district, state, country);
        }

        System.out.println(getStudentsMoreThan90Percent(students));
        System.out.println(getStudentsBetweenPercent(students, 30, 90));
        System.out.println(getStudentsBelow60Percent(students));
        System.out.println(getHigherpercentStudentsByDistrict(students, "Disrict1"));
    }
}
