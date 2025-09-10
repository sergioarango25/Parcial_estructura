public class Student {
    int age;
    int semester;
    int socioEconomicStratum;
    int coursesCompleted;
    int coursesPending;
    String program;
    int programId;

    public Student(int age, int semester, int socioEconomicStratum,int coursesCompleted, int coursesPending, String program, int programId) {
        this.age = age;
        this.semester = semester;
        this.socioEconomicStratum = socioEconomicStratum;
        this.coursesCompleted = coursesCompleted;
        this.coursesPending = coursesPending;
        this.program = program;
        this.programId = programId;
    }

 
    public void view() {
        System.out.println("Age: " + age +", Semester: " + semester +", Stratum: " + socioEconomicStratum +", Completed: " + coursesCompleted +", Pending: " + coursesPending +", Program: " + program +", Program ID: " + programId);
    }



    public static void insertionSortByAge(Student[] A) {
        for (int i = 1; i < A.length; i++) {
            Student current = A[i];
            int j = i - 1;
            while (j >= 0 && A[j].age > current.age) {
                A[j + 1] = A[j];
                j--;
            }
            A[j + 1] = current;
        }
    }


    public static void selectionSortBySemester(Student[] A) {
        for (int i = 0; i < A.length - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < A.length; j++) {
                if (A[j].semester > A[maxIndex].semester) {
                    maxIndex = j;
                }
            }
            if (maxIndex != i) {
                Student temp = A[i];
                A[i] = A[maxIndex];
                A[maxIndex] = temp;
            }
        }
    }



    public static Student linearSearchByProgramId(Student[] A, int targetId) {
        for (Student s : A) {
            if (s.programId == targetId) return s;
        }
        return null; 
    }


    public static Student binarySearchByAge(Student[] A, int targetAge) {
        int left = 0, right = A.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (A[mid].age == targetAge) return A[mid];
            else if (A[mid].age < targetAge) left = mid + 1;
            else right = mid - 1;
        }
        return null; 
    }
}
