package LearnersAndTeachers;

public class Person {

    public String firstname;
    public String lastname;
    private String emailAdress;

    public Person(String first, String last, String email) {
        firstname = first;
        lastname = last;
        emailAdress = email;
    }

    public String getEmail() {
        return emailAdress;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }


}
