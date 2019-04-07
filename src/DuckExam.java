public class DuckExam {
    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.sing();//Bird가 가진 sing도 Duck이 상속받은거라서 사용가능하고 오버라이딩(똑같이 함수 썼는데 내용만 변경됨 오리 꽥꽥으로)이거 이용해서 사용됨
        duck.fly();//Bird가 가진 fly도 상속 받은거라서 사용 가능

        //Bird b = new Bird();
        //실제 Bird클래스는 객체 생성시 오류 추상 클래스는 부모로서의 역할은 가능하지만 객체를 생성하는 부분은 사용 불가이다.

        //새 라는 단어는 추상적이다 비둘기인지 앵무새인지 누구인지 모름
        //비둘기 같은 구체적인 것들은 구체적인 클래스를 만들어낼 수 있지만 새는 클래스로서 모호해서 추상클래스 사용
        //이렇게 모호한 단어를 가진 클래스들은 부모로서의 역할은 수행 가능하지만 객체는 될수 없다 객체는 구체적인 클래스만 가능
        //객체지향세상에서도 모호한 클래스 추상클래스 생성 가능
    }
}
