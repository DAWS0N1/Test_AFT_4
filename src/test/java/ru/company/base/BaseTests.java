package ru.company.base;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import ru.company.framework.managers.InitManager;
import ru.company.framework.managers.PageManager;

public class BaseTests {
    /**
     * Менеджер страничек
     * @see PageManager#getPageManager()
     */
    protected PageManager app = PageManager.getPageManager();

    @BeforeEach
    void before() {
        InitManager.initFramework();
    }

    @AfterEach
    void after() {
        InitManager.quitFramework();
    }


}
