public class Car5{

    //타입 필드명
    String name;
    int number;

    //리턴 타입이 없다.
    //매개변수 없는 생성자가 컴파일 할때 만들어지는것 기본생성자
    //생성자를 하나라도 만들면 기본생성자는 자동으로 만들어지지 않는다.
    public Car5(String name) { //매개변수를 n으로 하면 변수의 이름을 알아보기 힘듬 name일지 number일지 이름의 값을 받기를 원해서 name으로 바꿈
        //객체 자신을 참조하는 this키워드
        this.name = name; //this는 의외로 중요한 키워드 객체 자신을 참조하는 키워드임을 꼭 기억하자
    }
    //변수를 선언할때에는 알아보기 쉽게 직관적으로 알아보기 쉽게 정하는게 좋기 때문에 String n으로 만든 매개변수를
        //String name으로 변환
        //name = name 이렇게 해놓으니 에러가 난다. 이름이 같기 떄문에 자기랑 가깝게 있는 선언된 변수를 생각하게 되서 둘다 같이 매개변수 name으로 인식
        //this키워드를 사용해서 위에 String name이라고 필드 객체 만든거에서 매개변수 이름도 name으로 두고
        //이를 참조하기 위해서 name에다가 매개변수로 받은 name을 넣기 위해서 this키워드 사용함

        //클래스 안에서 자기자신이 가지고 있는 메서드를 사용하고 싶을 때도 this.메서드 명 으로 호출 가능하다
        //나의 생성자를 호출할 때에도 this라는 키워드 사용
        public Car5(){
//        this.name = "이름 없음";
//        this.number = 0;

            //this는 자기 자신을 가리킨다고 했으니this() -> 나의 생성자를 의미 ("이름없음",0)호출하면
            // Car5의 default값을 넣어주면 호출하면 String값과 default생성자가 호출됬을때 인자 두개 string,int값가진 생성자가 호출 됨
            // 생성자 아래에 Car5(String name, int number) this.name = name은 이름 없음/ this.number = number 에서 0 대입
            //this()하면 자신의 생성자를 호출 그래서 Car5(String name,int number)을 호출한것임 타입이랑 갯수보고 생성자 호출함
            this("이름없음",0);//String값과 int값을 가지고 호출하게 됨
            //필드의 number에는 0을 초기화
            //this는 자신의 생성자를 호출하는 것이다. type의 갯수와 타입을 보고 알맞는 생성자를 호출해 낼 수 있다.
            //자기자신의 생성자를 호출함으로써 코드가 중복됨을 방지할 수 있다.

        }

        public Car5(String name, int number){
        this.name = name;
        this.number = number;
        }
        //같은 코드가 두번 반복된다.
    //        this.name = "이름 없음";
    //        this.number = 0;
}

//생성자 오버로딩 : 메소드와 마찬가지로 매개변수의 수와 타입이 다르다면 여러개의 생성자를 만들수 있다.
