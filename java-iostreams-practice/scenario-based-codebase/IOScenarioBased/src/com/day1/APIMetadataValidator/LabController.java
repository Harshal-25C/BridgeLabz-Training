package com.day1.APIMetadataValidator;

public class LabController {

    @PublicAPI(description = "Get blood test report")
    @RequiresAuth
    public void getBloodTest() {}

    public void deleteTest() {} // Missing annotation
}
