public class Dog {
    private String name;
    private int age;
    private int weight;
    private  int height;

    public Dog(String name) {
        this.name = name;
    }
    public Dog(String name1, int age1, int weight1, int height1){
        name = name1;
        age = age1;
        weight = weight1;
        height = height1;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }
}
