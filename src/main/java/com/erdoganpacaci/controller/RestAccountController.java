package com.erdoganpacaci.controller;

import com.erdoganpacaci.dto.DtoAccount;
import com.erdoganpacaci.dto.DtoAccountUI;

import java.util.List;

public interface RestAccountController {

    public RootEntity<DtoAccount> saveAccount(DtoAccountUI dtoAccountUI);

    public RootEntity<List<DtoAccount>> getAllAccounts();

    public RootEntity<DtoAccount> updateAccountByAccountNo(Long accountNo, DtoAccountUI dtoAccountUI);

    public RootEntity<Void> deleteAccountByAccountId(Long accountId);

}
