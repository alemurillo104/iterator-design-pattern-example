package com.mycompany.ejerciciopatroniterator;

public class EjercicioPatronIterator {

    public static void main(String[] args) {
        System.out.println("Grupo 1 - Ejercicio Patron Iterator"); 
        var panel = new ShowPanelUsersUsingIteratorPattern();
        //GoogleUsers
        panel.showGoogleUsers();
        
        //FacebookUsers
        panel.showFacebookUsers();
    }
}
