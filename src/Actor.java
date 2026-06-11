import java.util.Objects;

public class Actor extends Person {

    private int height;

    public Actor(String name, String surname, Gender gender, int height) {
        super(name, surname, gender);
        this.height = height;
    }

    @Override
    public String toString() {
        return "Имя: " + getName() + " Фамилия: " + getSurname() + " Пол: " + getGender() + " Рост: " + height;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!super.equals(o)) return false;
        Actor actor = (Actor) o;
        return height == actor.height;

    }
}