public class MyClassExam {
    public static void main(String[] args){
        //클래스가 가진 메소드를 사용하기 위해서는 객체로 만들어야 사용 할 수 있다.!!!!!!!!
        //붕어빵 틀은 아무리 만들어 봐야 붕어빵을 만들지 않으면 먹을 수 없는것과 같은 원리
     MyClass myclass = new MyClass(); //MyClass라는 객체가 하나 만들어지고
        //여기서 myclass.해보면 이 레퍼런스 변수가 가진 클래스 이 객체가 갖고있는 속성 필드, 메서드에 접근할 수 있다.
        //ctrl+space를 눌러도 메서드를 볼 수 있다.
        //method1부터 사용하기
        myclass.method1();
        myclass.method2(10);//int 값 을 넣어줘야 해당값 리턴 가능
        int value = myclass.method3();//10을 리턴했는지 안했는지 알 수 없다. 그 값을 받아낼 값을 알고 싶다. int value 변수를 만들어서
        //값을 넣어준다.
        System.out.println("m3이 리턴한 값"+ value );
        myclass.method4(5,10);
        int value2 = myclass.method5(55);
        System.out.println("m5가 리턴한 값 : "+value2);

    }
}
