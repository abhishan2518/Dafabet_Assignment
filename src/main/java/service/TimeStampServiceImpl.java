package service;

import com.dafabet.automation.dto.TimeStampDTO;
import io.restassured.http.ContentType;
import org.apache.http.HttpStatus;
import org.springframework.stereotype.Service;
import requests.TimeStampRequest;
import response.TimeStampResponse;
import urls.Endpoints;
import org.springframework.beans.factory.annotation.Autowired;

import static io.restassured.RestAssured.given;

@Service
public class TimeStampServiceImpl implements TimeStampService{
    @Autowired
    TimeStampDTO timeStampDTO;
    public TimeStampResponse getTimeStamp(TimeStampRequest request) {
        return given().log().all().body(request).contentType(ContentType.ANY).
                post(Endpoints.TIMESTAMP+timeStampDTO.getUnixTimeStamp()).then().log().all().
                statusCode(HttpStatus.SC_OK).extract().response().as(TimeStampResponse.class);
    }
}
