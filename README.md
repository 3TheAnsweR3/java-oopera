# Oopera

Oopera is an introductory educational Java project that models theatre productions. It was created to practise classes, inheritance, composition, collections, and method overriding.

> Educational project. It represents coursework rather than commercial development experience.

## Domain model

- `Person` is the base model for actors, directors, choreographers, and music authors.
- `Show` stores a title, duration, director, and cast.
- `MusicalShow` extends a show with a music author and libretto.
- `Opera` adds choir size.
- `Ballet` adds a choreographer.

The demonstration scenario creates several productions, adds and replaces actors, prints production details, and reads the libretto information.

## Technology and concepts

- Java 21
- Object-oriented programming
- Inheritance and method overriding
- Composition
- Collections

## Run locally

Requirements: JDK 21. From macOS or Linux:

```bash
mkdir -p out
javac -d out src/*.java
java -cp out Theatre
```

This is an early learning project and intentionally has no framework, database, or automated test suite.
