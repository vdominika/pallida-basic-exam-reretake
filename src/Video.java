import java.util.ArrayList;

private static class Video {
    private String title;
    private String director;
    private int releaseYear;
    private int nob; // Number of borrows

    public Video (String title, String director, int releaseYear){
        this.title = title;
        this.director = director;
        this.releaseYear = releaseYear;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle(){
        return title;
    }

    public void setDirector(String director){
        this.director = director;
    }

    public String getDirector (){
        return director;
    }

    public void setReleaseDate(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getReleaseDate() {
        return releaseYear;
    }

    public int getBorrowedNumber(){
        return nob;
    }

    public void increaseBorrow(){
        this.nob++;
    }

    public String tostring(){
        return title + " by " + director + " from " + releaseYear + " - borrowed " + nob + (nob > 1 ? " times." : " time.");
    }
}

