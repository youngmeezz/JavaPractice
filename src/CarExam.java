public class CarExam {
    public static void main(String[] args)
    {
        //객체를 생성했을때 각각 하나씩 생성이 되고 그 객체들 마다 속성이 각각 생성됨을 알 수 있다.
        Car c1 = new Car();
        Car c2 = new Car();
        //클래스를 이용해서 객체를 만들때는 클래스가 모두 참조형 타입이 될 수 있으니까 Car참조형 타입을 만든다.
        //Car 타입으로 c1이라는 변수를 만들어 주고 객체를 생성할때는 new라는 키워드 사용
        //new 연산자는 new 연산자 뒤에 나오는 생성자(Car())를 이용해서 메모리에 객체를 만들라는 의미 입니다.
        //메모리에 만들어진 객체를 instance라고도 한다
        //이렇게 만들어진 객체를 참조하는 변수가 c1,c2라고 합니다.
        //실행하면 Car 라는 객체가 두개가 만들어지고 각각의 객체를 참조하는 c1,c2변수가 선언 됨.

        //Car라는 객체가 메모리 상에 2개가 만들어진다.
        //객체 별로 name과 number라는 속성을 가지게 된다.
        //이 속성에 값을 넣고 싶다면 c1.해보면 참조변수 다음에 나오는 점은 c1참조변수 다음에 나오는 점은 참조변수가 참조하는 객체가 가지고 있는것을 사용할때 사용할 수 있다,
        //Car객체가 가지고 있는 것들을 보여준다 name과 number

        //객체가 가지는 속성에 대해 알아보기
        c1.name = "소방차";
        c1.number = 1234;

        c2.name = "구급차";
        c2.number = 1111;


        System.out.println(c1.name);
        System.out.println(c1.number);

        System.out.println(c2.name);
        System.out.println(c2.number);

        System.out.println(Car.width);
        System.out.println(Car.height);


    }
}
