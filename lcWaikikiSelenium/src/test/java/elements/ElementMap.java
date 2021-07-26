package elements;

import org.openqa.selenium.By;

import java.util.HashMap;

import static elements.HomePageElements.*;
import static elements.ShirtPageElements.*;
import static elements.FavoritePageElements.*;

public class ElementMap {

    public static HashMap<String, By> elementsMap(){
        HashMap<String, By> elementsMap = new HashMap<String, By>();
        elementsMap.put( "closeCookies", closeCookies);
        elementsMap.put( "manButton", manButton);
        elementsMap.put( "shirtButton", shirtButton);
        elementsMap.put( "dropDownMenu", dropDownMenu);
        elementsMap.put( "priceDown", priceDown);
        elementsMap.put( "rawPrice", rawPrice);
        elementsMap.put( "favProduct", favProduct);
        elementsMap.put( "favButton", favButton);
        elementsMap.put( "sizeProduct", sizeProduct);
        elementsMap.put( "selectAll", selectAll);
        elementsMap.put( "checkAllProducts", checkAllProducts);
        elementsMap.put( "removeAllButton", removeAllButton);
        elementsMap.put( "favText", favText);

        return elementsMap;
    }


}