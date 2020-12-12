package ru.company.framework.utils;

import io.qameta.allure.Allure;
import io.qameta.allure.Attachment;
import io.qameta.allure.junit5.AllureJunit5;
import io.qameta.allure.model.Status;
import io.qameta.allure.model.StatusDetails;
import io.qameta.allure.util.ResultsUtils;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.ReflectiveInvocationContext;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import ru.company.framework.managers.DriverManager;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;


public class AllureListener extends AllureJunit5 {


    @Override
    public Map<String, String> buildFailureEvent(String type, String uuid, Throwable throwable) {
        addScreenshot();
        return super.buildFailureEvent(type, uuid, throwable);
    }


    @Attachment(value = "screenshot", type = "image/png")
    public static byte[] addScreenshot(){
        return ((TakesScreenshot) DriverManager.getDriver()).getScreenshotAs(OutputType.BYTES);
    }

}
