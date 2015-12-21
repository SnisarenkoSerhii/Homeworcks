package hierarchy;

/**
 * Created by Sergey on 25.10.2015.
 */
public class Car {
    private String name;
    private int age;
    private int id;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    Car(Car ob){
        name = ob.name;
        age = ob.age;
        id = ob.id;
    }

    Car(String n, int a, int i){
        name = n;
        age = a;
        id = i;
    }

    Car(){
        this("NoName", -1, -1);
    }

    void getParameters(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(id);
    }

}
