package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before ("@blank")
    public void beforeScenaio()
    {
        System.out.println(">>>>>>>> beforeScenaio ");
    }

    @After ("@blank")
    public void afterScenaio()
    {
        System.out.println(">>>>>>>> afterScenaio ");
    }
}
