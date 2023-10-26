
package com.my.company.classes;

public class ShowUsersPanel {
    
    private final GoogleApi googleApi;
    
    public ShowUsersPanel() {
        this.googleApi = new GoogleApi();
    }
    
    public void show(){
        
        var users = this.googleApi.getGoogleUsers();
        
        for (int i = 0; i < users.length; i++) {
            GoogleUser item = users[i];
            System.out.println("Nombre: " + item.getName() + "- Email: " + item.getEmail());
        }   
    }
    
}
