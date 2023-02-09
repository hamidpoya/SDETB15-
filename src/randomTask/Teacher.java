package randomTask;

public class Teacher {

    String name;
    int teacherId;
    String subject;


    Teacher(String name, int teacherId){
        this.name=name;
        this.teacherId=teacherId;

    }

    Teacher(String name, int teacherId, String subject){
      this(name,teacherId);//instead of typing line 9-10
        this.subject=subject;

    }




}
