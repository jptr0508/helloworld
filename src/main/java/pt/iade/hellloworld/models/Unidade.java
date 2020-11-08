package pt.iade.hellloworld.models;

public class Unidade {
    private String name;
    private double grade;
    private int semester;
    private double ects;

    public Unidade(String name, double grade, int semester, double ects) {
      this.name = name;
      this.grade = grade;
      this.semester = semester;
      this.ects = ects;
   }

   public String getName() {
      return name;
   }

   public double getGrade() {
      return grade;
   }

   public int getSemester() {
      return semester;
   }

   public double getEcts() {
      return ects;
   }

   public boolean isAproved() {
      return grade >= 9.5;
   }


   
}
