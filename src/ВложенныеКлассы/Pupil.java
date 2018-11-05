package ВложенныеКлассы;

import java.util.Arrays;

public class Pupil {
    int id;
//    ExamRes[]examRes;

    static examRes[]ExamRes;
    public Pupil(int id) {
        this.id = id;
    }

    public void setExams(String[] examRes2,int[] marks) {
       ExamRes=new examRes[examRes2.length];
       for (int i=0;i<examRes2.length;++i){
           ExamRes[i]=new examRes();
       }
               for(int i=0;i<examRes2.length;i++){
                   ExamRes[i].name=examRes2[i];
                   ExamRes[i].marks=marks[i];
                   if(marks[i]>2){
                       ExamRes[i].status="Сдал";
                   }else ExamRes[i].status="Не сдал";
               }
    }

    @Override
    public String toString() {
        System.out.println("Студент{" +
                "id=" + id + "} \n");
                for(int i = 0; i <ExamRes.length;i++){
                    System.out.println(ExamRes[i].name + " " + ExamRes[i].status);
                }
                return "";
    }

    class examRes{
        private String name;
        private int marks;
        private String status;
    }
}
