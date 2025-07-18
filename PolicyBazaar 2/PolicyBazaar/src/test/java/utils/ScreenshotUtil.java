package utils;

import org.openqa.selenium.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class ScreenshotUtil {
    public static void takeScreenshot(WebDriver driver, String path) throws IOException {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        Files.copy(source.toPath(), new File(path).toPath());
    }
}
