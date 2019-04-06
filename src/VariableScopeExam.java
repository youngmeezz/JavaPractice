public class VariableScopeExam {
    //변수의 사용 범위 변수가 선언된 블록
    //이런식으로 변수의 범위에 대해 살펴보기
    //필드를 하나 선언
    int globalScope = 10; //포함하는 블럭이 클래스 전체가 사용 범위
    static int staticVal = 7;//static한 필드를 하나 선언


    //메서드를 하나 만들기
    public void scopeTest(int value) {
        int localScope = 20;
        //메서드에서 어떤 변수 까지 사용가능한지 테스트
        System.out.println(globalScope); //globalScope도 사용가능 전역변수
        System.out.println(localScope);
        System.out.println(value);//매개변수로 선언된 value라고 선언하는 것도 상관 없다
        // 블럭바깥에 선언된 value는 바깥에 존재하지만, 매서드 선언부에 존재 하므로 해당 메서드 블럭 내라고 보면 된다.
    }

    //다른 메서드 내에서도 사용가능한 변수들인지 테스트
    public void scopeTest2(int value2) {
        System.out.println(globalScope);
        //       System.out.println(localScope);
        //       System.out.println(value); 컴파일 에러가 발생함 이 변수를 선언한 블럭에 포함되지 않아서 scopetest2에서 사용 불가
        System.out.println(value2); //이때 선언된 value2는 사용 가능
    }

    //클래스는 붕어빵의 틀 모든 클래스는 인스턴스화 하지 않고 사용할 수는 없습니다.
    //메인 메서드에는 static 이라는 키워드가 있는데요 new 하지 않아도 실행 되었던 이유
    //클래스가 인스턴스화 되지 않아도 static한 메서드나 static한 필드를 사용할 수 있다.
    //static하지 않은 메서드 내에서 static한 메서드
    public static void main(String[] args) {
        // System.out.println(globalScope); 해당 클래스 내에 있어도 컴파일 에러가 나는 이유
        //이 비밀은 static키워드에 있다.
        //모든 클래스는 인스턴스화 하지 않은 채로는 사용할 수 없다. 붕어빵 틀이 붕어빵과는 다른 이유
        //main메서드에는 static이라는 키워드가 붙어있다.지금까지 클래스를 정의하고 클래스를 new하지 않은 이유도
        //메인 메서드가 실행되었던 비밀 -> static 붙여주는면 클래스가 인스턴스화 하지 않아도 static한 메서드나 static한 필드를 사용할 수 있다.
        //이렇게 static한 메서드는 객체를 생성하지 않아도 사용할 수 있기 때문에 static한 메서드 내에서 static하지 않은 필드는 사용할 수 없습니다.
        //static한 메서드가 사용하는 시점에 해당 클래스가 인스턴스화 되지 않았을 수 도 있기 때문이다.

        //키워드 static을 사용하면 인스턴스화 하지 않아도 사용할 수 있다.
        System.out.println(staticVal);//static한 변수들은 static 하지 않은 메서드내에서는 사용해도 문제되지 않는다.
        //메인 메서드 static한 메서드 에서 static 하지 않은 변수들을 사용하는 것은 어떻게 할까요?
        //-> 객체를 생성하고 사용하면 된다. 사용할떄는 reference변수.필드이름을 해야지 접근할 수 있다
        //static한 변수들은 반드시 기억해야 할 점 globalScope를 저장하는 공간이 하나 생김
        //v2라는 레퍼런스가 생성가능하게 하나 더 생성 globalScope에 저장할 수 있다.
        //각각 값들을 출력해 보도록 한다.
        VariableScopeExam v1 = new VariableScopeExam();
        System.out.println(v1.globalScope);//10
        VariableScopeExam v2 = new VariableScopeExam();
        v1.globalScope = 10;
        v2.globalScope = 20;
        System.out.println(v1.globalScope);//10
        System.out.println(v2.globalScope);//10
        //static한 변수에도 value넣기
        v1.staticVal = 50;
        v2.staticVal = 100;
        System.out.println(v1.staticVal); //50 (x) 100이 출력됨
        System.out.println(v2.staticVal); //100
        //클래스변수는 레퍼런스변수.변수명 이렇게 쓰기 보다는
        //인스턴스 생성되지 않아도 사용 가능해서 클래스이름.클래스변수명 이렇게 쓰는게 더 낫다.
        System.out.println(VariableScopeExam.staticVal);

        //static한 필드는 인스턴스 생성시 만들어지는게 아니고 값을 저장할 수 있는 공간이 하나밖에 없어서 값을 공유 이런 변수를 클래스변수라고 하고
        //globalScope같은 변수는 instance가 생성될때 생성되기 때문에 인스턴스 변수라고 생각하면 된다.
        //클래스변수는 static한 변수, 값을 저장할 수 있는 공간이 하나밖에 없어서 값을 공유한다. 이런 변수를 클래스 변수라고 한다.


        //클래스 변수는 레퍼런스변수.변수명
        //인스턴스가 생성되지 않아도 사용되기 떄문에
        //클래스이름.클래스변수명

        // System.out.println(localScope);
        // System.out.println(value);

    }

}

/*
public class VariableScopeExam{
    static int value = 10;
    public static void main(String []args){
        System.out.println(value);
    }
}
*/

/*
public class StaticExam{
    public static void main(String []args){
        Car taxi = new Car();
        Car suv = new Car();

        taxi.wheelCount = 10;
        suv.wheelCount = 4;

        System.out.println("taxi의 바퀴수:"+ taxi.wheelCount);
        System.out.println("suv의 바퀴수:"+ suv.wheelCount);
    }
}
public class Car{
    static int wheelCount;
}
 */
/*
    static int wheelCount는 static으로 선언 되어서 wheelCount에 할당된 메모리 공간은 모든 Car 인스턴스가 공유하게 되요.
        고로 taxi.wheelCount, suv.wheelCount 모두 같은 메모리공간을 가르키게 됩니다.
*/