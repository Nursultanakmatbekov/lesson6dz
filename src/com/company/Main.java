package com.company;

public class Main extends Weapon {
    public static void main(String[] args) {
    Boss boss = new Boss("sword");
    boss.setHealth(500);
    boss.setDamage(50);
    boss.setSuperAbility("superAbility");
        System.out.println("Boss "+"health: "+ boss.getHealth()+"; damage: "+ boss.getDamage()+"; superAbility: "+ boss.getSuperAbility()+"; weapon: "+ boss.getWeaponBoss() );


    }
}