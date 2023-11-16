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

'Click on the search box'
WebUI.click(findTestObject('Page_Kinray Weblink/homepage/homesearchbox'))

'Input the item id to search'
WebUI.setText(findTestObject('Page_Kinray Weblink/homepage/homesearchbox'), ItemId)

'Click on the search btn'
WebUI.click(findTestObject('Page_Kinray Weblink/homepage/searchbtn'))

'add quantity'
WebUI.click(findTestObject('Page_Kinray Weblink/homepage/addbtn'))

'add the item in cart'
WebUI.click(findTestObject('Page_Kinray Weblink/homepage/carticon'))

'scroll to item id label'
WebUI.scrollToElement(findTestObject('Page_Kinray Weblink/homepage/lblregualr'), 4981130)

'Checkout the item'
WebUI.click(findTestObject('Page_Kinray Weblink/homepage/checkoutbtn'))

'Validate item id in order review page'
WebUI.verifyElementText(findTestObject('Page_Kinray Weblink/KinrayCart/OrderReviewItemID'), ItemId)

'Submmit the order'
WebUI.click(findTestObject('Page_Kinray Weblink/KinrayCart/submitbtn'))

'Validate item id order summary page'
WebUI.verifyElementText(findTestObject('Page_Kinray Weblink/KinrayCart/OrderReviewItemID'), ItemId)

'Validate Order successful message'
WebUI.verifyElementText(findTestObject('Page_Kinray Weblink/KinrayCart/orderconfirmedtxt'), 'Thank you for your order! Please print a copy of this page for your records.')

'Close browser'
WebUI.closeBrowser()

