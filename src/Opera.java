import java.util.ArrayList;

public class Opera extends MusicalShow {

    private int choirSize;

    public Opera(ArrayList<Actor> listOfActors,
                 String title, int duration,
                 Director director,
                 MusicAuthor musicAuthor,
                 String librettoText,
                 int choirSize) {

        super(listOfActors, title, duration, director, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }

    public int getChoirSize() {
        return choirSize;
    }

    @Override
    public String toString() {
        return "Актеры: " + getListOfActors()
                + "\nНазавание: " + getTitle()
                + "\nДлительность: " + getDuration() + "минут"
                + "\nАвтор музыки: " + getMusicAuthor()
                + "\nЛибретто: " + getLibrettoText()
                + "\nЧисленность хора: " + getChoirSize() + " человек.";
    }
}
