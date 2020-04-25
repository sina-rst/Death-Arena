package ir.ac.kntu.gamelogic;

import ir.ac.kntu.util.RandomHelper;

import java.util.*;

import ir.ac.kntu.logic.*;

public final class RandomObjects {
    public static List<Soldier> getRandomSoldiers(int size) {
        List<Soldier> tempList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            tempList.add(getRandomSoldier());
        }
        return new ArrayList<>(tempList);
    }

    public static Soldier getRandomSoldier() {
        int rand = Math.abs(RandomHelper.nextInt());
        rand %= 7;
        Gun gun;
        switch (rand) {
            case 1:
                gun = new AssaultRifle(Caliber.FIVE);
                break;
            case 2:
                gun = new AssaultRifle(Caliber.SEVEN);
                break;
            case 3:
                gun = new SniperRifle(Caliber.FIVE, false);
                break;
            case 4:
                gun = new SniperRifle(Caliber.FIVE, true);
                break;
            case 5:
                gun = new SniperRifle(Caliber.SEVEN, false);
                break;
            case 6:
                gun = new SniperRifle(Caliber.SEVEN, true);
                break;
            default:
                gun = new AssaultRifle(Caliber.FIVE);
                break;
        }
        rand = Math.abs(RandomHelper.nextInt());
        int health = (rand % 91) + 10;
        return new Soldier(health, 0, gun);
    }
}