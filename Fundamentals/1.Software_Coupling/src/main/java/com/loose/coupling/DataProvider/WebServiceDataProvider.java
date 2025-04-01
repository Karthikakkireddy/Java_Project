package com.loose.coupling.DataProvider;

public class WebServiceDataProvider implements UserDataProvider{

    @Override
    public String getUserDetails() {
        return "User Details from Web Service (Loose Coupling)";
    }
}
