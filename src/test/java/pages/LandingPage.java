package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LandingPage {

    public String about = "О КОМПАНИИ",
            news = "НОВОСТИ",
            services = "УСЛУГИ",
            industries = "ОТРАСЛИ",
            awards = "НАГРАДЫ",
            contacts = "КОНТАКТЫ",
            career = "КАРЬЕРА",
            products = "ПРОДУКТЫ",
            habr = "HABR БЛОГ";


    private SelenideElement aboutMenuButton = $("#menu-item-15"),
                            newsMenuButton = $("#menu-item-452"),
                            servicesMenuButton = $("#menu-item-640"),
                            industriesMenuButton = $("#menu-item-195"),
                            awardsMenuButton = $("#menu-item-418"),
                            contactsMenuButton = $("#menu-item-203"),
                            careerMenuButton = $("#menu-item-14"),
                            productsMenuButton = $("#menu-item-1081"),
                            habrMenuButton = $("#menu-item-133"),
                            servicesBlock = $("#sectionTitle-"),
                            moreButtonOnservicesBlock = $(".btn.btn-outline-white.btn-pill.mb-5"),
                            futerLogo = $("#footerLogo"),
                            telegramButton = $(byAttribute("href", "https://t.me/usetech_pro")),
                            vkButton = $(byAttribute("href", "https://vk.com/usetech_pro"));

    @Step("Открыть главную страницу ленда")
    public LandingPage openPage() {
        open("/");

        return this;
    }

    @Step("Меню навигации содержит кнопку О КОМПАНИИ")
    public LandingPage nawMenuAboutCheck() {
        aboutMenuButton.shouldHave(text(about));

        return this;
    }

    @Step("Меню навигации содержит кнопку НОВОСТИ")
    public LandingPage nawMenuNewsCheck() {
        newsMenuButton.shouldHave(text(news));

        return this;
    }

    @Step("Меню навигации содержит кнопку УСЛУГИ")
    public LandingPage nawMenuServicesCheck() {
        servicesMenuButton.shouldHave(text(services));

        return this;
    }

    @Step("Меню навигации содержит кнопку ОТРАСЛИ")
    public LandingPage nawMenuIndustriesCheck() {
        industriesMenuButton.shouldHave(text(industries));

        return this;
    }

    @Step("Меню навигации содержит кнопку НАГРАДЫ")
    public LandingPage nawMenuAwardsCheck() {
        awardsMenuButton.shouldHave(text(awards));

        return this;
    }

    @Step("Меню навигации содержит кнопку КОНТАКТЫ")
    public LandingPage nawMenuContactsCheck() {
        contactsMenuButton.shouldHave(text(contacts));

        return this;
    }

    @Step("Меню навигации содержит кнопку КАРЬЕРА")
    public LandingPage nawMenuCareerCheck() {
        careerMenuButton.shouldHave(text(career));

        return this;
    }

    @Step("Меню навигации содержит кнопку ПРОДУКТЫ")
    public LandingPage nawMenuProductsCheck() {
        productsMenuButton.shouldHave(text(products));

        return this;
    }

    @Step("Меню навигации содержит кнопку HABR БЛОГ")
    public LandingPage nawMenuHabrCheck() {
        habrMenuButton.shouldHave(text(habr));

        return this;
    }

    @Step("Клик на кнопку НОВОСТИ в меню навигации")
    public LandingPage newsButtonClick(){
        newsMenuButton.click();

        return this;
    }

    @Step ("Кнопка окрашена в салатовый цвет")
    public LandingPage activeMenuButtonColor(){
        newsMenuButton.shouldHave(cssValue("color", "rgba(33, 37, 41, 1)"));

        return this;
    }

    @Step("Клик на кнопку КАРЬЕРА")
    public LandingPage careerButtonClick(){
        careerMenuButton.click();

        return this;
    }



    @Step("Проскролить до блока УСЛУГИ на главной")
    public LandingPage scrollToServicesBlock(){
        servicesBlock.scrollTo();

        return this;
    }

    @Step("Кнопка Подробнее кликабельна")
    public LandingPage moreServicesButtonClickableCheck(){
        moreButtonOnservicesBlock.shouldBe(clickable);

        return this;
    }

    @Step("Скролл до лого футера")
    public LandingPage scrollToFuter(){
        futerLogo.scrollTo();

        return this;
    }

    @Step("Футер содержит ссылку на телеграм")
    public LandingPage telegramLinkCheck(){
        telegramButton.shouldBe(clickable);

        return this;
    }

    @Step("Футер содержит ссылку на VK")
    public LandingPage vkLinkCheck(){
        vkButton.shouldBe(clickable);

        return this;
    }
}
