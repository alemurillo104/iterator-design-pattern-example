
package com.mycompany.ejerciciopatroniterator;

import com.gisoft.facebook.FacebookAggregate;
import com.gisoft.facebook.FacebookApi;
import com.gisoft.facebook.FacebookIterator;
import com.gisoft.facebook.FacebookUser;

public class ShowPanelUsersUsingIteratorPattern {
   
    private final FacebookAggregate facebookAggregate;
    
    public ShowPanelUsersUsingIteratorPattern(){
        this.facebookAggregate = new FacebookAggregate(new FacebookApi().getFacebookUsers());
    }
    
    public void showFacebookUsers(){
        FacebookIterator iterator = (FacebookIterator) this.facebookAggregate.createIterator();
        while (!iterator.isDone()) {            
            FacebookUser user = iterator.next();
            System.out.println("Nombre: " + user.getFbName()+ " - Url: " + user.getFbUrl());
        }
    }
}
