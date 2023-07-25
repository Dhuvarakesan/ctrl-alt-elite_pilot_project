package stepdefinition_2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Repository_2 {
	@FindBy(xpath = "//input[@formcontrolname='principal']")
    public static WebElement username;
    @FindBy(xpath = "//input[@placeholder='Password']")
    public static WebElement password;
    @FindBy(css = "button.btn.d-flex")
    public static WebElement submit;
    @FindBy(id = "menu_banking")
    public static WebElement banking;
    @FindBy(xpath = "//div[text()='Member account']")
    public static WebElement memberAccount;
    @FindBy(xpath = "//div[@class='row no-gutters']/div[4]")
    public static WebElement availabeBalance;
    @FindBy(id = "notifications-link")
    public static WebElement notification;
    @FindBy(xpath = "//table[@class='table table-hover cursor-pointer']/tbody/tr[5]")
    public static WebElement recentTransaction;
    @FindBy(className = "bi bi-printer")
    public static WebElement print;
    @FindBy(xpath = "//*[@class='bi bi-funnel']")
    public static WebElement showFilter;
    @FindBy(xpath = "//button[contains(@class,'btn btn-icon ml-2')]")
    public static WebElement userTOSearch;
    @FindBy(xpath = "(//div[@class=\"mb-2\"])[1]")
    public static WebElement selectContact;
    @FindBy(xpath = "(//div[contains(@class,'w-100 mw-100')])[1]")
    public static WebElement periodDropDrown;
    // list of elements in dropdown
    @FindBy(linkText = "Last month")
    public static WebElement listOfPeriod;
    @FindBy(xpath = "//div[text()='No options selected']")
    public static WebElement filter;
    @FindBy(xpath = "//*[@id=\"dropdown-menu-id_4\"]/div[1]/label")
    public static WebElement memberPayment;
    @FindBy(xpath = "(//input[contains(@class,'form-control w-100')])[1]")
    public static WebElement description;
    @FindBy(xpath = "(//button[contains(@class,'form-control text-left')]//div)[3]")
    public static WebElement direction;
    @FindBy(linkText = "Outgoing")
    public static WebElement outGoing;
    @FindBy(xpath = "//span[text()='Transaction number']/following::input")
    public static WebElement transactionNumber;
    @FindBy(xpath = "//div[text()='Date (newest first)']")
    public static WebElement orderBy;
    @FindBy(xpath = "//a[contains(text(),'Amount (lowest first)')]")
    public static WebElement listOfOrderBy;
    @FindBy(xpath = "(//div[@class='input-group']//input)[2]")
    public static WebElement enterToAmount;
    @FindBy(xpath = "//div[@class='title-text flex-grow-1 d-flex align-items-center']")
    public static WebElement transferDetails;
    @FindBy(xpath = "(//td[@class='avatar']/following-sibling::td)[1]")
    public static WebElement AnyOneAccountSummery;
    @FindBy(xpath = "(//button[@type='button'])[3]")
    public static WebElement PrintButton;
}
	
	
//	@FindBy(xpath = "//input[@type=\"text\"]")
//	public static WebElement username;
//	@FindBy(xpath = "//input[@class=\"form-control ng-untouched ng-pristine ng-valid\"]")
//	public static WebElement password;
//	@FindBy(xpath = "//button[@class=\"btn d-flex justify-content-center align-items-center w-100 h-100 btn-primary btn-action-primary\"]")
//	public static WebElement submit_btn;
//	@FindBy(xpath = "(//div[@class=\"menu-text\"])[2]")
//	public static WebElement bankingMenu;
//	@FindBy(xpath = "(//div[@class=\"nav-item-text\"])[1]")
//	public static WebElement memberAccount;
//	@FindBy(xpath = "(//div[@class=\"status-value col-6 col-sm-3 positive\"])[2]")
//	public static WebElement availableBalance;
//	@FindBy(xpath = "(//a[@class=\"nav-item menu-item density-custom\"])[3]")
//	public static WebElement notification;
//	@FindBy(xpath = "//td[text()='An advertisement matches your interest with title price.']")
//	public static WebElement accountSummary;
//	@FindBy(css =  "(//button[@class=\"btn\"])[1]")
//	public static WebElement print_btn;
//	@FindBy(xpath = "button[class=\"btn\"]")
//	public static WebElement showFilter_btn;
//	@FindBy(css = "button[class=\"btn btn-icon ml-2\"]")
//	public static WebElement contactList_btn;
//	@FindBy(xpath = "(//div[@class=\"mb-2\"])[1]")
//	public static WebElement selectContact_btn;
//	@FindBy(xpath = "(//div[@class=\"w-100 mw-100 text-truncate pr-3\"])[1]")
//	public static WebElement periodMenu;
//	@FindBy(css = "a[class=\"select-option undefined level0\"]")
//	public static WebElement periodMenu_clk;
//	@FindBy(css = "input[class=\"form-control w-100 ng-pristine ng-valid ng-touched\"]")
//	public static WebElement descriptionMenu;
//	@FindBy(xpath = "(//input[@class=\"form-control text-right ng-untouched ng-pristine ng-valid\"])[1]")
//	public static WebElement fromamountMenu;
//	@FindBy(xpath = "(//div[@class=\"w-100 mw-100 text-truncate pr-3\"])[2]")
//	public static WebElement filterMenu;
//	@FindBy(xpath = "(//label[@class=\"custom-control-label\"])[1]")
//	public static WebElement filterMenu_clk;
//	@FindBy(xpath = "(//div[@class=\"w-100 mw-100 text-truncate pr-3\"])[3]")
//	public static WebElement directionMenu;
//	@FindBy(css = "a[class=\"select-option mt-1 selected\"]")
//	public static WebElement directionMenu_clk;
//	@FindBy(css = "input[class=\"form-control w-100 ng-pristine ng-valid ng-touched\"]")
//	public static WebElement transactionMenu;
//	@FindBy(xpath = "(//div[@class=\"w-100 mw-100 text-truncate pr-3\"])[4]")
//	public static WebElement orderbyMenu;
//	@FindBy(xpath = "(//a[@class=\"select-option undefined level0 selected\"])[2]")
//	public static WebElement orderbyMenu_clk;
//	@FindBy(xpath = "(//input[@class=\"form-control text-right ng-untouched ng-pristine ng-valid\"])[2]")
//	public static WebElement toamountMenu;
//	@FindBy(xpath = "(//a[@class=\"negative\"])[1]")
//	public static WebElement Amount;




