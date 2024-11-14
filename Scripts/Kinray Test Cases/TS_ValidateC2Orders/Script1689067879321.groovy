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
WebUI.enhancedClick(findTestObject('Page_Kinray Weblink/homepage/addbtn'))

'view cart'
WebUI.click(findTestObject('Page_Kinray Weblink/homepage/carticon'))

'click on show button'
WebUI.enhancedClick(findTestObject('Page_Kinray Weblink/KinrayCart/showBtn'))

'scroll to item id label'
WebUI.scrollToElement(findTestObject('Page_Kinray Weblink/KinrayCart/C2Label'), 5709787)

'click on the txt box of PO'
WebUI.enhancedClick(findTestObject('Page_Kinray Weblink/KinrayCart/InputC2'))

'Input the purchase order number'
WebUI.setText(findTestObject('Page_Kinray Weblink/KinrayCart/InputC2'), Txt)

'Checkout the item'
WebUI.click(findTestObject('Page_Kinray Weblink/homepage/checkoutbtn'))

'Checkout the item'
WebUI.click(findTestObject('Page_Kinray Weblink/homepage/checkoutbtn'))

WebUI.scrollToElement(findTestObject('Page_Kinray Weblink/KinrayCart/submitbtn'), 8)

//'scroll to item id label'
//WebUI.scrollToElement(findTestObject('Page_Kinray Weblink/KinrayCart/C2ItemId'))
'Validate item id in order review page'
WebUI.verifyElementText(findTestObject('Page_Kinray Weblink/KinrayCart/C2ItemId'), ItemId)

'Submmit the order'
WebUI.click(findTestObject('Page_Kinray Weblink/KinrayCart/submitbtn'))

'Validate item id order summary page'
WebUI.verifyElementText(findTestObject('Page_Kinray Weblink/KinrayCart/OderReviewItemIDC2'), ItemId)

'Validate Order successful message'
WebUI.verifyElementText(findTestObject('Page_Kinray Weblink/KinrayCart/orderconfirmedtxt'), 'Thank you for your order! Please print a copy of this page for your records.')

'Close browser'
WebUI.closeBrowser()

