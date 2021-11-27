package TCS_XPlore_iON_Lite;

import java.util.Scanner;

public class Q11_StudentScholars {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int count = 4;
            Student[] students = new Student[count];
            for (int i = 0; i < count; i++) {
                int roll = sc.nextInt();
                sc.nextLine();
                String name = sc.next();
                String branch = sc.next();
                double score = sc.nextDouble();
                boolean dayScholar = sc.nextBoolean();

                students[i] = new Student(roll, name, branch, score, dayScholar);
            }


            int countOfDayScholar = findCountOfDayScholarStudents(students);
            Student studentWithSecondHighestScore = findStudentWithSecondHighestScore(students);

            System.out.println(countOfDayScholar);

            if (studentWithSecondHighestScore != null)
                System.out.println(studentWithSecondHighestScore.getRollNo() + "#" + studentWithSecondHighestScore.getName() + "#" + studentWithSecondHighestScore.getScore());
            else
                System.out.println("There are no student from non day scholar");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    static int findCountOfDayScholarStudents(Student[] students) {
        int count = 0;
        for (Student student : students) {
            if (student.getScore() > 80 && student.isDayScholar()) count++;
        }
        return count;
    }

    static Student findStudentWithSecondHighestScore(Student[] students) {
        int kMax = 2;
        kMax -= 1;
        for (Student s1 : students) {
            int count = 0;
            for (Student s2 : students) {
                if (s2.getScore() > s1.getScore() && !s1.isDayScholar() && !s2.isDayScholar())
                    count++;
            }
            if (count == kMax)
                return s1;
        }
        return null;
    }

//    static Student findStudentWithSecondHighestScore(Student[] students) {
//        List<Student> list = new LinkedList<>();
//        for (Student x : students) {
//            if (!x.isDayScholar())
//                list.add(x);
//        }
//        Collections.sort(list, (a, b) -> {
//            if (a.getScore() < b.getScore()) return -1;
//            else if (a.getScore() > b.getScore()) return 1;
//            return 0;
//        });
//        try {
//            return list.get(list.size() - 2);
//        } catch (IndexOutOfBoundsException e) {
//            return null;
//        }
//
//    }
}


class Student {
    private int rollNo;
    private String name;
    private String branch;
    private double score;
    private boolean dayScholar;

    public Student(int rollNo, String name, String branch, double score, boolean dayScholar) {
        this.rollNo = rollNo;
        this.name = name;
        this.branch = branch;
        this.score = score;
        this.dayScholar = dayScholar;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public boolean isDayScholar() {
        return dayScholar;
    }

    public void setDayScholar(boolean dayScholar) {
        this.dayScholar = dayScholar;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", branch='" + branch + '\'' +
                ", score=" + score +
                ", dayScholar=" + dayScholar +
                '}';
    }
}