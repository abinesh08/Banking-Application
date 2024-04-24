package com.abiproject.Banking.App.repository;

import com.abiproject.Banking.App.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account,Long> {
}
