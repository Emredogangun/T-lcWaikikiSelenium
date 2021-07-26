package lcwaikikii;

import com.thoughtworks.gauge.Logger;
import com.thoughtworks.gauge.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.util.List;
import java.util.concurrent.TimeUnit;
import static org.junit.Assert.assertEquals;
import static elements.ElementMap.*;
import static url.UrlMap.*;

public class StepImplementation extends BaseTest {

    @Step({"<seconds> saniye bekle"})
    public void waitBySecond(int seconds) throws InterruptedException {
        TimeUnit.SECONDS.sleep(seconds);
        Logger.info(seconds+ "saniye beklendi.");

    }

    @Step("<url> li ve <name> isimli sayfa açık mı")
    public void assertTrue(String url, String name) {
        assertEquals(name + " isimli sayfadasınız", driver.getCurrentUrl(), urlMap().get(url));
        Logger.info(name + " isimli sayfadasınız");

    }

    @Step("<element> elementine tıkla")
    public void clickElement(String element) {

        click(elementsMap().get(element));
        Logger.info(element + " elementine tıklandı.");

    }

    @Step("<element> elementi üzerinde dur")
    public void hoverElement(String element) {

        hover(elementsMap().get(element));
        Logger.info(element + " elementi üzerinde duruldu.");

    }

    @Step("<element1> elementi üzerinde dur <element2> elementine tıkla")
    public void hoverOver(String element1, String element2) throws InterruptedException {

        clickTargetOnHover(elementsMap().get(element1),elementsMap().get(element2));
        Logger.info(element1 + " elementi üzerinde duruldu." + element2+ "elemtine tıklandı.");

    }

    @Step("<element> li listenin sıralamasını kontrol et")
    public void priceSort(String element){
        List<WebElement> li = elementList(elementsMap().get(element));
        for (int i=0;i<li.size()-1;i++){
            if(Integer.parseInt(li.get(i).getText().substring(0,3))>Integer.parseInt(li.get(i+1).getText().substring(0,3))){
                Logger.info("Sıkıntı yok");
            }
            Logger.info("Sıralama, En Yüksek Fiyattan olarak seçilmiştir");

        }
    }
    @Step("<element> li listeden <i> ürünü favorilere ekle")
    public void addToFav(String element,int i) {
        List<WebElement> li = elementList(elementsMap().get(element));
        li.get(i).click();
        Logger.info(element + "elementindenki"+ i+ "nci urun favorilere eklendi.");

    }
    @Step("<element> li listede <i> eleman var mı?")
    public  void listControl(String element,int i){
        List<WebElement> li = elementList(elementsMap().get(element));
                 Assert.assertEquals(li.size(),i);
        Logger.info(element + "elementindenki" +i+ "nci urun kontrol edildi.");

    }


    @Step("<element> li elementin içinde Favori Ürününüz Yok yazıyor mu?")
    public void checkWritten(String element) {

        Assert.assertEquals("Favori Ürününüz Yok" , getText(elementsMap().get(element)));
        Logger.info("Favori Ürününüz Yok");
    }
}
