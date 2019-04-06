class MyMath2 {
    static long a=10;
    static long b=100;

    //인스턴스변수 a,b를 이용한 작업을 하므로 매개변수가 필요 없다.
    long add() {
        return a + b;
    }

    long substract() {
        return a - b;
    }

    long multiply() {
        return a * b;
    }

    double divide() {
        return a / b;
    }

    //인스턴스 변수와 관계없이 매개변수만으로 작업 가능하다.
    static long add1() {
        return a + b;
    }//a,b는 지역변수

    static long substract(long a, long b) {
        return a - b;
    }

    static long multiply(long a, long b) {
        return a * b;
    }

    static double divide(double a, double b) {
        return a / b;
    }

    MyMath2(){} //생성자를 이렇게 만들어준는 것이지만 객체를 선언하자 마자 기본생성자가 생기기 떄문에
    //생략을 해준다.
}

public class MyMathTest2{
    public static void main(String[] args){
        //클래스메서드호출, 인스턴스 생성 없이 호출가능
        //static 메서드(클래스에서 바로 사용하는 느낌이라서 클래스메서드라고 불림)는 클래스이름.메서드명으로 사용 가능
        System.out.println(MyMath2.add1());
        System.out.println(MyMath2.substract(200L,100L));
        System.out.println(MyMath2.multiply(200L,100L));
        System.out.println(MyMath2.divide(200.0,100.0));

        //클래스이름을 객체로 생성하는 이유는 클래스(설계도) 내부에 객체(물건) 기능을 사용하려고
        //원래 static 메서드(클래스에서 바로 사용하는 느낌이라서 클래스메서드라고 불림)
        //아니고 그냥 인스턴스만 있는 메서드면 이렇게 객체 생성 해야한다.
        MyMath2 mm = new MyMath2(); //인스턴스를 생성
        mm.a = 200L;
        mm.b = 100L;
        //인스턴스메서드는 객체 생성 후에만 호출이 가능함
        System.out.println(mm.add());
        System.out.println(mm.substract());
        System.out.println(mm.multiply());
        System.out.println(mm.divide());
    }
}
