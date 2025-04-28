package com.trouper.homepage;

import org.openqa.selenium.WebDriver;

public interface Locators {

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


    }

