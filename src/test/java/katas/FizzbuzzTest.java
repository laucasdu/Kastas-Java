package katas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzbuzzTest {


    @Test
    void returnMultiplyThree(){
        //GIVEN
        Fizzbuzz fizzbuzz = new Fizzbuzz();
        //WHEN
        String result = fizzbuzz.multipleOfThree(3);
        //THEN
        assertEquals("Fizz", result);

    }

    @Test
    public void returnMultiplyFive(){

        //GIVEN
        Fizzbuzz fizzbuzz = new Fizzbuzz();
        //WHEN
        String result = fizzbuzz.multipleOfFive(5);
        //THEN
        assertEquals("Buzz", result);

    }


    @Test
    public void returnNotMultiplyFiveofThreeSameNumber(){

        //GIVEN
        Fizzbuzz fizzbuzz = new Fizzbuzz();
        //WHEN
        int result = fizzbuzz.notMultiplyOfFiveOfThree(6);
        //THEN
        assertEquals(6, result);

    }

















}