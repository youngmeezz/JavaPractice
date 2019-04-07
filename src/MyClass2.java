public class MyClass2 {
    public int plus(int x,int y){
        return x+y;
    }

    public int plus(int x,int y,int z){
        return x + y + z;
    }

    public String plus(String x, String y){
        return x + y;
    }
    //메서드 오버로딩은 타입과 매개변수 수가 중요하다.
    //타입이 다르거나 또는 매개변수가 달라야 한다.
    //메서드 이름은 같아도 된다. 매개변수 이름은 중요하지 않고 타입이 중요 int 랑 String은 다르니까
}
