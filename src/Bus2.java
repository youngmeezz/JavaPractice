public class Bus2 extends Car7{

    public void run(){

        //부모가 물려준 run메서드도 활용
        super.run(); //부모의 run 메서드도 활용하고 싶어요!
        //super키워드를 활용하여
        System.out.println("Bus2 의 run메서드 입니다.");
    }

}
