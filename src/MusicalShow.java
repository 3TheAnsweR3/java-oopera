import java.util.ArrayList;

public class MusicalShow extends Show {

    private MusicAuthor musicAuthor;
    private String librettoText;

    public MusicalShow(ArrayList<Actor> listOfActors, String title,
                       int duration, Director director, MusicAuthor musicAuthor, String librettoText) {
        super(listOfActors, title, duration, director);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }
    public MusicAuthor getMusicAuthor() {
        return musicAuthor;
    }
    public String getLibrettoText() {
        return librettoText;
    }

    @Override
    public String toString() {
        return "Актеры: " + getListOfActors()
                + "\nНазавание: " + getTitle()
                + "\nДлительность: " + getDuration() + " минут"
                + "\nРежисер: " + getDirector()
                + "\nАвтор музыки: " + getMusicAuthor()
                + "\nЛибретто: " + getLibrettoText();
    }
}
