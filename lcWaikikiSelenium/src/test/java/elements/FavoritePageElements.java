package elements;

import org.openqa.selenium.By;

public class FavoritePageElements {

    public static By sizeProduct = By.xpath("//*[@class='picture-box']");

    public static By selectAll = By.xpath("//*[@id='selectAll']");

    public static By checkAllProducts = By.xpath("//*[@checked='checked']");

    public static By removeAllButton = By.xpath("//*[@id='removeSelected']");

    public static By favText = By.cssSelector("p[class='text-center bold favoriteNoItemHeaderColor']");

}