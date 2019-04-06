public class SongExam {
    //static 메소드안에서 static클래스를 참조
    public static void main(String[] args) {

        Song song = new Song();
        song.songTitle = new String("곡명");
        song.singer = new String("가수");
        song.albumName = new String("앨범");
        song.trackNumber = 5;
//        Song.trackNumber = 2;
    };

    //여기에다가 static을 꼭 써줘야 하는 이유 알아오기
    //같은 클래스내에서 참조 내부 클래스 static 클래스
    //원래는 static을 쓰지 않고 클래스는 따로 파일 만들어서 빼놓음
    static class Song1 {
        String songTitle;
        String singer;
        String albumName;
        static int trackNumber;

    }

}
/*
class Song1 {
    String songTitle;
    String singer;
    String albumName;
    static int trackNumber;

}
*/