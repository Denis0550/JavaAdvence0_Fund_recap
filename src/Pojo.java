public class Pojo {
    public static void main(String[] args) {

        User obj = new User();
        obj.name = "Yo";
        System.out.println(obj.name);

        User obj2 = new User("Denis!", 42);
        System.out.println(obj2.name + "|" + obj2.age);

        System.out.println(obj2);




    }//psvm
}//class end

class User{
   String name;
   int age;

   User(){};

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}