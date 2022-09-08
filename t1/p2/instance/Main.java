package t1.p2.instance;

public class Main {
    public static void main(String[] args) {
        miniPerson mp = new miniPerson(); // mp = 인스턴스
        /*
         * exmaple
         * CLASS A; <-A는 객체(생성)
         * A = new CLASS(); <-A는 인스턴스(메모리할당)
         */
        mp.name = "Cookie King";
        mp.showName();
        System.out.println(mp);// 주소값
    }
}

class miniPerson {
    String name;

    void showName() {
        System.out.println(name);

    }
}
