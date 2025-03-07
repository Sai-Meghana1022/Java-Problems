class Student {
    String name;
    double[] marks;
    double aggregatePercentage;

    public Student(String name, double[] marks) {
        this.name = name;
        this.marks = marks;
        this.aggregatePercentage = calculateAggregate();
    }

    private double calculateAggregate() {
        double sum = 0;
        for (double mark : marks) {
            sum += mark;
        }
        return sum / marks.length; // Average marks as percentage
    }
}

class College {
    Student[][] classrooms;

    public College(Student[][] classrooms) {
        this.classrooms = classrooms;
    }
}

public class EducationalTrust {
    public static void main(String[] args) {
        // Creating students
        Student[][] college1 = {
            { new Student("Alice", new double[]{85, 90, 88}),
              new Student("Bob", new double[]{78, 80, 75}) },
            { new Student("Charlie", new double[]{92, 95, 96}),
              new Student("David", new double[]{70, 72, 68}) }
        };

        Student[][] college2 = {
            { new Student("Eve", new double[]{88, 85, 87}),
              new Student("Frank", new double[]{82, 80, 79}) },
            { new Student("Grace", new double[]{95, 90, 94}),
              new Student("Hank", new double[]{60, 65, 70}) }
        };

        College[] colleges = { new College(college1), new College(college2) };

        // Finding highest percentage
        Student topStudent = null;
        double highestPercentage = 0;

        for (College college : colleges) {
            for (Student[] classroom : college.classrooms) {
                for (Student student : classroom) {
                    if (student.aggregatePercentage > highestPercentage) {
                        highestPercentage = student.aggregatePercentage;
                        topStudent = student;
                    }
                    System.out.println(student.name + "'s Aggregate Percentage: " + student.aggregatePercentage + "%");
                }
            }
        }

        if (topStudent != null) {
            System.out.println("Top Student: " + topStudent.name + " with " + highestPercentage + "%");
        }
    }
}
