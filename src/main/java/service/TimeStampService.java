package service;

import requests.TimeStampRequest;
import response.TimeStampResponse;

public interface TimeStampService {
    TimeStampResponse getTimeStamp(TimeStampRequest request);
}
