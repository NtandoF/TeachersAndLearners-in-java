package LearnersAndTeachers;

public enum Subjects {

    Afrikaans("Afrikaans"),
    English("English"),
    Accounting("Accounting"),
    Geography("Geography"),
    History("History"),
    Tourism("Tourism"),
    Mathematics("Mathematics");

    Subjects(String s){
        this.sub=s;
    }
    String sub;
    public  String getSub(){
        return sub;
    }

}
