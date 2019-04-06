public class StringExam {
    public static void main(String[] args) {
        //String클래스는 자바에서 가장 많이 사용하는 클래스
        //String은 new 연산자 이용하지 않고도

        String str1 = "hello"; //메모리 영역중에 상수에 저장됨 상수는 변하지 않는 값
        String str2 = "hello"; //hello라는 instance가 상수영역에 하나 만들어지고 str2도 hello에 만들어짐
        //새로 만들지 않고 str1의 hello를 가리킨다. str1,str2는 같은 인스턴스를 참조하고 있다.

        //일단 str1에서 hello가 생성됬을때 메모리중에 상수들이 저장되는 곳에 저장됨 변하지 않는 값에 저장됨
        //str1과 str2 hello로 같은데 두개 만들어질 필요가 없다. 그래서 hello라는 인스턴스가 상수영역에 하나 만들어지고
        //s1이 가리켜요 일단 s2는 상수영역에 똑같은 hello가 있는지 확인하고 새로 만들지 않고 !!! 이 hello를 가리켜요 -> str1,str2는 같은 인스턴스를 참조하고 있다.
        //그 hello를 str1이 가리킨다. str2도 같은 인스턴스를 가리키고 있다 같은 인스턴스를 참조하고 있다.

        String str3 = new String("hello");
        String str4 = new String("hello");
        //new 하고 나오는 순간 무조건 상수영역에 있는 것을 참조하지 않고!!!! 새로 인스턴스를 무조건 힙 영역에 만들게 된다.
        //str3과 str4는 각각 만든다. new가 나왔을때 hello라는 문자열을 힙 영역에 하나 만들고 str3이 가리키고, str4도 하나 만들고 str4가 가리킨다.


        //기본 변수 타입일때는 ==이 두 값이 같아요?
        // 참조형일때는 실제 값을 비교하는게 아니라 주소가 같은지
        // 실제 가리키고있는 메모리 영역의 주소가 같은지 같은 영역을 가리키는지
        //str1과 str2는 같은 영역을 가리킨다고 했으니까 같은 레퍼런스다.
        //if문에서는 블럭 주지 않으면 한문장만 실행
        if (str1 == str2) {
            System.out.println("str1과 str2는 같은 레퍼런스이다.");
        }

        //str1과 str3은 같은 레퍼런스인가요? str1이 가리키는 문자열
        //str3이 가리키는 문자열 각각 다르니까 다른부분
        if (str1 == str3){
            System.out.println("str1과 str3는 같은 레퍼런스이다.");
        }

        //str3과 str4는 같지 않다 이유는 상수영역에 저장한 것만 같은 것을 가리키고 있고 나머지는 다르다.
        if (str3 == str4){
            System.out.println("str3과 str4는 같은 레퍼런스이다.");
        }

        //String클래스는 한번 생성된 클래스는 변하지 않아요 다른 클래스들은 변합니다.
        //그래서 String의 큰 특징 중 하나이다.
        //예를들어 str1은 hello가 출력되고
        System.out.println(str1);
        //str1.해보면 string 클래스가 가지고있는 메서드를 볼 수 있는데 substring수행시 잘라주세요 index가3부터 잘라서 보여주세요
        System.out.println(str1.substring(3));
        //그런데 str1을 다시 출력해보면 str1자체는 전혀 바뀌지 않고 그대로 출력됨 -> 이렇듯 스트링은 한번 만들어진 스트링의 클래스의 스트링이 갖고 있는 내부의 값이 변하지 않는다.
        //string이 가지고 있는 메서드들은 모든 메서드들이 스트링 값을 반환 새로운 스트링을 만들어서 반환
        System.out.println(str1);
        //String은 한번 만들어진 스트링 내부의 값이 변하지 않는다.
        //String이 가진 메서드들은 모두 String값을 반환 새로운 String을 만들어서 반환한다.
        //연산도 독특하게 수행되는 독특한 클래스를 알아봤다.

        if( str3.equals(str4) ){
            System.out.println("str3과 str4는 같은 값을 가지고 있습니다.");
        }
        else{
            System.out.println("str3과 str4는 다른 값을 가지고 있습니다.");
        }

        if( str3 == str4){
            System.out.println("str3과 str4는 같은 레퍼런스를 참조하고 있습니다.");
        }
        else{
            System.out.println("str3과 str4는 다른 레퍼런스를 참조하고 있습니다.");
        }
    }
}


