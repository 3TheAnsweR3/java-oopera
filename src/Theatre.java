import java.util.ArrayList;

public class Theatre {

    public static void main(String[] args) {


        Actor actor1 = new Actor("Иван", "Петров", Person.Gender.MALE, 180);
        Actor actor2 = new Actor("Анна", "Сидорова", Person.Gender.FEMALE, 170);
        Actor actor3 = new Actor("Олег", "Иванов", Person.Gender.MALE, 185);

        Director director1 = new Director("Сергей", "Федоров", Person.Gender.MALE, 5);
        Director director2 = new Director("Мария", "Орлова", Person.Gender.FEMALE, 3);
        Director director3 = new Director("Жиль", "Майо", Person.Gender.MALE, 6);

        Choreographer choreographer1 = new Choreographer("Мариус", "Петипа", Person.Gender.MALE);

        MusicAuthor musicAuthor1 = new MusicAuthor("Жорж", "Бизе", Person.Gender.MALE);
        MusicAuthor musicAuthor2 = new MusicAuthor("Пётр", "Чайковский", Person.Gender.MALE);
        MusicAuthor musicAuthor3 = new MusicAuthor("Риккардо", "Коччанте", Person.Gender.MALE);

        MusicalShow musicalShow = new MusicalShow(new ArrayList<>(),
                "Нотр-Дам де Пари",
                150,
                director3,
                musicAuthor3,
                "Либретто мюзикла Нотр-Дам де Пари"
        );

        Opera opera = new Opera(
                new ArrayList<>(),
                "Кармен",
                150,
                director2,
                musicAuthor1,
                "Либретто оперы Кармен",
                40
        );

        Ballet ballet = new Ballet(
                new ArrayList<>(),
                "Лебединое озеро",
                140,
                director1,
                musicAuthor2,
                "Либретто Лебединого озера",
                choreographer1
        );

        musicalShow.addActor(actor1);
        musicalShow.addActor(actor2);

        opera.addActor(actor2);
        opera.addActor(actor3);

        ballet.addActor(actor1);
        ballet.addActor(actor3);

        System.out.println("Спектакль: ");
        System.out.println(musicalShow);
        System.out.println("-".repeat(30));

        System.out.println("Опера: ");
        System.out.println(opera);
        System.out.println("-".repeat(30));

        System.out.println("Балет: ");
        System.out.println(ballet);
        System.out.println("-".repeat(30));

        System.out.println("Меняем актера в спектакле: ");

        musicalShow.replaceActor(actor2, actor3);
        System.out.println("Новый список актеров в спектакле: ");
        musicalShow.printActors();
        System.out.println("-".repeat(30));

        System.out.println("Замена несуществующего актера: ");

        Actor newActor = new Actor("Джонни", "Депп", Person.Gender.MALE, 180);
        musicalShow.replaceActor(newActor, actor2);

        System.out.println("Либретто оперы: ");
        System.out.println(opera.getLibrettoText());
        System.out.println("-".repeat(30));

        System.out.println("Либретто балета: ");
        System.out.println(ballet.getLibrettoText());
        System.out.println("-".repeat(30));
    }
}