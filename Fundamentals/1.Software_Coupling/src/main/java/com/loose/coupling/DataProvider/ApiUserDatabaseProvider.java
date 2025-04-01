package com.loose.coupling.DataProvider;

public class ApiUserDatabaseProvider implements UserDataProvider {
    @Override
    public String getUserDetails() {
        return "User Details from API DB  provider (Loose Coupling)";
    }
}
