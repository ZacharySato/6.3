public abstract class Race {
    private String name;
    private String charClass;

    void setName(String name) {
        if (name == null) {
            this.name = "безымянный";
        }
        this.name = name;
    }

    String getName() {
        return name;
    }

    void setCharClass(String cc) {
        if (cc == null) {
            this.charClass = "бродяга";
        }
        this.charClass = cc;
    }

    String getCharClass() {
        return charClass;
    }

    public abstract void run();

    //должна быть какая-то унификация для всех

    public abstract void attackA();

    public abstract void attackB();

    public abstract void protect();
}