package com.dafabet.automation.steps;

import com.dafabet.automation.dto.TimeStampDTO;
import com.dafabet.automation.service.TimeStampServiceImpl;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.springframework.beans.factory.annotation.Autowired;
import com.dafabet.automation.requests.TimeStampRequest;
import com.dafabet.automation.response.TimeStampResponse;
import com.dafabet.automation.service.TimeStampService;
import org.testng.Assert;

import java.util.List;

public class TimeStamp {

    @Given("User converts the below Unix timestamp to Date format {string}")
    public void userConvertsTheBelowUnixTimestampToDateFormat(String arg0) {
        TimeStampRequest request = new TimeStampRequest();
        TimeStampServiceImpl service= new TimeStampServiceImpl();
        request.setUnixTimeStamp(arg0);
        String response = service.getTimeStamp(request);
        Assert.assertTrue(response.contains("2016-01-01 02:03:22"));
    }

    @And("User converts the Date format to Unix format {string}")
    public void userConvertsTheDateFormatToUnixFormat(String arg0) {
        TimeStampRequest request = new TimeStampRequest();
        TimeStampServiceImpl service= new TimeStampServiceImpl();
        request.setUnixTimeStamp(arg0);
        String response = service.getTimeStamp(request);
        Assert.assertEquals(response, "1451606400");
    }

    @And("user verifies for invalid timestamp {string}")
    public void userVerifiesForInvalidTimestamp(String arg0) {

        TimeStampRequest request = new TimeStampRequest();
        TimeStampServiceImpl service= new TimeStampServiceImpl();
        request.setUnixTimeStamp(arg0);
        String response = service.getTimeStamp(request);
        Assert.assertFalse(Boolean.parseBoolean(response));
    }
}
