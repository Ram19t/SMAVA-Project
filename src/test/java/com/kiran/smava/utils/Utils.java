package com.kiran.smava.utils;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Utils {

	/**
	 * This is a generic method used to select the desired value from the drop down
	 * @param value
	 * @param listOfValuesLink
	 * @param valueLink
	 */
	public void valueSelectionFromDropDown(WebDriver driver, String value,By listOfValuesLink, By valueLink){
		try {
			Thread.sleep(2000);
			List<WebElement> elements = driver.findElements(listOfValuesLink); 
			for(WebElement we : elements){
				System.out.println(we.getText());
				if(value.equals(we.getText())){
					driver.findElement(valueLink).click();
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
