public class Dog {
    private String name;
    private String race;

    Dog ( String name, String race ) {
        this.name = name;
        this.race = race;
    }

    public void getAttr () {
        System.out.println("Dogs's name is " + this.name);
        System.out.println("Dogs's race is " + this.race);
    }

    public void setAttr ( String name, String race ) {
        this.name = name;
        this.race = race;
    }


}
