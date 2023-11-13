package tests;

import config.AppiumConfig;
import org.testng.annotations.Test;
import screens.SplashScreen;

public class RegistrationTests extends AppiumConfig {

    int i = (int)(System.currentTimeMillis()/1000)%3600;
    @Test
    public void registrationPositive(){
        new SplashScreen(driver)
                .gotoAuthenticationScreen()
                .fillEmail("vitya" + i + "@mail.com")
                .fillPassword("Oo54321$")
                .submitRegistration();
    }
}
