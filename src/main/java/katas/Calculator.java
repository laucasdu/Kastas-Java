package katas;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    private double total = 0.0;

    public double getTotal() {
        return this.total;
    }

    public void sum(double i) {
        this.total = this.total + i;
        //this.total += i;
    }

    public void rest(double i) {
        this.total -= i;
    }

    public void multi(double i){
        this.total *= i;
    }

    public void div(double i){
        this.total /= i;
    }


    public void modul(double i) {
        this.total %= i;

    }

    public boolean numPar(double num) {

        if (num % 2 == 0) {
            return true;
        } else {
            return false;

        }
    }

    public double twoNumMayor(double num1, double num2) {
        return Math.max(num1, num2);
    }

    public void sumArray(int[] arrayList){

        int totalSum = 0;

            for (int i = 0; i < arrayList.length; i++) {
                totalSum += arrayList[i];
            }
            this.total = totalSum;
    }


    public List<Integer> returnGreatThan5(List<Integer> list) {

        List<Integer> numLista = new ArrayList<Integer>();

        for (int num : list){
            if (num >= 5){
                numLista.add(num);
            }
        }
        return numLista;
    }


}




















