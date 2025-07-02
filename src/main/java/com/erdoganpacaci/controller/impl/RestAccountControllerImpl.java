package com.erdoganpacaci.controller.impl;

import com.erdoganpacaci.controller.RestAccountController;
import com.erdoganpacaci.controller.RestBaseController;
import com.erdoganpacaci.controller.RootEntity;
import com.erdoganpacaci.dto.DtoAccount;
import com.erdoganpacaci.dto.DtoAccountUI;
import com.erdoganpacaci.service.AccountService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/api/account")
public class RestAccountControllerImpl extends RestBaseController implements RestAccountController {

    @Autowired
    private AccountService accountService;



    @PostMapping("/save")
    @Override
    public RootEntity<DtoAccount> saveAccount(@Valid @RequestBody DtoAccountUI dtoAccountUI) {
        return ok(accountService.saveAccount(dtoAccountUI));
    }

    @GetMapping("/getAllAccounts")
    @Override
    public RootEntity<List<DtoAccount>> getAllAccounts() {
        return ok(accountService.getAllAccounts());
    }

    @PutMapping("/update/{accountNo}")
    @Override
    public RootEntity<DtoAccount> updateAccountByAccountNo(@PathVariable(value = "accountNo") Long accountNo,
                                                           @RequestBody DtoAccountUI dtoAccountUI) {
        return ok(accountService.updateAccount(accountNo, dtoAccountUI));
    }

    @DeleteMapping("/delete/{id}")
    @Override
    public RootEntity<Void> deleteAccountByAccountId(@PathVariable(value = "id") Long accountId) {
        return ok(accountService.deleteAccount(accountId));
    }
}
