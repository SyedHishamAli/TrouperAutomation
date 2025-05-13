package com.trouper.PageObjects;

public interface Locators {

    //----------------------------------------------Homepage elements----------------------------------------------------------------------
    String logoElement="//img[@alt=\"trouper-logo\"]";
    String searchElement="//input[@id=\"search-field\"]";
    String aspotBanner1="//img[@data-pb-style=\"DMQ2HCV\"]";
    String aspotBanner2="//img[@data-pb-style=\"QIF7PNG\"]";
    String topCategories="//div[@class=\"top-categories-section\"]";
    String topCategorydryfood="//a[contains(text(),\"  Freeze-Dried Food  \")]";//Top Categories Section
    String petSupplies="//img[@data-pb-style=\"L96TAPS\"]";
    String newPetSupplies="//h2[text(), \"New pet supplies in stock\"]";
    String brandBanners="//div[@class=\"home-brand-banners\"]";
    String serviceCards="//div[@class=\"home-services-cards bg-image-6pemc\"]";
    String loyaltyBanner="//img[@data-pb-style=\"M0LVJYU\"]";
    String recommendedProducts="//h2[text()=\"Recommended  products\"]/parent::div[@data-pb-style=\"RVS1P93\"]";
    String insuranceBanner="//img[@data-pb-style=\"BTH0U6A\"]";
    String productClick="//img[@alt=\"Chip Chops Dog Treats - Diced Chicken\"]";

    //-------------------------------------------------Login Elements------------------------------------------------------------------------------

    String myaccount="//button[@id=\"myAccount\"]";
    String myaccountDropdown="//div[@class=\"myaccount_dropdown_wrapper\"]";
    String loginCTA="//a[@id=\"register_signin\"]";
    String loginPopup="//div[@class=\"Popup-Content \"]";
    String emailInput="emaillogin";
    String continueCTA="//button[contains(text(), \"Continue\")]";
    String passwordToggle="//button[contains(text(), \"Log In with password\")]";
    String passInput="//input[@type=\"password\"]";
    String submitCTA="SubmitButton";
    String userName ="//div[contains(text(), \"Hi, Syed \")]";
    String emailError="//p[contains(text(), \"Please check the email ID entered.\")]";
    String passError="//p[contains(text(), \"Login failed. Please check your credentials.\")]";

    }

