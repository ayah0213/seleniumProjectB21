package com.cybertek.tests.day6_SelectIntroDropDownJAvaFaker;

public class WebOrderJavaFakerPractice {

//    WebDriver driver;
//
//   @BeforeMethod
//    public void openingTests() {
//        driver = WebDriverFActory.getDriver("chrome");
//        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//        //calling my LOGIN Method from WebOrderUtillssClasss
//        WebOrderUtils.loginSmartBear(driver);
//
//    }
//
//    @Test
//    public void test1_link_verifications() {
//        List<WebElement> listOfLinks = driver.findElements(By.xpath("//body//a"));
//        System.out.println("Number of all links in the page: " + listOfLinks.size());
//        // 7.Print out each link text on this page
//        for (
//                WebElement eachlinkText : listOfLinks) {
//            System.out.println("Texts of each link: " + eachlinkText.getText());
//        }
//
//    }
////        //TC #1: Smartbear software link verification
////        // 1.Open browser
////        // 2.Go to website: http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
////        // 3.Enter username: “Tester”
////        WebElement userNAme=driver.findElement(By.xpath("//input[@name='ctl00$MainContent$username']"));
////        userNAme.sendKeys("Tester");
////        // 4.Enter password: “test”
////        WebElement password= driver.findElement(By.xpath("//input[@name='ctl00$MainContent$password']"));
////        password.sendKeys("test");
////        // 5.Click to Login button
////        WebElement loginButton= driver.findElement(By.xpath("//input[@name='ctl00$MainContent$login_button']"));
////        loginButton.click();
//    // 6.Print out count of all the links on landing page
//
//
////    // creating lohibbutton
////    public void loginSmartBear(){
////        WebElement userNAme=driver.findElement(By.xpath("//input[@name='ctl00$MainContent$username']"));
////        userNAme.sendKeys("Tester");
////        // 4.Enter password: “test”
////        WebElement password= driver.findElement(By.xpath("//input[@name='ctl00$MainContent$password']"));
////        password.sendKeys("test");
////        // 5.Click to Login button
////        WebElement loginButton= driver.findElement(By.xpath("//input[@name='ctl00$MainContent$login_button']"));
////        loginButton.click();
////    }
//
//    @Test
//    public void smarteBearOredrsSoftware() throws InterruptedException {
//
//        //TC#2: Smartbearsoftware order placing
//        // 1.Open browser
//        // 2.Go to website: http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
//        // 3.Enter username: “Tester”
//        // 4.Enter password: “test”
//        // 5.Click on Login button
//        // 6.Click on Order
//        WebElement ordersButtonClick = driver.findElement(By.xpath("//a[.='Order']"));
//        ordersButtonClick.click();
//        // 7.Select familyAlbum from product,
//        Select famAlbum = new Select(driver.findElement(By.xpath("//select[@name='ctl00$MainContent$fmwOrder$ddlProduct']")));
//        famAlbum.selectByValue("FamilyAlbum");
//        ThreadSleep.sleepMethod(3000);
//        //set quantity to 2
//        WebElement inputQunatity = driver.findElement(By.name("ctl00$MainContent$fmwOrder$txtQuantity"));
//        inputQunatity.sendKeys(Keys.BACK_SPACE); // deleting current value already in it
//        ThreadSleep.sleepMethod(3000);
//       // inputQunatity.clear();/// delete current inout put new one
//        inputQunatity.sendKeys("2");
//        ThreadSleep.sleepMethod(3000);
//        // 8.Click to “Calculate” button
//        WebElement calculateButton= driver.findElement(By.xpath("//input[@value='Calculate']"));
//        calculateButton.click();
//        ThreadSleep.sleepMethod(3000);
//        // 9.Fill address Info with JavaFaker•Generate: name, street, city, state, zip code
//        // finding each webelement and loocatin them
//        WebElement adressName=driver.findElement(By.name("ctl00$MainContent$fmwOrder$txtName"));
//        WebElement street= driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox2"));
//        WebElement city= driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox3"));
//        WebElement state = driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox4"));
//        WebElement zipCode= driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox5"));
//
//        Faker faker= new Faker();
//        adressName.sendKeys(faker.name().fullName());
//        street.sendKeys(faker.address().streetAddress());
//        city.sendKeys(faker.address().city());
//        zipCode.sendKeys(faker.address().zipCode().replaceAll("-",""));
//        // 10.Click on “visa” radio button
//        WebElement visaRdioButton=driver.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_0"));
//        visaRdioButton.click();
//        //11. Generate card number using JavaFaker
//        WebElement creditCard=driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox6"));
//        creditCard.sendKeys(faker.finance().creditCard().replaceAll("-",""));
//        WebElement expDate= driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox1"));
//        expDate.sendKeys("02/20");
//        // 12.Click on “Process”
//        WebElement processButton= driver.findElement(By.id("ctl00_MainContent_fmwOrder_InsertButton"));
//        processButton.click();
//        // 13.Verify success message “New order has been successfully added.
//        WebElement processButtonText=driver.findElement(By.xpath("  //div[@class='buttons_process']/strong"));
//        String actualText=processButtonText.getText();
//        String expectedText="New order has been successfully added.";
//        Assert.assertEquals(actualText, expectedText);
//    }
//        @AfterMethod
//        public void teardown () throws InterruptedException {
//            ThreadSleep.sleepMethod(3000);
//            driver.close();
//        }

    }
