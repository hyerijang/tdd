package com.example.tdd.Bank;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import org.assertj.core.api.Assertions;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    Account account;

    @BeforeEach
    public void setUp() {
        account = new Account(10000);
    }

    @Test
    @DisplayName("계좌 생성")
    public void Test_Account() {
        //생성자 메소드에 대한 테스트 케이스는 작성하
        //는 데 큰 노력이 들지 않기 때문에, 가급적 만드는것이 좋다.
        Account account = new Account(10000);
    }

    @Test
    @DisplayName("잔고 조회")
    public void Test_Account_GetBalance() {
//        if (account.getBalance() != 10000)
//            fail("잔고 : "+account.getBalance());
        assertThat(account.getBalance()).isEqualTo(10000);

        account = new Account(10);
        if (account.getBalance() != 10)
            fail("잔고 : " + account.getBalance());

    }

    @Test
    @DisplayName("잔고 출금")
    public void Test_Account_Withdraw() {
        account.withdraw(10);
        assertThat(account.getBalance()).isEqualTo(10000 - 10);

    }


    @Test
    @DisplayName("잔고 입금")
    public void Test_Account_Deposit() {
        account.deposit(10);
        assertThat(account.getBalance()).isEqualTo(10000 + 10);

    }


}

