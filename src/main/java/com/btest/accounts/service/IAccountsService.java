package com.btest.accounts.service;

import com.btest.accounts.model.CustomerDto;

public interface IAccountsService {

    void createAccount(CustomerDto customerDto);
    CustomerDto fetchAccount(String mobileNumber);
    boolean updateAccount(CustomerDto customerDto);
    boolean deleteAccount(String mobileNumber);
}
