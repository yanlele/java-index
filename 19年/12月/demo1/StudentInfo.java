package demo1;

public class StudentInfo implements Comparable<StudentInfo> {
    private String id;
    private String name;
    private Integer chinese;
    private Integer english;
    private Integer math;
    private Integer average;

    public StudentInfo() {
    }

    public StudentInfo(String id, String name, Integer chinese, Integer english, Integer math) {
        this.id = id;
        this.name = name;
        this.chinese = chinese;
        this.english = english;
        this.math = math;
        this.average = (chinese + english + math) / 3;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getChinese() {
        return chinese;
    }

    public void setChinese(Integer chinese) {
        this.chinese = chinese;
    }

    public Integer getEnglish() {
        return english;
    }

    public void setEnglish(Integer english) {
        this.english = english;
    }

    public Integer getMath() {
        return math;
    }

    public void setMath(Integer math) {
        this.math = math;
    }

    public Integer getAverage() {
        return average;
    }

    public void setAverage(Integer average) {
        this.average = average;
    }

    @Override
    public String toString() {
        return "StudentInfo{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", chinese=" + chinese +
                ", english=" + english +
                ", math=" + math +
                ", average=" + average +
                '}';
    }

    @Override
    public int compareTo(StudentInfo o) {
        return Integer.compare(o.average, this.average);
    }
}
