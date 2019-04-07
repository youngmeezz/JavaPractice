public class MethodOverloadExam {

    public static void main(String[] args){
        MyClass2 m = new MyClass2();

        //매개변수. 하면 그 클래스가 가지는 메서드들 사용 가능 overloading된 메서드 나열됨
        System.out.println(m.plus(4,5));
        System.out.println(m.plus(4,5,6));
        System.out.println(m.plus("hello","world"));
    }
}
