package day24_loops;

public class TouTubeCatVideo {
    public static void main(String[] args) {
        System.out.println("starting: Worlds smallest cat \uD83D\uDC08- BBC");
        int seconds = 0;
        while (seconds >0 && seconds <117) {
            System.out.println("Watching youtube video - second:" + seconds);
            seconds++;
        }
        System.out.println("Cat video is over. Lets start a new video.");
    }
    }

