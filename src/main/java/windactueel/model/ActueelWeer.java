/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package windactueel.model;

/**
 *
 * @author julia
 */
public class ActueelWeer {
    
    private String windkracht;
    
    
    //hier de json api gebruiken om actueelweer te vullen met data

    public String getWindkracht() {
        return windkracht;
    }

    public void setWindkracht(String windkracht) {
        this.windkracht = windkracht;
    }
}
