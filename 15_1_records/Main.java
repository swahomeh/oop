record Person(String name, int age) {}

public class Main {
    public static void main(String[] args) {
        Person[] persons = new Person[7];

        persons[0] = new Person("Alice", 30);
        persons[1] = new Person("Stanley", 30);
        persons[2] = new Person("Stella", 56);
        persons[3] = new Person("Jacob", 49);
        persons[4] = new Person("Julius", 20);
        persons[5] = new Person("Edna", 23);
        persons[6] = new Person("Marley", 29);
        
        for (int i = 0; i < 7; i++) {
            Person person = persons[i];

            System.out.println(person.name()); 
            System.out.println(person.age()); 
            System.out.println(person + "\n");
        }
    }
}