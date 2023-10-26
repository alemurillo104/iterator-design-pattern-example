package com.mycompany.ejerciciopatroniterator;

import org.junit.Test;
import org.junit.Before;

public class ShowUsersPanelTest {
    
    private ShowUsersPanel panel;
            
    public ShowUsersPanelTest() {}
    
    @Before
    public void setUp(){
        this.panel = new ShowUsersPanel();
    }

    @Test
    public void testShowGoogleUsers() {
        System.out.println("showGoogleUsers");
        this.panel.showGoogleUsers();
    }

    @Test
    public void testShowFaceboookUsers() {
        System.out.println("showFaceboookUsers");
        this.panel.showFaceboookUsers();
    }
    
    @Test
    public void testShowCreUsers() {
        System.out.println("showCreUsers");
        this.panel.showCreUsers();
    }
}
