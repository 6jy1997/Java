public class ReflectDemo {

    public static void main(String[] args) throws Exception {

        Class cls1 =Class.forName("Person");
        System.out.println(cls1);

        Class cls2 =Person.class;

        Person p = new Person();
        Class cls3 = p.getClass();

        System.out.println(cls2);
        System.out.println(cls3);




    }


}


class Person{

    private int age;
    private String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }


    public  Person(){

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
