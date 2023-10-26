
package com.mycompany.ejerciciopatroniterator;

import com.gisoft.facebook.FacebookApi;
import com.gisoft.facebook.FacebookUser;
import com.gisoft.google.GoogleApi;
import com.gisoft.google.GoogleUser;

public class ShowUsersPanel {
    
    private final GoogleApi googleApi;
    private final FacebookApi facebookApi;
    
    public ShowUsersPanel() {
        this.googleApi = new GoogleApi();
        this.facebookApi = new FacebookApi();
    }
    
    public void showGoogleUsers(){
        
        var googleUsers = this.googleApi.getGoogleUsers();
        
        for (int i = 0; i < googleUsers.length; i++) {
            GoogleUser item = googleUsers[i];
            System.out.println("Nombre: " + item.getName() + " - Email: " + item.getEmail());
        }
    }
    
    public void showFaceboookUsers(){
        
        var facebookUsers = this.facebookApi.getFacebookUsers();
        
        for (FacebookUser facebookUser : facebookUsers) {
            FacebookUser item = facebookUser;
            System.out.println("Nombre: " + item.getFbName()+ " - Url: " + item.getFbUrl());
        }
    }
    
}
