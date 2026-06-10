import java.util.ArrayList;

public class Show {

    private ArrayList<Actor> listOfActors = new ArrayList<>();

    private String title;
    private int duration;
    private Director director;

    public Show(ArrayList<Actor> listOfActors, String title, int duration, Director director) {
        this.listOfActors = new ArrayList<>(listOfActors);
        this.title = title;
        this.duration = duration;
        this.director = director;
    }

    public ArrayList<Actor> getListOfActors() {
        return listOfActors;
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public Director getDirector() {
        return director;
    }

    public void addActor(Actor actor) {
        if (listOfActors.contains(actor)) {
            System.out.println("Такой актер уже есть!");
            System.out.println("-".repeat(30));
            return;
        } else {
            listOfActors.add(actor);
            System.out.println("Актер " + actor + " добавлен!");
            System.out.println("-".repeat(30));
        }
    }

    public void removeActor(Actor actor) {
        listOfActors.remove(actor);
        System.out.println("Актер " + actor + " удален!");
        System.out.println("-".repeat(30));

    }

    public void printActors() {
        for (Actor actor : listOfActors) {
            System.out.println(actor);
        }
    }

    public void replaceActor(Actor actor, Actor newActor) {
        for (int i = 0; i < listOfActors.size(); i++) {
            Actor currentActor = listOfActors.get(i);
            if (currentActor.equals(actor)) {
                listOfActors.set(i, newActor);
                System.out.println("Актер: " + currentActor + " заменен актером: " + newActor);
                System.out.println("-".repeat(30));
                return;
            }
        }
        System.out.println("Такой актер не найден!");
        System.out.println("-".repeat(30));
    }
}
