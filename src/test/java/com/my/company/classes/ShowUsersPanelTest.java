package com.my.company.classes;

import org.junit.Test;

public class ShowUsersPanelTest {
    
    public ShowUsersPanelTest() {}

    @Test
    public void google_users() {
        System.out.println("Google users");
        ShowUsersPanel panel = new ShowUsersPanel();
        panel.show();
    }
    
}
