public abstract class Snake extends Race {

    protected final String raceName = "змей";

    public final void die() {
        System.out.println(getName() + " с дерзким шипением признает окончательное поражение");
    }

}