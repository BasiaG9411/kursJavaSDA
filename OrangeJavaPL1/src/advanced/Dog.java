package advanced;

public class Dog {
    public String name;
    private int age;


    public void bark() {
        System.out.println(name + " is doing Hau hau");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        if(age > 0) {
            this.age = age;
        } else{
            System.out.println("ERROR: age " + age + "is invalid");
        }
    }
    public int getAge() {
        return age;
    }
    private boolean validdataAge(int age){
        return age > 0 && age <30;

    }

    }


