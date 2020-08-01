package OOP;

public class Mensch {

    String name;
    int alter;
    int groesse;

    public Mensch(String name, int alter){
        this.name = name;
        this.alter = alter;
    }

    //Default Konstruktor:
    public Mensch(){

    }

    public void gehen(){
        System.out.println(this.name + " geht");
    }

    public void reden(){
        System.out.println("Hallo, ich bin " + name + " und " + alter + " Jahre alt.");
    }

}
