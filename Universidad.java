import java.util.Arrays;

public class Universidad {
    public static void main(String[] args) {

        Student[] students = {
            new Student(28, 3, 2, 15, 5, "Medicina", 101),
            new Student(22, 5, 3, 25, 3, "Sistemas", 102),
            new Student(19, 1, 1, 5, 10, "Arte", 103),
            new Student(21, 4, 4, 20, 2, "Diseño", 104),
            new Student(23, 7, 5, 30, 1, "Ingeniería Industrial", 105),
            new Student(18, 1, 2, 2, 12, "Farmacia", 106),
            new Student(24, 9, 3, 40, 0, "Filosofía", 107),
            new Student(25, 8, 6, 35, 2, "Sistemas", 108),
            new Student(20, 2, 2, 10, 8, "Arte", 109),
            new Student(26, 10, 4, 45, 0, "Filosofía", 110)
        };


        System.out.println("Listado original de estudiantes:");
        Arrays.stream(students).forEach(Student::view);

        Student.insertionSortByAge(students);
        System.out.println("\nDespués de ordenar por edad (Insertion Sort):");
        for (Student s : students) s.view();


        Student.selectionSortBySemester(students);
        System.out.println("\nDespués de ordenar por semestre (Selection Sort, mayor a menor):");
        for (Student s : students) s.view();

        int targetId = 109;
        Student foundById = Student.linearSearchByProgramId(students, targetId);
        System.out.println("\nBúsqueda por Program ID " + targetId + ":");


        int targetAge = 28;
        Student foundByAge = Student.binarySearchByAge(students, targetAge);
        System.out.println("\nBúsqueda por Age " + targetAge + ":");
    }
}
