package ru.elchueva.springcourse.dao;

import org.springframework.stereotype.Component;
import ru.elchueva.springcourse.models.Person;

import java.util.ArrayList;
import java.util.List;

//будет общаться со списком находить человека по id из списка обновлть добавлять удалятьи тд
//здесь общаемся с настоящей базой данных
@Component
public class PersonDAO {
    private static int PEOPLE_COUNT;
    private List<Person> people;

    {
        people = new ArrayList<>();

        people.add(new Person(++PEOPLE_COUNT, "Tom"));
        people.add(new Person(++PEOPLE_COUNT, "Bob"));
        people.add(new Person(++PEOPLE_COUNT, "Mike"));
        people.add(new Person(++PEOPLE_COUNT, "Katy"));
    }

    public List<Person> index() {
        return people;
    }

    public Person show(int id) {
        return people.stream().filter(person -> person.getId() == id).findAny().orElse(null);
    }
}
