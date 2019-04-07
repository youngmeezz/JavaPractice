public class TruckExam {
    public static void main(String[] args){

        Truck t = new Truck();
        //객체가 생성이 될때 반드시 생성자를 실행하고 생성이 되더라
        //Truck의 기본생성자만 실행되는게 아니라 Car6의 기본생성자가 먼저 실행됨
        //내가 태어나기전에 부모가 먼저 태어남
        //new라는 키워드를 사용해서 Truck이 인스턴스화 되서 메모리 올라갈때 Car객체 다음에 Truck객체 올라감
        //생성자가 하는 일은 객체를 초기화 하는 일 생성자가 호출될떄 자동으로 부모의 생성자가 호출되면서 부모 객체를 초기화 하게 됨
        //부모객체를 초기화 할때는 super()키워드를 사용하게됨 부모 객체를 나타내는 키워드
        //Car6라는 객체를 생성할때 Car6의 기본생성자가 실행되고
       // Car6 c = new Car6();
    }

}
