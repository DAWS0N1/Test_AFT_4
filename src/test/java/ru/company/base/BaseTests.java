package ru.company.base;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import ru.company.framework.managers.InitManager;
import ru.company.framework.managers.PageManager;
import ru.company.framework.utils.AllureListener;

import static ru.company.framework.managers.DriverManager.getDriver;
import static ru.company.framework.managers.InitManager.props;
import static ru.company.framework.utils.Const.APP_URL;

@ExtendWith(AllureListener.class)
public class BaseTests {
    /**
     * Менеджер страничек
     * @see PageManager#getPageManager()
     */
    protected PageManager app = PageManager.getPageManager();

    @BeforeAll
    static void before() {
        InitManager.initFramework();
    }

    @BeforeEach
    void before2(){
        getDriver().get(props.getProperty(APP_URL));
    }

    @AfterAll
    static void after() {
        InitManager.quitFramework();
    }


}
