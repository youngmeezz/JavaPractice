public class CallStackTest {
    public static void main(String[] args){
        CallStackTest mm = new CallStackTest(); //인스턴스를 생성 /원래 객체 생성해주고 생성자 생겨서 인스턴스를 초기화 해주고 메서드 호출하나요?
        mm.firstMethod();  //static메서드는 객체 생성 없이 메서드가 호출 가능하다.

        //firstMethod();
    }
    void firstMethod(){
        secondMethod();
    }
    static void secondMethod(){
        System.out.println("secondMethod()");
    }
}
