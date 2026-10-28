package N3.EX1;

public record Person(String name, int age) {

    public Person {
        if (age <= 0) {
            throw new IllegalArgumentException("Invalid age");
        }
    }

    public String yearLeftToFifthy(){
        return "He has " + (50 - age) + " years left to 50";
    }
}
