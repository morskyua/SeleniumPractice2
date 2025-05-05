package org.epam;

import org.epam.util.WebDriverSingleton;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ReplyToAndDeleteEmailTest extends BaseTest {

    @AfterMethod
    void removeReply() {
        gmailPage.deleteReply();
        WebDriverSingleton.tearDown();
    }

    @Test
    void testReplyAndSave() {
        gmailPage.replyToEmail("DemoReplyText");
        gmailPage.openSentEmails();
        Assert.assertEquals(gmailPage.getEmailSubject().getText(), "DemoEmail");
    }

    @Test
    void testReplyAndVerifyText() {
        gmailPage.replyToEmail("DemoReplyAssertText");
        gmailPage.openSentEmails();
        String actual = gmailPage.getFirstReplyText();
        Assert.assertEquals(actual, "DemoReplyAssertText");
    }
}
