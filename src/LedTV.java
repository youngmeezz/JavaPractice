public class LedTV implements TV {
//class LedTV는 인터페이스 TV를 구현하겠다.
    //TV인터페이스가 가진 기능들을 LedTV도 모두 갖겠다. 모든 메서드들을 구현해야지만 됩니다.

    @Override
    public void turnOn(){
        System.out.println("켜다");
    }
    @Override
    public void turnOff(){
        System.out.println("끄다");
    } //
    @Override
    public void changeVolume(int volume){
        System.out.println("볼륨을 조정하다");
    }
    @Override
    public void changeChannel(int channel){
        System.out.println("채널을 지정하다");
    } //채널도 몇번으로 바꿀지 알아야 하니까 채널값받기

}
//인터페이스를 정의할때는 객체 선언하기 전에 어떤 기능을 가지고 있으면 좋을까 기능들을 모아놓은곳 정의만 해놓고 구현을 하지 않아서 인터페이스만가지고
//무언가를 사용할 수는 없다. 구현해서 사용하는 방법 알아보기
//TV라는 인터페이스가 있고 LedTV라는 클래스를 만들어서 인터페이스를 구현하기 상속할때는 superclass에서 추가 interfaces는 이클립스에서 바로 그 밑에 있다.