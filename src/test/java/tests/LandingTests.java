package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.Career;
import pages.Landing;

@Tag("landingTests")
public class LandingTests extends TestBase {

    Landing landing = new Landing();
    Career career  = new Career();

    @DisplayName("Названия кнопок навигации соответствуют документации")
    @Test
    void navigationMenuTest () {
        landing.nawMenuAboutCheck()
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
        landing.newsButtonClick()
                .activeMenuButtonColor();
    }

    @DisplayName("Клик на кнопку меню КАРЬЕРА открывает страницу с поиском вакансий")
    @Test
    void clickOnMenuCareerButtonTest(){
        landing.careerButtonClick();
        career.careerPageOpenCheck();
    }

    @DisplayName("В блоке услуг кнопка Подробнее кликабельна")
    @Test
    void moreButtonClickableTest(){
        landing.scrollToServicesBlock()
                .moreServicesButtonClickableCheck();
    }

    @DisplayName("Подвал должен содержать ссылки соц сетей")
    @Test
    void  futerSocialMediaLinksTest(){
        landing.scrollToFuter()
                .telegramLinkCheck()
                .vkLinkCheck();
    }
}
