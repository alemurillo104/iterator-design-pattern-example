package com.mycompany.ejerciciopatroniterator;

public class EjercicioPatronIterator {

    public static void main(String[] args) {
        System.out.println("Grupo 1 - Ejercicio Patron Iterator");
        var panel = new ShowUsersPanel();
        //Google users
        panel.showGoogleUsers();
        
        //Facebook users
        panel.showFaceboookUsers();
        
        //Cre users
        panel.showCreUsers();
    }
}
