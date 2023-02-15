import com.dafabet.automation.dto.TimeStampDTO;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.springframework.beans.factory.annotation.Autowired;
import requests.TimeStampRequest;
import response.TimeStampResponse;
import service.TimeStampService;

import java.util.List;

public class TimeStamp {
    @Autowired
    TimeStampService timeStampService;
    @Given("User converts the below Unix timestamp to Date format")
    public void userConvertsTheBelowUnixTimestampToDateFormat(List<TimeStampDTO> dto) {
        for (TimeStampDTO dtos : dto) {

            TimeStampRequest request = new TimeStampRequest();
            request.setUnixTimeStamp(dtos.getUnixTimeStamp());
            TimeStampResponse response=timeStampService.getTimeStamp(request);
        }
    }

    @And("User converts the Date format to Unix format")
    public void userConvertsTheDateFormatToUnixFormat() {
    }

    @And("user verifies for invalid timestamp")
    public void userVerifiesForInvalidTimestamp() {
    }
}
