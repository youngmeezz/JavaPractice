public class ReferenceTypeExam {
    public static void main(String[] args) {
        ReferenceTypeExam exam = new ReferenceTypeExam();

        //기본형 변수value1을 addOne에 전달합니다.
        int value = 10;
        exam.addOne(value);
        System.out.println("기본형 변수의 값을 다른 메소드에서 변경한 결과: " + value);

        Integer value2 = new Integer(10);
        exam.addOne(value2);
        System.out.println("참조형 변수의 값을 다른 메소드에서 변경한 결과2:"+value2);
        //10이 출력되는 원인 : Integer는 생성할 때 한 번 값이 정해지면 그 값을 변경할 수 없어서 그렇습니다.
        //여기 있는 Integer의 정의를 한 번 보시면 constructor에서 값을 설정하는 방법만 있고, 값을 변경할 수 있는 method가 없습니다.


        //참조형 변수arr을 addOne에 전달합니다.
        int[] arr = {10};
        exam.addOne(arr);
        System.out.println("참조형 변수의 값을 다른 메소드에서 변경한 결과: " + arr[0]);
    }

    public void addOne(int value) {
        //리턴을 할 필요가 없었구낭..return value+1; 왜냐면 리턴 타입도 없는데 당연히 리턴할 필요가 없지 -> 그래서 value++하지 않고 그냥 10으로 출력해준다.
        value++;
    }

    public void addOne(int arr[]) {
        //여기도 void가 리턴값인데 왜 11로 리턴되는지
        /*
        main메소드 입장에서 생각하면요. add에 매개변수로 전달하는 숫자가 10이라고 했을때,

int value로 전달할때는 그냥 10이라고 새로운 종이에 적어서 전달하는겁니다. 그 종이를 돌려주지 않으면 가져간 다음에 뭘하건 나랑은 상관이 없습니다.
int[]arr로 전달할때는 저기 1958번 강의실에 화이트보드에 값을 써 놨어라고 값이 적힌 주소를 전달합니다. 거기에 가 보면 10이라는 값이 써져 있는거져. add메소드는 값을 변경할때 그 강의실에 가서 그걸 지우고 다시 11을 적어버립니다.
나중에 main이 그 값을 사용할때도 강의실에 가서 값을 보고 확인해야 사용합니다. 그러면 11이 적혀 있겠져
         */
        for (int i = 0; i < arr.length; i++) {
            arr[i]++;
        }
    }
}
/*
    기본형 변수의 값을 다른 메소드에서 변경한 결과: 10
    참조형 변수의 값을 다른 메소드에서 변경한 결과: 11
*/
/*
기본형 타입은 다른 메소드에 매개변수로 전달될때,10이라는 값이 그대로 전달됩니다.
따라서 addOne에서 1을 더하더라도 value라는 변수에는 아무 영향이 없습니다.
 */
/*
하지만 참조형 타입은 다른 메소드에 매개변수로 전달될때, 변수의 주소가 전달됩니다.
예를들어 '몇번째 박스에 값이 있다'는 식으로 값이 들어있는 주소가 전달되는겁니다.
그럼 그걸 전달받은 메소드addOne에서는 그 박스에 가서 들어있는 값에 1 더합니다.
addOne을 실행하고 나서 arr[0]을 확인해 볼 때도 같은 박스에 가서 값을 확인하기 때문에 값이 11로 변해있는겁니다.
 */