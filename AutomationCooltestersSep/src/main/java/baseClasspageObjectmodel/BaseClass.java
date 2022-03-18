package baseClasspageObjectmodel;

import org.openqa.selenium.WebElement;

public class BaseClass {
	
	public void ExecuteAction(WebElement Element, String action, String value) {
		
		String actionExecute = action;
		
		switch (actionExecute){
		
		case "click": 
			Element.click();
			break;
			
		case "sendKeys":
			
			Element.sendKeys(value);
			break;
			
			
			
		
			
		}

	}

}
