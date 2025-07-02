package com.erdoganpacaci.service;

import com.erdoganpacaci.dto.DtoAccount;
import com.erdoganpacaci.dto.DtoAccountUI;

import java.util.List;

public interface AccountService {

    public DtoAccount saveAccount(DtoAccountUI dtoAccountUI);

    public List<DtoAccount> getAllAccounts();

    public DtoAccount updateAccount(Long accountNo, DtoAccountUI dtoAccountUI);
    public Void deleteAccount(Long accountId);
}
