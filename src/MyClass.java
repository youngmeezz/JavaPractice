//메서드란 클래스가 가지고 있는 기능을 의미 그래서 클래스 내부에 선언
public class MyClass {
    //public 리턴타입(메서드 실행 후 결과 값을 돌려주는) 메서드 명(매개변수 들){ 구현부}
    //다양한 형태로 메서드 정의 가능
    //method1 들어오는 매개변수도 없고 돌려줄 값도 없는 경우도 메서드 이다.
    //method1번 void는 리턴 타입이 없다 매개변수도 없다.
    public void method1() {
        System.out.println("m1 이 실행됨..");
    }

    //정수를 받아들여서 수행을 하고 리턴은 하지 않음 결과값은 돌려주지 않음
    //method2번 void, 매개변수 int x
    public void method2(int x) {
        System.out.println(x + "를 이용한 m2 실행 ");
    }

    //아무값도 받아들여지지 않았지만, 값을 돌려주는 메서드
    //리턴값이 존재하고
    public int method3() {
        System.out.println("m3 실행");
        return 10; //값을 돌려줘야 해서 return
    }

    //리턴은 하지 않고 매개변수는 두개
    public void method4(int x, int y) {
        //기본 데이터 타입아닌 참조형 클래스나 배열, 인터페이스도 사용 가능)
        System.out.println(x + y + " method4 실행");
    }

    //값을 받아서 값을 출력하는 형태
    public int method5(int y) {
        System.out.println(y + " 이용한 m5 실행");
        return y * 2;
    }
}
