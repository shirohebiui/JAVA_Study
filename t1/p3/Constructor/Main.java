package t1.p3.Constructor;

/*
public class Main {
    public static void main(String[] args) {
        Person mp = new Person();
        mp.name = "James";
        mp.showName();
        mp.showRef();
    }
}

class Person {
    String name;

    void showName() {
        System.out.println(name);
    }

    void showRef() {
        System.out.println(this);
    }

    Person() {
        name = "John Doe";
        System.out.println("constructing... " + name);
    }
}
 */
public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Mimi");
        Person p2 = new Person("Tykon");
        Person p3 = new Person("Lapi");

        Person p4 = new Person();

        p1.showName();
        p2.showName();
        p3.showName();
        p4.showName();
    }
}
class Person{
    String name;
    public Person(){ //기본생성자는 사용자가 생성자를 정의하면 안만듦
        name = "John Doe";
        System.out.println("Constructing... " + name);
    }
    public Person(String name){
        this.name = name;
        System.out.println(this.name + "Constructed...");
    }
    void showName(){
        System.out.println(name);
    }
    void showRef(){
        System.out.println(this);
    }
}

/*
 * this 예약어
 * ex) 인스턴스 abc생성, abc.name은 외부에서 / 내부에서는 this.name
 * public Person(String name){
 *     this.name = name;
 * }
 */