package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class Career {

    private SelenideElement
            careerPageFilterClass = $(".home-filter__left");

    @Step("Открытая страница карьеры содержит заголовок поиска вакансий")
    public Career careerPageOpenCheck(){
        careerPageFilterClass.shouldHave(text("Поиск Вакансий"));

        return this;
    }
}
