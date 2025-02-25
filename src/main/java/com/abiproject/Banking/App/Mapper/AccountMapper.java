package com.abiproject.Banking.App.Mapper;

import com.abiproject.Banking.App.Dto.AccountDto;
import com.abiproject.Banking.App.entity.Account;

public class AccountMapper {

    public static Account mapToAccount(AccountDto accountDto){
        Account account=new Account(accountDto.getId(), accountDto.getAccountHolderName(),
                accountDto.getBalance());
        return account;
    }

    public static AccountDto mapToAccountDto(Account account){
        AccountDto accountDto= new AccountDto(account.getId(),account.getAccountHolderName(),
                account.getBalance());
        return accountDto;
    }
}
