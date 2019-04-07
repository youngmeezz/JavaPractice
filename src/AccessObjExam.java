public class AccessObjExam extends AccessObj{
    public static void main(String[] args){
        AccessObjExam obj = new AccessObjExam();
        System.out.println(obj.p);//같은 패키지내 패키지 달라도 성공
        System.out.println(obj.p2);//같은 패키지내 패키지 다르면 오류 패키지는 다르지만 AccessObj를 상속받고 있는 AccessObjExam이 자식인데 자식 클래스이기 때문에 가능
        //자기자신을 자식 클래스로 놓고 여기서 객체를 생성 AccessObjExam obj = new AccessObjExam();
        System.out.println(obj.k);//같은 패키지내 패키지 다르면 오류
       // System.out.println(obj.i); //지금 접근 제한자가 같은 패키지여도 안됨 자기 자신만 가능

        //필드뿐아니라 클래스와 메서드 앞에도 사용가능 어디까지 접근해서 사용해서 접근시킬건지 사용
        //나이나 몸무게는 사용자만 알고 싶지 남들한테 public 하고 싶지 않아서 private으로 거의 선언
    }
}
