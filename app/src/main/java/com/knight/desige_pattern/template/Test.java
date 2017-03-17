package com.knight.desige_pattern.template;

/**
 * Created by knightoneadmin on 2017/3/8.
 */

public class Test {
    public static void main(String[] args) {
        AbstractComputer computer = new CoderComputer();
        computer.startUp();

        computer= new TeacherComputer();

        computer.startUp();
    }
}
