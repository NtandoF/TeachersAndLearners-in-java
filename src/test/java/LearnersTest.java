import LearnersAndTeachers.Learners;
import LearnersAndTeachers.Subjects;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LearnersTest {

    @Test
    public void shouldgetTheFirstNameOfTheLeaner() {

        Learners register = new Learners("ntando", "lunga", "asdd@125");
        assertEquals(register.getFirstname(), "ntando");
    }
    @Test
    public void shouldgetThelastNameOfTheLeaner() {

        Learners register = new Learners("ntando", "lunga", "asdd@125");
        assertEquals(register.getLastname(), "lunga");
    }
    @Test
    public void shouldgetTheEmailOfTheLeaner() {

        Learners register = new Learners("ntando", "lunga", "asdd@125");
        assertEquals(register.getEmail(), "asdd@125");
    }

    @Test
    public void shouldgetTheSubjectsOfTheLeaner() {

        Learners ntando = new Learners("ntando", "lunga", "asdd@125");

        ntando.addSubject(Subjects.Accounting);
        ntando.addSubject(Subjects.Mathematics);
        ntando.addSubject(Subjects.English);

        assertEquals(ntando.getSubject(), "Accounting\n" + "Mathematics\n" + "English\n");

    }

}