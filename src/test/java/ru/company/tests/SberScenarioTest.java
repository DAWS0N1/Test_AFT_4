package ru.company.tests;

import org.junit.jupiter.api.Test;
import ru.company.base.BaseTests;


public class SberScenarioTest extends BaseTests {

    @Test
    void sberScenarioTest(){
        app.getStartPage()
                .selectBaseMenu("Ипотека")
                .selectSubMenu("Ипотека на готовое жильё")
                .clickNextBtn()
                .inputField("Стоимость недвижимости", "5 180 000")
                .inputField("Первоначальный взнос", "3 058 000")
                .inputField("Срок кредита", "30")
                .selectCheckboxes("Скидка 0,3% при покупке квартиры на ДомКлик", "true")
                .selectCheckboxes("Страхование жизни", "false")
                .selectCheckboxes("Молодая семья", "true")
                .selectCheckboxes("Электронная регистрация сделки", "true")
                .checkingField("Ежемесячный платеж", "16 017 ₽")
                .checkingField("Сумма кредита", "2 122 000 ₽")
                .checkingField("Необходимый доход", "20 618 ₽")
                .checkingField("Процентная ставка", "10%");
    }
}
