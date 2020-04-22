/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import domain.Exercise;
import java.util.Scanner;
/**
 *
 * @author Надюха
 */
public class TestResult {
    /**
     * Display the hash code of the entered text
     * @param args hach code
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text : ");

        System.out.println("Hashed text: " + Exercise.Hash(scanner.nextLine()));
    }
}
