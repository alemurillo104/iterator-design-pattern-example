
package com.mycompany.ejerciciopatroniterator;

import org.junit.Test;

public class ShowPanelUsersUsingIteratorPatternTest {
    
    public ShowPanelUsersUsingIteratorPatternTest() {}

    @Test
    public void testShowFacebookUsers() {
        System.out.println("showFacebookUsers");
        ShowPanelUsersUsingIteratorPattern panel = new ShowPanelUsersUsingIteratorPattern();
        panel.showFacebookUsers();
        
    }
    
}
