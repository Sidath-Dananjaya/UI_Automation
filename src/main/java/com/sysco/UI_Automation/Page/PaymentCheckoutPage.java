package com.sysco.UI_Automation.Page;

import com.sun.jna.StringArray;
import com.sysco.UI_Automation.Data.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PaymentCheckoutPage extends PageBase{


    public static By firstName = By.xpath(".//div[@id='shipping-new-address-form']/div/label/span[text()='First Name']/../following-sibling::div/input");
    public static By lastName = By.xpath(".//div[@id='shipping-new-address-form']/div/label/span[text()='Last Name']/../following-sibling::div/input");
    public static By continueBtn = By.xpath(".//button[@title='Continue']");
    public static By address = By.xpath(".//div[@id='shipping-new-address-form']/fieldset//span[text()='Street Address Line 1']/../following-sibling::div/input");
    public static By suburb = By.xpath(".//div[@id='shipping-new-address-form']/div/label/span[text()='Suburb']/../following-sibling::div/input");
    public static By stateProvince = By.xpath(".//div[@id='shipping-new-address-form']/div/label/span[text()='State/Province']/../following-sibling::div/input");
    public static By postCode = By.xpath(".//div[@id='shipping-new-address-form']/div/label/span[text()='Post Code']/../following-sibling::div/input");
    public static By phoneNumber = By.xpath(".//div[@id='shipping-new-address-form']/div//label/span[text()='Phone Number']/../following-sibling::div/input");
    public static By  postCodeOption1 = By.xpath(".//a[text()=' BARANGAROO New South Wales']");
    public static By stateProvinceOption1 = By.xpath(".//div[@id='shipping-new-address-form']/div/label/span[text()='State/Province']/../following-sibling::div/input");
    public static By lblGrandTotal = By.xpath(".//strong[text()='Grand Total']");
    public static By btnPlaceOrderDisabled = By.xpath(".//div[@class='opc-submit-step']");
    public static WebElement errorEmptyFirstName = syscoLabUI.findElement(By.xpath(".//*[@id='error-INLWUI5']/span"));
    public static WebElement errorEmptyLastName = syscoLabUI.findElement(By.xpath(".//*[@id='error-L91NV61']/span"));
    public static WebElement errorEmptyAddress = syscoLabUI.findElement(By.xpath("//div[@id='shipping-new-address-form']/fieldset//span[text()='Street Address Line 1']/../following-sibling::div/div/span"));
    public static WebElement errorEmptySuburb = syscoLabUI.findElement(By.xpath("//div[@id='shipping-new-address-form']/div/label/span[text()='Suburb']/../following-sibling::div/div/span"));
    public static WebElement errorEmptyStateProvince = syscoLabUI.findElement(By.xpath("//div[@id='shipping-new-address-form']/div/label/span[text()='State/Province']/../following-sibling::div/div/span"));
    public static WebElement errorEmptyPostCode = syscoLabUI.findElement(By.xpath("//div[@id='shipping-new-address-form']/div/label/span[text()='Post Code']/../following-sibling::div/div/span"));
    public static WebElement errorEmptyPhoneNumber = syscoLabUI.findElement(By.xpath("//div[@id='shipping-new-address-form']/div//label/span[text()='Phone Number']/../following-sibling::div/div[@class='field-error mage-error']/span"));



    public static String[] isValidationErrorsAvailable() {

        syscoLabUI.click(continueBtn);
        String[] errorMessages = new String[7];
        errorMessages[0] = syscoLabUI.getText(errorEmptyFirstName);
        errorMessages[1] = syscoLabUI.getText(errorEmptyLastName);
        errorMessages[2] = syscoLabUI.getText(errorEmptyAddress);
        errorMessages[3] = syscoLabUI.getText(errorEmptySuburb);
        errorMessages[4] = syscoLabUI.getText(errorEmptyStateProvince);
        errorMessages[5] = syscoLabUI.getText(errorEmptyPostCode);
        errorMessages[6] = syscoLabUI.getText(errorEmptyPhoneNumber);
        return errorMessages;
    }


    public static void proceedPaymentCheckout(){

        syscoLabUI.sendKeys(errorEmptyFirstName, Data.fName);
        syscoLabUI.sendKeys(errorEmptyLastName, Data.lName);
        syscoLabUI.sendKeys(errorEmptyAddress, Data.address);
        syscoLabUI.sendKeys(errorEmptyPostCode, Data.postalCode);
        syscoLabUI.sendKeys(errorEmptyPhoneNumber, Data.phoneNumber);

        syscoLabUI.click(continueBtn);
    }







}
