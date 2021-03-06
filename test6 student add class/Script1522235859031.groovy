import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:8080/ljlj/panduan.jsp')

WebUI.setText(findTestObject('test6/Page_Insert title here (2)/input_juese'), 'student')

WebUI.click(findTestObject('test6/Page_Insert title here (2)/input'))

WebUI.setText(findTestObject('test6/Page_ (2)/input_user1id'), '555')

WebUI.setText(findTestObject('test6/Page_ (2)/input_user1pass'), '555')

WebUI.click(findTestObject('test6/Page_ (2)/input'))

WebUI.click(findTestObject('test6/Page_Insert title here (2)/button_Add class'))

WebUI.setText(findTestObject('test6/Page_Insert title here (2)/input_coursename'), 'software cons test')

WebUI.setText(findTestObject('test6/Page_Insert title here (2)/input_coid'), '116')

WebUI.setText(findTestObject('test6/Page_Insert title here (2)/input_tuitionfee'), '565')

WebUI.click(findTestObject('test6/Page_Insert title here (2)/input'))

WebUI.click(findTestObject('test6/Page_Insert title here (2)/td_software cons test'))

WebUI.verifyElementText(findTestObject('test6/Page_Insert title here (2)/td_software cons test'), 'software cons test')

WebUI.closeBrowser()

