public class BusExam extends Car {
   public static void main(String[] args){
       Bus bus = new Bus();
       bus.run();//Bus.java에는 아무것도 없지만 부모인 Car가 가진 메서드인 run()을 이용할 수 있다.
       bus.ppangppang();//Bus.java가 가진 메서드도 ppangppang()자연스럽게 실행 가능
    //Bus 부모가 가진 메서드 이외에도 추가로 메서드 이용하는 것을 확장 하였다. 상속받았다.ㅎ
       //run(),ppangppang()메서드 사용가능


       //부모클래스 만들기
       Car car = new Car();
       car.run();

       //부모클래스는 자식이 가지고 있는 것을 사용할 수는 없다.
       //car.ppangppang();
        //run()메서드는 가능하지만 자기가 가진거는 자연스럽게 사용 가능
       // ppangppang()메서드는 사용 못함 자식이 갖고 있는것이어서
       //상속 관계 is a  Bus 는 자식 클래스 Car는 부모 클래스
       //상속 관계 kind of
   }
}
