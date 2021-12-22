package com.company;

public class Main {

    public static void main(String[] args) {
        HavingSuperAbility[] dads = {new Medic() , new Warrior() , new Magic()};
        for (int i = 0; i < dads.length; i++) {
            dads[i].applySuperAbility(" ");
        }
    }
}
