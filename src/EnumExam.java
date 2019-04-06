//자바는 열거 타입으로 이용 jdk5에서 추가된
//그전에는 public static final String MALE = "MALE"을 이용해서 사용했다.
//final은 상수를 선언할 떄 사용 전체 변수 명을 대문자로 써주는게 관례
//실제 사용이 될떄 스트링 타입의 젠더라는 변수를 선언했는데 male,female값만 가지고 싶다.
public class EnumExam {
    public static final String MALE = "MALE";
    public static final String FEMALE = "FEMALE";
    public static void main(String[] args){
        String gender1;
        //상수로 선언했던 값을 이용 gender1에다가 선언
        //static한 필드는 객체를 선언하지 않고도 사용할 수 있다.
        //그래서 클래스명하고 바로 접근 가능
        gender1 = EnumExam.MALE; //상수로 선언해 놓은 MALE
        gender1 = EnumExam.FEMALE;

        gender1 = "boy"; //실제 gender라는 타입자체가  string값이기 때문에 string 아무거나 들어가도 컴파일 시점에서
        //gender1스트링 boy도 스트링 컴파일 에러는 발생 안함
        //원했던 값은 남자 아님 여자만 발생해야하는데
        //다른 값이 들어오면 문제가 발생 -> 이런 문제 발생 안하게 하기 위해
        //클래스 아래 쪽에 클래스를 사용
        Gender gender2; //이렇게 선언한 상태에서
        gender2 = Gender.MALE;
        gender2 = Gender.FEMALE;
        //이러한 값만 들어갈 수 있고 boy가 들어가면 컴파일시에러
        //gender2 = "boy"; //male,female만 가능 특정 값만 가져다가 사용해야한다면 열거형을 사용하는게 좋다.

    }
}
enum Gender{
    MALE,FEMALE;//넣고 싶은 값을 열거
}
