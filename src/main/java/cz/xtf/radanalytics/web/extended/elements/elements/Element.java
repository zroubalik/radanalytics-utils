package cz.xtf.radanalytics.web.extended.elements.elements;

import org.openqa.selenium.WebElement;

public interface Element {
	boolean isDisplayed();

	WebElement getElement();

	String getAttribute(String attribute);
}
