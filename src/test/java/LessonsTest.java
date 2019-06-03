import LearnersAndTeachers.Learners;
import LearnersAndTeachers.Lessons;
import LearnersAndTeachers.Person;
import LearnersAndTeachers.Subjects;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LessonsTest {
    @Test
    public void shouldReturnTheCorrectNumOfLeanersRegistered() {

        Lessons register = new Lessons();
        Learners ntando = new Learners("ntando", "lunga", "asdd@125");
        Learners Aya = new Learners("aya", "lunga", "asdd@125");
        Learners Lunga = new Learners("Lunga", "lunga", "asdd@125");

        register.registerStudent(ntando);
        register.registerStudent(Lunga);
        register.registerStudent(Aya);
        register.getList();
    }
    }

