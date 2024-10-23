package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.CareerPage;
import pages.LandingPage;

@Tag("landingTests")
public class LandingPageTests extends TestBase {

    LandingPage landingPage = new LandingPage();
    CareerPage careerPage = new CareerPage();

    @DisplayName("Названия кнопок навигации соответствуют документации")
    @Test
    void navigationMenuTest () {
        landingPage.nawMenuAboutCheck()
                .nawMenuNewsCheck()
                .nawMenuServicesCheck()
                .nawMenuIndustriesCheck()
                .nawMenuAwardsCheck()
                .nawMenuContactsCheck()
                .nawMenuCareerCheck()
                .nawMenuProductsCheck()
                .nawMenuHabrCheck();
    }

    @DisplayName("Активная кнопка меню НОВОСТИ окрашена в салатовый цвет")
    @Test
    void buttonMenuColorTest(){
        landingPage.newsButtonClick()
                .activeMenuButtonColor();
    }

    @DisplayName("Клик на кнопку меню КАРЬЕРА открывает страницу с поиском вакансий")
    @Test
    void clickOnMenuCareerButtonTest(){
        landingPage.careerButtonClick();
        careerPage.careerPageOpenCheck();
    }

    @DisplayName("В блоке услуг кнопка Подробнее кликабельна")
    @Test
    void moreButtonClickableTest(){
        landingPage.scrollToServicesBlock()
                .moreServicesButtonClickableCheck();
    }

    @DisplayName("Подвал должен содержать ссылки соц сетей")
    @Test
    void  futerSocialMediaLinksTest(){
        landingPage.scrollToFuter()
                .telegramLinkCheck()
                .vkLinkCheck();
    }
}
