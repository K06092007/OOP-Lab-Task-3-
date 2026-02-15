class Programmer {
    int id;
    String name;
    String language;
    int solved;

    Programmer(int i, String n, String lang, int s) {
        id = i;
        name = n;
        language = lang;
        solved = s;
    }

    void updateSolved(int newSolved) {
        solved = newSolved;
    }

    void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Preferred Language: " + language);
        System.out.println("Problems Solved: " + solved);
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        Programmer p1 = new Programmer(101, "Ali", "Java", 25);
        Programmer p2 = new Programmer(102, "Sara", "Python", 40);

        p1.displayDetails();
        p2.displayDetails();

        p1.updateSolved(30);

        p1.displayDetails();
    }
}
