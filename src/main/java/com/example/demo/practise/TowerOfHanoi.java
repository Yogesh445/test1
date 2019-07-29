package com.example.demo.practise;

public class TowerOfHanoi {

    public void towerofHonoi(int number, char source, char destination, char auxiliary) {

        if (number == 1) {
            System.out.println("Move 1 from " + source + " to " + destination);
            return;
        }
        towerofHonoi(number - 1, source, auxiliary, destination);
        System.out.println("Move " + number + " from " + source + " to " + destination);
        towerofHonoi(number - 1, auxiliary, destination, source);
    }

    public static void main(String[] args) {
        TowerOfHanoi tower = new TowerOfHanoi();
        tower.towerofHonoi(3, 'A', 'C', 'B');
    }
}
