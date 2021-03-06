import java.util.Random;

public class Battle {
    private static final Random DICE = new Random();
    private static final int LIMIT = 21;
    private static final String TRY_TO_RUN = " не справляется и пробует сбежать";
    private final int unitAHealthGap;
    private final int unitBHealthGap;
    private final Incredible unitA = new Incredible();
    private final Bureaucratic unitB = new Bureaucratic();
    private int damageDealtA;
    private int damageDealtB;

    public Battle() {
        unitAHealthGap = DICE.nextInt(LIMIT);
        unitBHealthGap = DICE.nextInt(LIMIT);
    }

    public void initiate() {
        System.out.println("намечается потасовка, " + unitA.getCharClass() + " " + unitA.getName() + " зол не на шутку");
        System.out.println(unitB.getCharClass() + " " + unitB.getName() + " так же зол, а то и больше");
        System.out.println("итак:");
        unitA.attackA();
        damageDealtA = DICE.nextInt(LIMIT / 2);
        unitB.protect();
        damageDealtA -= DICE.nextInt(LIMIT / 2);
        unitB.attackA();
        damageDealtB = DICE.nextInt(LIMIT / 2);
        unitA.protect();
        damageDealtB -= DICE.nextInt(LIMIT / 2);
        unitA.attackB();
        damageDealtA += DICE.nextInt(LIMIT / 2);
        unitB.attackB();
        damageDealtB += DICE.nextInt(LIMIT / 2);
        criticalDamageCheck();
    }

    private void criticalDamageCheck() {
        System.out.println("что в итоге?");
        if (damageDealtA < unitBHealthGap && damageDealtB < unitAHealthGap) {
            draw();
        }
        if (damageDealtA >= unitBHealthGap && damageDealtB >= unitAHealthGap) {
            System.out.println("вот это да, что ж, оба дуэлянта пали, расходимся");
            System.exit(0);
        }
        if (damageDealtA >= unitBHealthGap) {
            System.out.println(unitB.getName() + TRY_TO_RUN);
            if (DICE.nextInt(LIMIT) < LIMIT / 2) {
                unitB.die();
            } else {
                unitB.run();
            }
            System.exit(0);
        }
        if (damageDealtB >= unitAHealthGap) {
            System.out.println(unitA.getName() + TRY_TO_RUN);
            if (DICE.nextInt(LIMIT) < LIMIT / 2) {
                unitA.die();
            } else {
                unitA.run();
            }
            System.exit(0);
        }
    }

    private void draw() {
        if (DICE.nextInt(LIMIT) < (LIMIT / 2 + 1)) {
            System.out.println("какая удача, скидки в рюмочной неподалеку прерывают поединок");
        } else {
            System.out.println("плот твист: это один персонаж, а не два, и он продаёт мыло");
        }
        System.exit(0);
    }
}