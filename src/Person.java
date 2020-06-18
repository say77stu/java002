public class Person {

    private String name;
    private int age;
    private String country;

    public Person(){
        country = "RU";
    }

    public Person(String name, int age){
        this();
        this.name=name;
        this.age=age;

    }

    public String getName(String name){
        return name;
    }

    public int getAge(int age){
        return age;
    }

    public String getCountry(String country){
        return country;
    }
    public static void main(String[] args) {
        String nameValue = "Ivan";
        Person Petrov = new Person(nameValue, 99);
        System.out.println(Petrov.age);
        System.out.println(Petrov.country);
        System.out.println(Petrov.name);
    }


}

