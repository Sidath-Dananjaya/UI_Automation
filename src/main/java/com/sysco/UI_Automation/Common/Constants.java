package com.sysco.UI_Automation.Common;

import org.openqa.selenium.WebDriver;

public class Constants {
    public static String CHROME_DRIVER_PATH = "/src/main/resources/chromedriver";
    public static WebDriver driver;
    public static final String TEST_ENV = System.getProperty("test.env", "QA");

    public static final boolean RUN_LOCALLY = Boolean.parseBoolean(System.getProperty("run.locally", "true"));
    public static final String APP_URL = System.getProperty("app.url", "https://www.theathletesfoot.com.au/");
    public static final String APP_OS = System.getProperty("app.os", "WIN10");
    public static final String APP_BROWSER = System.getProperty("app.browser", "chrome");
    public static final Long DEFAULT_TIMEOUT = 15L;

    public static String loginLink = ".//a[@href='https://www.theathletesfoot.com.au/customer/account/login']";
    public static String invalidEmail = "invalidEmail@yahoo.com";
    public static String invalidPassword = "wrongPassword";

    public static String correctEmail = "williamjacob802@gmail.com";
    public static String correctPassword = "abc123$$";

    public static String shoePrice = "$259.99";


    public static final String ERROR_MESSAGE_FIRSTNAME_IS_REQUIRED = "THIS IS A REQUIRED FIELD.";
    public static final String ERROR_MESSAGE_LASTNAME_IS_REQUIRED = "THIS IS A REQUIRED FIELD.";
    public static final String ERROR_MESSAGE_EMAIL_IS_REQUIRED = "THIS IS A REQUIRED FIELD.";
    public static final String ERROR_MESSAGE_PASSWORD_IS_REQUIRED = "THIS IS A REQUIRED FIELD.";
    public static final String ERROR_MESSAGE_INVALID_EMAIL = "PLEASE ENTER A VALID EMAIL ADDRESS (EX: JOHNDOE@DOMAIN.COM).";
    public static final String ERROR_MESSAGE_ADDRESS_IS_REQUIRED ="THIS IS A REQUIRED FIELD.";
    public static final String ERROR_MESSAGE_SUBURB_IS_REQUIRED= "THIS IS A REQUIRED FIELD.";
    public static final String ERROR_MESSAGE_STATE_PROVINCE_IS_REQUIRED ="THIS IS A REQUIRED FIELD.";
    public static final String ERROR_MESSAGE_POSTAL_CODE_IS_REQUIRED = "THIS IS A REQUIRED FIELD.";
    public static final String ERROR_MESSAGE_PHONE_NUMBER_IS_REQUIRED = "THIS IS A REQUIRED FIELD.";
}
