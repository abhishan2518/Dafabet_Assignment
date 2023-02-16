package com.dafabet.automation.service;

import com.dafabet.automation.requests.TimeStampRequest;
import com.dafabet.automation.response.TimeStampResponse;

public interface TimeStampService {
    String getTimeStamp(TimeStampRequest request);
}
