package com.company;

public class Warrior extends Hero{
    @Override
    public String applySuperAbility(String superAbilityType) {
        System.out.println("Warrior применил суперспособность CRITICAL DAMAGE");
        return null;
    }
}
