public final class Incredible extends Snake implements Boxer {

    Incredible() {
        super();
        setName("Шпрот");
        setCharClass("невероятный " + raceName + "-" + CLASS);
    }


    public void punchAttack() {
        System.out.println(getCharClass() + " наносит непоправимый урон мировоззрению самим фактом своего существования");
    }


    public void hookAttack() {
        System.out.println(getName() + " пытается исполнить хук, в этот раз точно получится");
    }


    public void dodgeProtection() {
        System.out.println("не так-то просто задеть, когда твой враг -  " + getCharClass());
    }

    public void run() {
        System.out.println("в этот раз " + getCharClass() + " " + getName() + " изящно уползает непобежденным");
    }

    public void attackA() {
        punchAttack();
    }

    public void attackB() {
        hookAttack();
    }

    public void protect() {
        dodgeProtection();
    }
}