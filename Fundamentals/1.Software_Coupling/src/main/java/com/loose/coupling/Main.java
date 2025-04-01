package com.loose.coupling;

import com.loose.coupling.DataProvider.ApiUserDatabaseProvider;
import com.loose.coupling.DataProvider.UserDataProvider;
import com.loose.coupling.DataProvider.UserDatabaseProvider;
import com.loose.coupling.DataProvider.WebServiceDataProvider;

public class Main {
    public static void main(String[] args) {

     UserDataProvider databaseProvider = new UserDatabaseProvider();
     UserManager userManager = new UserManager(databaseProvider);
     System.out.println(userManager.getUserInfo());


     UserDataProvider webServiceProvider = new WebServiceDataProvider();
     UserManager webServiceManager = new UserManager(webServiceProvider);
     System.out.println(webServiceManager.getUserInfo());

     UserDataProvider apiServiceProvider = new ApiUserDatabaseProvider();
     UserManager apiServiceManager = new UserManager(apiServiceProvider);
     System.out.println(apiServiceManager.getUserInfo());

    }
}