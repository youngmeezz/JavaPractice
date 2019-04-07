public class CastingTest1 {
    public static void main(String[] args)
    {
        /*
        Car9 car = null;
        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;

        fe.water();
        car = fe;   //car =(Car)fe;에서 형변환이 생략된 형태다.
        //car.water(); 컴파일 에러 Car타입의 참조변수로는 water()를 호출할 수 없다. 부모메서드까지만 사용가능 자식메서드 사용 못함
        fe2 = (FireEngine)car;// 자손타입 <-조상타입
        fe2.water();
        */
        Car9 car = new Car9();
        Car9 car2 = null;
        FireEngine fe = null;

        car.drive();
        fe = (FireEngine)car;   //컴파일은 성공하지만 실행시 에러 (ClassCastException)가 발생 조상타입의 인스턴스를 자손타입의 참조변수로 참조하는 것은 허용하지 않는다.
        fe.drive();
        car2 = fe;
        car2.drive();
    }
}
class Car9{
    String color;
    int door;

    void drive() {    //운전하는 기능
        System.out.println("drive, Brrr~");
    }

    void stop(){    //멈추는 기능
        System.out.println("stop!!!");
    }
}
class FireEngine extends Car9{  //소방차
    void water(){   //물뿌리는 기능
        System.out.println("water!!!");
    }
}