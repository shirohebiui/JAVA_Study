package t1.p1.Calculator;

public class Main {

    public static void main(String[] args) {
        Calculator myCal = new Calculator();
        myCal.add(10, 20);
        System.out.println("add: " + myCal.result);
        myCal.sub(30, 14);
        System.out.println("sub: " + myCal.result);
        myCal.mul(3, 9);
        System.out.println("mul: " + myCal.result);
        myCal.div(10, 0);
        System.out.println("div: " + myCal.result);
    }

}
