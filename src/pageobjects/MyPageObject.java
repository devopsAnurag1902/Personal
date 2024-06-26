package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="MyPageObject"                                
     , summary=""
     , relativeUrl=""
     , connection="UITESTING"
     )             
public class MyPageObject {

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Gmail']")
	public WebElement gmail;
			
}
