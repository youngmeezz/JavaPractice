public class CarExam4 {

    public static void main(String[] args){
      //  Car4 c1 = new Car4(); //메서드와 비슷하게 생겼지만 몇가지 특징이 있다. Car4()가 생성자
    //더 이상기본 생성자를 이용해서 만들 수 없다 사용자가 생성자를 하나라도 추가했더니 기본생성자가 만들어지지 않는다.
        // 사용자가 정의한 생성자를 이용해서 만들자 메서드 쓸때 값 받아오니까 매개변수로 스트링값 받아옴 마치 매서드 같은 느낌이 된 객체 생성
        //객체 생성후 객체의 초기화를 해주는 것이다. 객체를 생성하고 미리 값이 들어있기를 바랄 때 = 초기화 할때 사용
        //new 연산자 다음에는 반드시 생성자가 나와야 합니다.
        //
        Car5 c2 = new Car5("소방차");
        Car5 c3 = new Car5("구급차");

        System.out.println(c2.name); //그냥 name = name하면 null이 출력됨 값을 제대로 사용 안됨
        //정확하게 name이 누군지 알려줘야 해서 this키워드를 사용한다. this는 내 구성요소 내 것
        //내 필드 name this.name에다가 지금들어온 매개변수 필드 name을 넣어주세요

        Car5 c1 = new Car5("소방차1");
        Car5 c4 = new Car5(); //원래 기본생성자가 만들어지지나 생성자를 하나라도 정의하게되면 기본생성자가 자동으로 만들어지지 않으니까
        //생성자도 여러개 정의를 할 수 있다.기본생성자로 Car5객체를 만드려고 했을때 컴파일 오류
        //그러나 나는 기본생성자로도 Car5객체 만들고싶어서 기본생성자 만들기
        System.out.println(c4.name);
        System.out.println(c4.number);
        Car5 c5 = new Car5("구급차1",1111);
        System.out.println(c5.name);
        System.out.println(c5.number);

        //그런데 만약에 기본생성자를 호출했을때 이름은 없음 숫자는 0으로 초기화 시키고 싶을때
    }
}
