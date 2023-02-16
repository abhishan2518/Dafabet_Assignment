package com.dafabet.automation.service;

import com.dafabet.automation.dto.TimeStampDTO;
import io.restassured.http.ContentType;
import org.apache.http.HttpStatus;
import org.springframework.stereotype.Service;
import com.dafabet.automation.requests.TimeStampRequest;
import com.dafabet.automation.response.TimeStampResponse;
import com.dafabet.automation.urls.Endpoints;
import org.springframework.beans.factory.annotation.Autowired;

import static io.restassured.RestAssured.given;

@Service
public class TimeStampServiceImpl implements TimeStampService{

    public String getTimeStamp(TimeStampRequest request) {
        return given().log().all().contentType(ContentType.ANY).
                get(Endpoints.TIMESTAMP+request.getUnixTimeStamp()).then().log().all().
                statusCode(HttpStatus.SC_OK).extract().response().asString();
    }
}
