package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public class BaseTestReport {

    protected WebDriver driver;

    protected ExtentReports extentReports; //raporlama işlemini gerçekleştirir

    protected ExtentHtmlReporter extentHtmlReporter; //raporu HTMl olrak düzenler

    protected ExtentTest extentTest; //testimizin pass veya fail olduğunu saklaayan obje.
    //ekran görüntüleri için de kullanılır

    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        //extent report objeleri de oluşturuyoruz
        extentReports=new ExtentReports();

        //kaydedeceğiniz dosya için tarih stringi oluşturuldu
        String currentDate=new SimpleDateFormat("yyyy_MM_dd_hh_mm_ss").format(new Date());

        String filePath=System.getProperty("user.dir")+"/test-output/reports/testReport_"+currentDate+".html";

        //HTML raporu oluşturacak obje dosya yoluyla initialize edildi
        extentHtmlReporter=new ExtentHtmlReporter(filePath);

        //raporlama yapan extentereport objemize HTML reporter bağlandı
        extentReports.attachReporter(extentHtmlReporter);

        //rapor ile alakalı extra opsiyonel bilgiler verildi
        extentReports.setSystemInfo("Environment","QA");
        extentReports.setSystemInfo("Browser","Chrome");

        //HTML raporunda görüntülemek istedğimz configurasyonlar yapıldı
        extentHtmlReporter.config().setDocumentTitle("CWReport");
        extentHtmlReporter.config().setReportName("Test run report");

    }

    @After
    public void teardown(){
        driver.quit();
        extentReports.flush();

    }














}
