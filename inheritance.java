public class inheritance {
    public static void main(String[] args) {
        // Testing with no-argument constructor
        Child c1 = new Child("May", "White", 2, "Bashful");
        c1.sleeps(); // Inherited from GrandParent
        c1.plays();  // Defined in Parent
        System.out.println(c1);
        Parent p1 = new Child("April","White",24,"Angy");
        p1.plays();
    }
}

// Level 1: GrandParent 
class GrandParent {
    String name;
    String color;

    public GrandParent() {
    }

    public GrandParent(String name, String clr) {
        this.name = name;
        this.color = clr;
    }

    void work() {
        System.out.println("works");
    }

    void sleeps() {
        System.out.println("sleeps");
    }

    @Override
    public String toString() {
        return "name: " + name + ", color: " + color;
    }
}

// Level 2: Parent 
class Parent extends GrandParent {
    int age;

    public Parent() {
    }

    public Parent(String name, String clr, int age) {
        super(name, clr); // Sends 'name' and 'clr' up to GrandParent
        this.age = age;
    }

    void plays() {
        System.out.println("plays");
    }

    @Override
    public String toString() {
        // Reuses GrandParent's toString() and appends 'age'
        return super.toString() + ", age: " + age;
    }
}

// Level 3: Child (the grandchild)
class Child extends Parent {
    String nature;

    public Child() {
    }

    public Child(String name, String clr, int age, String nature) {
        super(name, clr, age); // Sends 'name', 'clr', and 'age' up to Parent
        this.nature = nature;
    }

    void cries() {
        System.out.println("cries");
    }

    @Override
    public String toString() {
        // Reuses Parent's toString() and appends 'toy'
        return super.toString() + ", nature: " + nature;
    }
}
