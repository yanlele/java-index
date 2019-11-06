public class Pets {
    private String name;
    private Double age;
    private Double weight;
    public static int counter = 0;

    public Pets(String name, Double age, Double weight) {
        Pets.counter++;
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public void eat (Double foodWeight) {
       Double weight = Math.floor(foodWeight / 50);
       this.weight += weight;
    }

    public void run(Double meter) {
        Double runMeter = Math.floor(meter / 1000) * 10;
        this.weight -= runMeter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Double getAge() {
        return age;
    }

    public void setAge(Double age) {
        this.age = age;

    }
    public Double getWeight() {
        return weight;
    }
    public void setWeight(Double weight) {
        this.weight = weight;
    }
}
