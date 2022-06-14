package katas;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {


    @Test
    public void calculatorStartsZero() {
        //GIVEN
        Calculator calculator = new Calculator();
        //WHEN
        var result = calculator.getTotal();
        //THEN
        assertEquals(0.0, result);

    }

    @Test
    public void calculatorSum() {
        //GIVEN
        Calculator calculator = new Calculator();

        calculator.sum(2);
        assertEquals(2, calculator.getTotal());

        calculator.sum(3);
        assertEquals(5, calculator.getTotal());

    }

    @Test
    public void calculatorRest() {
        //GIVEN
        Calculator calculator = new Calculator();
        calculator.rest(1);
        assertEquals(-1, calculator.getTotal());
    }

    @Test
    public void calculatorMulti() {
        Calculator calculator = new Calculator();
        calculator.multi(2.0);
        double result = calculator.getTotal();
        assertEquals(0.0, result);
    }

    @Test
    public void calculatorDiv() {
        Calculator calculator = new Calculator();
        calculator.div(2.0);
        double result = calculator.getTotal();
        assertEquals(0.0, result);
    }

    @Test
    public void calculatorModul(){
        Calculator calculator = new Calculator();
        calculator.modul(8.0);
        double result = calculator.getTotal();
        assertEquals(0.0, result);
    }


    @Test
    public void calculatorNumPar(){
        Calculator calculator = new Calculator();
        boolean result = calculator.numPar(2.0);
        assertEquals(true, result);

    }

    @Test
    public void calculatorTwoNumMayor(){
        Calculator calculator = new Calculator();
        double result = calculator.twoNumMayor(4.0, 8.0);
        assertEquals(8.0, result);

    }

    @Test
    public void calculatorArrayNum() {
        Calculator calculator = new Calculator();
        int [] arrayList = new int [] {2, 5, 10};
        calculator.sumArray(arrayList);
        double result = calculator.getTotal();
        assertEquals(17, result);
    }

    @Test
    public void calculatorReturnGreatThan5(){
        Calculator calculator = new Calculator();

        List <Integer> list = new ArrayList<Integer>();
        int [] listVals = {3,8,1,2,35,22,39};
        for(int val : listVals){
            list.add(val);
        }

        List<Integer> result = calculator.returnGreatThan5(list);

        List <Integer> numListMayorFive = new ArrayList<Integer>();

        numListMayorFive.add(8);
        numListMayorFive.add(35);
        numListMayorFive.add(22);
        numListMayorFive.add(39);


        assertEquals(numListMayorFive, result);
    }


}



