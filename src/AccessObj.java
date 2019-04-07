public class AccessObj {
    //이 public은 어느 클래스든 접근 가능
    //protected는 각각 필드로 선언해보면서 설명
    public int p =3; //public은 모든 접근 허용 가장 넓은 의미
    protected int p2 = 4;   //일단 모두는 아니고 package는 같아야 하고 나를 상속을 받은 내 자식 클래스에게는 접근 가능하게 해줌
    //protected 같은 패키지인 경우 접근 허용 다른 패키지라도 상속을 받은 경우 접근 허용
    int k =2;//default접근지정자 아무것도 쓰지 않은 경우 자기 자신과 같은 패키지 내에서 접근 허용
    private int i = 1; //private은 자기자신만 접근할 수 있다.
    //public>protected>default>private

}
