public class Student {
    String name;
    int age;
    int percent;
    double averageScore;
    int subjects[];
    String city;
    String district;
    String state;
    String country;

    public Student(String name, int age, int percent, int[] subjects, String city, String district, String state, String country)
    {
        this.name = name;
        this.age = age;
        this.percent = percent;
        this.subjects = subjects;
        this.city = city;
        this.district = district;
        this.state = state;
        this.country = country;

        this.averageScore = calculateAverageScore(subjects);
    }

    /**
     * This method is used Calculate Average Score of a Student
     * @param subjects
     * @return averageScore
     */
    private double calculateAverageScore(int subjects[])
    {
        double averageScore = 0;

        for(int score : subjects) averageScore += score;

        averageScore = averageScore / subjects.length;

        return averageScore;
    }

    public double getAverageScore()
    {
        return this.averageScore;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + '\'' +
                ", age=" + age +
                ", percent=" + percent +
                ", subjects=" + java.util.Arrays.toString(subjects) +
                ", city='" + city + '\'' +
                ", district='" + district + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", averageScore=" + averageScore +
                '}';
    }
}
