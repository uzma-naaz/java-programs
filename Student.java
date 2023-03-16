class StudentTest {
    int id = 100;
    String name;

    void display(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void print(int id) {
        this.id = this.id + id;
        System.out.println(this.id);
    }

    void cal(int id) {
        if (this.id < id) {
            System.out.print("invalid");
        } else {
            this.id = this.id - id;
            System.out.print(this.id);
        }
    }
}

class Student extends StudentTest {

    public static void main(String[] args) {

        StudentTest s1 = new StudentTest();
        StudentTest s2 = new StudentTest();
        s1.display(101, "uzma");
        s2.display(102, "naaz");

        s1.print(50);
        s2.print(20);

        s1.cal(100);

    }
}
