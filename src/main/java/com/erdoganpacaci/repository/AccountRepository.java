package com.erdoganpacaci.repository;

import com.erdoganpacaci.model.Account;
import com.erdoganpacaci.model.GalleristCar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AccountRepository  extends JpaRepository<Account, Long> {

    @Query("SELECT a FROM Account a WHERE a.accountNo = :accountNo")
    Optional<Account> findAccountByAccountNo(@Param("accountNo") Long accountNo);



}


