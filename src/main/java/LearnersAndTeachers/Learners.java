package LearnersAndTeachers;

import java.util.ArrayList;

public class Learners extends Person {

    private ArrayList<Subjects> SubjectList = new ArrayList<Subjects>();

    public Learners(String first, String last, String email) {
        super(first, last, email);
    }


    public void addSubject(Subjects subjects) {
                if (SubjectList.contains(subjects)) {
                   System.out.println("On the list");
                } else {
                    SubjectList.add(subjects);

                }
            }

            public String getSubject(){
             String subs = "";

                for (int i = 0; i < SubjectList.size() ; i++) {
                    System.out.println();
                    subs += SubjectList.get(i) + "\n";

                }
                System.out.println(subs);
                return subs;
    }

            public String acceptLearner(String sub) {
            if (sub.equals(Subjects.valueOf(sub))) {
                return "Accepted";
            } else {
                return "Not Accepted";
            }
        }
}





