package com.company;

public class Boss extends GameEntity{

    private String weaponBoss;

    public String getWeaponBoss() {
        return weaponBoss;
    }

    public void setWeaponBoss(String weaponBoss) {
        this.weaponBoss = weaponBoss;
    }

    public Boss(String weaponBoss) {
        this.weaponBoss = weaponBoss;
    }
}