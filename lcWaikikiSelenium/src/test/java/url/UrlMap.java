package url;

import org.openqa.selenium.By;

import java.util.HashMap;

public class UrlMap {

    public static HashMap<String, String> urlMap(){
        HashMap<String, String> urlMap = new HashMap<String, String>();
        urlMap.put( "Favorilerim", "https://www.lcwaikiki.com/tr-TR/TR/favorilistem");
        urlMap.put( "Erkek Gömlek", "https://www.lcwaikiki.com/tr-TR/TR/kategori/erkek/gomlek");
        urlMap.put( "Anasayfa", "https://www.lcwaikiki.com/tr-TR/TR");

        return urlMap;
    }


}