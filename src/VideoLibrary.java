
public class VideoLibrary {

    public VideoLibrary() {
        super();
    }

    public static void main(String[] args) {

        Guest guest = new Guest("John Doe", "Somewhere in Minnesota");
        Video video = new Video("Titanic", "James Cameron", 1997);
        guest.borrow(video);
        System.out.println(guest);

        guest.returnVideo();
        System.out.println(video);
        System.out.println(guest);
        }
    }
