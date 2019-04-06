class Car4 {

    //판매자가 관리
    String color;   //색상
    String gearType; //변속기 종류 - auto(자동),manual(수동)
   static final int door = 4;   //문의 개수

   Car4() { }  //그냥 기본생성자


    //생성자도 메서드다 메서드를 여러개 만들어서 우선 생성자는 초기화 할려고 만들어준거고
    //그럼 초기화 하는 이유가 null값 넣는게 마음에 안들어서? 위에다가 초기화 시키면 왜 안되지..?
    //기본생성자로 원래 자동으로 초기화 해줘서 위에다가 초기화 시킬 필요가 없는건가?
    //초기화 이후에는 여러가지 메서드1(차 색이 빨강) 메서드2(차 색이 노랑)넣으면서 값을 계속 바꿔줄수 있게 만들면 된다.
//
//    Car4(String c, String g){ //매개변수 있는 생성자
//        color = c;
//        gearType = g;
//        //door = d;
//    }
    //color나 gearType이나 바꿀일이 생길텐데 위에 생성자 메서드에다가
    //String color = c;를 해버리면 Car4(String c, String g)메서드 안에서만 사용 가능하고
    //그러면 그 메서드 안에서만 돌면 다른 메서드를 생성해서 할때 소비자가 막 바꾸기가 힘드니까 안됨

}

public class CarTest {
    public static void main(String[] args) {
        //객체 생성하는 이유가 매서드 안에 있는 객체들을(색깔,갯수) + 기능 사용하려고 하는 것
        //생성자는 그때 객체들을 초기화 시켜주는 역할만 하고
        //다른 메서드들은 다른 기능들을 또 하기 때문에 다른 메서드도 참조하기 위해서 객체를 항상 선언생성해준다.
        Car4 c1 = new Car4();//판매자

        c1.color = "white";
        c1.gearType = "auto";
        //c1.door = 4;

        //소비자가 관리
       // Car4 c2 = new Car4("white","auto");//소비자?

     //   System.out.println("c1의 color=" + c1.color +", gearType=" + c1.gearType+", door="+c1.door);

     //  System.out.println("c2의 color=" + c2.color + ", gearType=" + c2.gearType + ", door=" + c2.door);
    }
}
