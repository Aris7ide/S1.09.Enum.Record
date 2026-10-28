package N3.EX1;

import java.util.List;

public class Utils {

    public List<Person> filterByMajor(List<Person> people){
        return people.stream().filter(person -> (person.age() > 18)).toList();
    }
}
