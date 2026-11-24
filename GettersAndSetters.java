public class GettersAndSetters {
    public static void main(String[] args) {
        pen p1 = new pen();
        p1.SetColor("blue");
        System.out.println(p1.Getcolor());
    }
}

class pen{
    private String color;

    String Getcolor(){
        return this.color;
    }
    void SetColor(String color){
        this.color=color;
    }
}