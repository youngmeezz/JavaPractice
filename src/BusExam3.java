public class BusExam3 {
    public static void main(String[] args){
        Car8 c = new Bus3(); //부모타입은 Car8로 Bus3을 가리킬 수 있다.
        c.run(); //Car8부모가 가지고있는 run()메서드를 사용한다.
        //실제 생성된거는 Bus3()이 생성된거다. run 이외에도 ppangppang가지고 있음
        //c.ppangppang();//컴파일 상의 오류를 발생 시킴
        //부모타입으로 자식을 가리킬 수 있다. 이 경우 부모가 가지고 있는 내용만 사용 가능, 자식이 가진것은 사용 불가
        //실제 생성된 instance버스는 빵빵을 가지고 있는데 부모타입으로 가리키고 있어서 빵빵을 사용못해 억울
        //꼭 쓰고싶을 때 -> 형변환 클래스들 끼리도 형변환가능
        //기본형 타입 큰 그릇->작은 그릇 작은그릇->큰그릇
        //객체는 항상 부모가 좀 더 큰 그릇
        //부모가 자식을 가리킬 수는 있지만 지금도 형변환이 일어난것
        //Bus3()타입을 Car8이 가리키고 있다 Car8타입이 더 크니까 Car8타입으로 Bus3()가리키는것은 상관 없다. 즉, Car8 c = new Bus3();가능

        //그런데 이것을 Bus3타입으로 바꿔서 c를 가리키려고 하면 오류가 발생
        Bus3 bus =(Bus3)c;    //컴파일러 입장 : 이거는 Car8타입인데 Bus3이 가리킬 수 없어요
        //Car8(상위개념)에는 트럭이 올지 스포츠가 올지 모름 아무 차나 가리키면서 Bus3이라고 할 수 는 없다.
        //큰 그릇 -> 작은그릇에 넣을떄 타입을 바꿔줌 앞에 c를 (Bus3)c로 바꿈
        bus.run();//다시 bus레퍼런스로 둘다 수행 가능
        bus.ppangppang();
        //버스타입의 레퍼런스 변수

        //생성될때 Bus였기 때문에 Bus3으로 타입변환이 가능하다
        //Car8타입의 c라는 레퍼런스가 참조하는 것은 버스 타입으로 변환을 시켜서 버스타입의 레퍼런스변수 버스가 참조하도록 하였고
        //그 이유는 Car8가 참조하는 객체가 원래 Bus3이었기때문에 가능합니다.

        //Car8가 처음 생성될 때부터 Bus3가 아니라 Car c = new Car();생성되면 오류 발생 실제로 생성될때 Bus였기떄문에 Bus로 형변환이 당연하구나

        //부모가 자식을 가리킬수 있으나 부모가 가리킬때는 부모가 알고 있는 메서드까지만 접근 가능해서 이 이유때문에 형변환을 해야지
        //그 객체가 가진 모든 객체 사용가능하다.
    }
}
