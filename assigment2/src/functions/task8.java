package functions;

class Person {
    private final String firstName;
    private final String lastName;

    public Person(
            String firstName,
            String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName(){
        return firstName + " " + lastName;
    }
}


public class task8 {
    public static void main(String[] args) {
        person person = new person("Ivan", "Ivanov");
        System.out.println("Dossier.");
        System.out.println("Name: " + person.getFirstName());
        System.out.println("LastName: " + person.getLastName());
        System.out.println(("Full name: " + person.getFullName()));
    }
}
