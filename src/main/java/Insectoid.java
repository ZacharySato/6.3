public abstract class Insectoid extends Race {

    protected final String raceName = "инсектоид";

    public final void die() {
        System.out.println(getName() + ", стрекоча, отказывается учавствовать в этом балагане и сливается");
    }

}