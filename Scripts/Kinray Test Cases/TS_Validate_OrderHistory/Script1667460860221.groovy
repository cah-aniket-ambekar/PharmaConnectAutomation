import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

'Login to Kinray application'
CustomKeywords.'login.login.loginpage'()

'Click on the Invoice menu'
WebUI.click(findTestObject('Page_Kinray Weblink/Invoice/poinv'))

'Open the order history menu'
WebUI.click(findTestObject('Object Repository/Page_Kinray Weblink/homepage/a_Order History'))

'Click on the search box'
WebUI.click(findTestObject('Page_Kinray Weblink/homepage/ordersearchtext'))

'Search the order number'
WebUI.setText(findTestObject('Page_Kinray Weblink/homepage/ordersearchtext'), OrderNum)

'Click on the search button'
WebUI.click(findTestObject('Page_Kinray Weblink/homepage/ordersearchbtn'))

'Load the order history details'
WebUI.click(findTestObject('Page_Kinray Weblink/homepage/linkweborder'))

//WebUI.getText(findTestObject('Page_Kinray Weblink/homepage/getWebOrderNo'))

'Validate the order number in history details'
WebUI.verifyElementText(findTestObject('Page_Kinray Weblink/homepage/getWebOrderNo'), OrderNum)

'Close browser'
WebUI.closeBrowser()


