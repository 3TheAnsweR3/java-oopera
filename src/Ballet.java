import java.util.ArrayList;

public class Ballet extends MusicalShow {

    private Choreographer choreographer;

    public Ballet(ArrayList<Actor> listOfActors,
                  String title, int duration,
                  Director director,
                  MusicAuthor musicAuthor,
                  String librettoText,
                  Choreographer choreographer) {

        super(listOfActors, title, duration, director, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }

    public Choreographer getChoreographer() {
        return choreographer;
    }

    @Override
    public String toString() {
        return "Актеры: " + getListOfActors()
                + "\nНазавание: " + getTitle()
                + "\nДлительность: " + getDuration()
                + "\nАвтор музыки: " + getMusicAuthor()
                + "\nЛибретто: " + getLibrettoText()
                + "\nХороеограф: " + getChoreographer();
    }
}
