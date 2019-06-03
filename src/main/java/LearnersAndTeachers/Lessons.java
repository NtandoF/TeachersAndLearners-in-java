package LearnersAndTeachers;

import java.util.ArrayList;

public class Lessons {

    private ArrayList<String> LearnersList = new ArrayList<String>();

    public void registerStudent(Person learner) {
        if (LearnersList.contains(learner)) {
            System.out.println("On the list");
        } else {
            LearnersList.add(learner.firstname);

        }
    }

    public String getList(){
        System.out.println(LearnersList);
        return LearnersList.toString();
    }

}


