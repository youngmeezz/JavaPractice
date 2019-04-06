public class StringMethodExam {
//객체를 사용하는 중요한 이유는 그 객체가 가지고 있는 기능을 이용하면 좋죠
    //String클래스가 사용하는 몇가지 메서드 사용하기
    public static void main(String[] args){
        //String str = new String("hello");//new연산자를 사용해서 생성자를 써 주고 해당 생성자를 이용해 객체를 생성해 냄
        //자바에서 스트링 클래스는 자주 사용되기 떄문에 자바에서 특별하게 생성법이 생김
        String str = "hello";
        String str1 = "hello world";
        //str.해보면 이 참조변수가 객체가 사용할 수 있는 필드와 메서드들이 보여진다.
        //string은 문자열바꿔주거나,추출하거나,등등이 있다.
        System.out.println(str1.length());//문자열의 길이를 return 공백도 하나로 문자라고 생각해서 11이 뜬다.
        System.out.println(str.concat(" world")); //문자열과 문자열을 결합해준다. 이때 주의 해야 할 점
        //문자열을 붙였을때 다시 str출력하면 hello 만 출력됨
        System.out.println(str); //str이 hello를 가리킴
        //string클래스는 concat메소드를 한다고 해서 다른 참조하고 있는 변수들한테 문제가 생기니까
        //string클래스는 한번 만들어진 클래스를 변화하게 만들지 않습니다. 불변클래스
        String str2 = "hello world"; //str2가 str이 가리키는 참조 변수가 같다.
        str = str.concat(" world"); //이렇게 해야지 str변수의 참조가 hello world로 변함, 원래 str은 hello를 가리키고 있었음
        System.out.println(str);//str이 hello world를 가리킴

        System.out.println(str.substring(3));//시작 글자부터 마지막 글자까지 짤라주세요
        System.out.println(str.substring(3,6));//3번인덱스부터 6번인덱스까지 잘라주세요 공백까지 문자열 포함

        //대표적으로 스트링이 갖고 있는 메서드들을 살펴봄 모든 객체를 스스로 구현하는게 아니라 적절하게 객체를 잘 이용 객체가 가진 기능을 잘 사용 메서드를 잘 사용
        //어떤 객체가 어떤 일을 잘 하는지 파악해서 찾아서 사용하는게 좋다
        //객체를 잘 이용하는것은 그 객체가 이용하는 기능을 잘 사용 거기에 메서드 잘 활용
        //예를 들면 청소기가 있는데 그거를 조립해서 사용하는 것이 아닌 청소기(객체)자체가 먼지를 잘 빨아들이는(기능)이 있기 때문에 사용
        //즉 각각의 객체(물건)들의 기능(메서드)을 잘 파악해서 사용하는 것이 객체 지향의 핵심


    }
}
