package model;

public class Skeleton extends Antagonist{

    public Skeleton(){
        this.setName("Skeleton_" +String.valueOf(this.getUniqueId()));
        this.setHitPoints(10);
        this.setArmorRating(13);
        Weapon startingWeapon = new ShortSword();
        this.addToInventory(startingWeapon);
        this.setEquippedWeapon(startingWeapon);
        startingWeapon.setEquipped(true);
    }
}
