package katas;

public class Character {

    private int maxHealth = 1000;
    private int health = 1000;
    private int level = 1;
    private boolean alive = true;

    public int getHealth() {
        return this.health;
    }

    public int getLevel() {
        return level;
    }

    public boolean isAlive() {
        return alive;
    }


    public void attacksOther(Character victim, Character attacker, int damage) {
        if (victim == this) return;
        victim.damage(levelDiferrence5(victim, attacker, damage));
    }

    private void damage(int damage) {
        if (this.health - damage <= 0) {
            this.alive = false;
            this.health = 0;
            return;
        }
        this.health -= damage;
    }

    public void healOther(Character character, int heal) {
        if (character != this) return;
        character.heal(heal);
    }

    private void heal(int heal) {
        if (!this.alive) return;
        this.health += heal;
        if (this.health > maxHealth) this.health = maxHealth;
    }


    public int levelDiferrence5(Character victim, Character fighter, int damage) {
        if (victim.level - fighter.level >= 5) return damage / 2;
        if (fighter.level - victim.level >= 5) return damage * 2;
        return damage;

    }

    public void modifyLevel(int i) {
        level += i;
    }

}



