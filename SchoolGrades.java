public class SchoolGrades {
    public static void main(String[] args) {
        int classes = 5;
        int subjects = 4;
        int studentsPerSubject = 3;
        
        double[][][] grades = {
            { {85, 90, 78}, {80, 75, 88}, {92, 95, 85}, {76, 85, 80} },
            { {88, 82, 90}, {79, 80, 81}, {85, 86, 83}, {91, 94, 95} },
            { {80, 85, 78}, {70, 75, 72}, {88, 92, 90}, {77, 81, 85} },
            { {90, 89, 87}, {95, 96, 92}, {85, 80, 83}, {88, 90, 92} },
            { {78, 80, 82}, {72, 75, 78}, {90, 88, 85}, {85, 83, 80} }
        };

        for (int classIndex = 0; classIndex < classes; classIndex++) {
            System.out.println("Class " + (classIndex + 1) + ":");

            for (int subjectIndex = 0; subjectIndex < subjects; subjectIndex++) {
                System.out.println("  Subject " + (subjectIndex + 1) + ":");

                for (int studentIndex = 0; studentIndex < studentsPerSubject; studentIndex++) {
                    double sum = 0;
                    sum += grades[classIndex][subjectIndex][studentIndex];

                    double average = sum;
                    System.out.println("    Student " + (studentIndex + 1) + " Average Grade: " + average);
                }
            }
        }
    }
}
