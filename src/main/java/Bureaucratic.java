public final class Bureaucratic extends Insectoid implements Toxic {

    Bureaucratic() {
        super();
        setName("Плюмбус");
        setCharClass(CLASS + " " + raceName + "-бюрократ");
    }

    public void spitAttack() {
        System.out.println(getCharClass() + " плюет на землю и укоризненно смотрит, урон самооценке обеспечен");
    }

    public void rebukeAttack() {
        System.out.println("язвительно и очень обидно, " + getName() + " критикует бойцовские качества оппонента");
    }

    public void silentProtection() {
        System.out.println(getName() + " молча и надменно игнорирует");
    }

    public void run() {
        System.out.println("для продолжения битвы " + getCharClass() + " требует пердоставить справку по форме");
    }

    public void attackA() {
        spitAttack();
    }

    public void attackB() {
        rebukeAttack();
    }

    public void protect() {
        silentProtection();
    }
}