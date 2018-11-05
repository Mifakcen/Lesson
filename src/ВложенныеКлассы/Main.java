package ВложенныеКлассы;

public class Main {
    public static void main(String[] args) {

        Pupil pupil = new Pupil(1324);
        String ex[] = {"Математика","Биология","Физика","Русский язык"};
        int marks[] = { 2, 5 , 3,2};
        pupil.setExams(ex, marks);
        System.out.println(pupil.toString());

    }
}
