package com.step;

import com.step.service.StringManager;
import com.step.service.IncorrectArgumentException;
import java.util.Scanner;

/**
 *
 * @author sscerbatiuc
 */
public class App {

    public static void main(String[] args) {
        // StringDbManager sManager = new StringDbManager();
        try {
            StringManager sManager = new StringManager();
            System.out.println("Salut. Introduceti o valoare");
            Scanner sc = new Scanner(System.in);
            sManager.add(sc.nextLine());
            System.out.println("Introduceti o noua valoare");
            sManager.add(sc.nextLine());
        } catch (IncorrectArgumentException ex) {
            System.out.println("Eroare." + ex.getMessage());
        }

//        System.out.println(sManager.view(0));
//        sManager.edit(0, "new");
//        System.out.println(sManager.view(0));
//        sManager.delete(0);
//        System.out.println(sManager.view(0));
    }
}
