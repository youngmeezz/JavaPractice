class Data1 {
    int value;
}

class Data2 {
    int value;


    //그럼 생성자는 객체 생성할때 만들어지는 거니까 static이랑 관계가 전혀 없는건지
    //그리고 생성자는 인스턴스 초기화 역할만 있는건지
    //생성자는 메서드인데 왜 클래스이름과 같이 만들어놓는지 그냥 메소드를 main메서드 안에서 같이 만들면 안되는지
    //main메소드를 놓고 그다음 따로 클래스를 만들어줘서 그안에서 생성자 메서드든지, 다른 기능을 하는 메서드 든지를 넣는다.
    Data2(int x) { //매개변수가 있는 생성자
        value = x;
    }

    Data2(){}//Data2의 기본 생성자 생성자를 따로 만들어준다. 왜냐면 Data1은 기본생성자 만들어져 있고
    //Data2는 매개변수 있는 생성자를 만들어 놔서 기본 생성자가 없다.k

}

class ConstructorTest {
    public static void main(String[] args) {
        Data1 d1 = new Data1();
       // Data2 d2 = new Data2(); //compile error발생
        Data2 d2 = new Data2(10); //Data2의 매개변수 있는 생성자(int x) 사용 할 경우
    }
}
