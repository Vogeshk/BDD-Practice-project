package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import Pages.Pagemanager;

public class Textcontextsetup {
 public WebDriver driver ;
 public String productpageproduct ;
 public Pagemanager pagemanager;
 public Testbase testbase;
 public Textcontextsetup() throws IOException {
	  testbase= new Testbase();
	  pagemanager = new Pagemanager(testbase.getbrowser());
	 
 }
}
