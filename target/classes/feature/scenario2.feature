Feature: Transfer money, a lot of money.

Scenario: Transfer money from current account to saving account
  Given I have 10000 on currentAccount
  And I have 1000 on savingAccount
  When I transfer 500 from currentAccount
  Then Transfer was executed
  And Statement appear a lot of money


