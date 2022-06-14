package katas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CharacterTest {



    @Test
    public void allCharactersWhenCreatedStartsWith1000Health() {
        Character fighter = new Character();

        assertEquals(1000, fighter.getHealth());

    }

    @Test
    public void allCharactersWhenCreatedStartsLevelOne() {
        Character fighter = new Character();

        assertEquals(1, fighter.getLevel());

    }

    @Test
    public void MayBeAliveOrDead() {
        Character fighter = new Character();

        assertEquals(true, fighter.isAlive());

    }


    @Test
    void characterAttacksAndDamageIsSubtractedFromHealth(){
        Character attacker = new Character();
        Character victim = new Character();

        attacker.attacksOther(victim, attacker, 50);
        assertEquals(950, victim.getHealth());

    }

    @Test
    void whenHealthBelow0CharacterDiesAndHealthTurn0(){
        Character attacker = new Character();
        Character victim = new Character();

        attacker.attacksOther(victim, attacker,1000); //Limits

        assertEquals(false, victim.isAlive());

    }

    @Test
    void thereIsNoOneWithLessThan0Health(){
        Character attacker = new Character();
        Character victim = new Character();

        attacker.attacksOther(victim, attacker,1500);

        assertEquals(0, victim.getHealth());

    }

    @Test
    void charactCanHealItSelf(){

        Character attacker = new Character();
        Character victim = new Character();

        attacker.attacksOther(victim, attacker,50);

        victim.healOther(victim, 20);

        assertEquals(970, victim.getHealth());

    }


    @Test
    void deadCharacterCanNotBeHealed(){

        Character attacker = new Character();
        Character victim = new Character();

        attacker.attacksOther(victim, attacker,1500);

        attacker.healOther(victim, 600);

        assertEquals(0, victim.getHealth());
        assertEquals(false, victim.isAlive());


    }

    @Test
    void characterCanNotRize1000Healt(){

        Character attacker = new Character();
        Character victim = new Character();

        attacker.attacksOther(victim, attacker,500);

        victim.healOther(victim, 600);

        assertEquals(1000, victim.getHealth());

    }


    @Test
    void characterCanNotDamageItSelf(){

        Character attacker = new Character();
        Character victim = new Character();

        attacker.attacksOther(victim, attacker,500);

        assertEquals(1000, attacker.getHealth());
    }


    @Test
    void characterCanOnlyHealItSelf(){
        Character attacker = new Character();
        Character victim = new Character();

        attacker.attacksOther(victim,attacker, 500);
        attacker.healOther(victim, 50);
        assertEquals(500, victim.getHealth());

    }


    @Test
    public void whenVictimIsMoreLevelIsAloveReduceDamageHalf(){

        Character attacker = new Character();
        Character victim = new Character();

        victim.modifyLevel(7);
        attacker.attacksOther(victim, attacker, 100);

        assertEquals(950, victim.getHealth());
    }




}