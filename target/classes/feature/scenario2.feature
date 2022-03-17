Feature: Transfer money, a lot of money.

  Scenario: Transfer money from current account to saving account
    Given I have 10000 on currentAccount
    And I have 1000 on savingAccount
    When I transfer 500 from currentAccount
    Then Transfer was executed
    And Statement appear "a lot of money"

  Scenario Outline: Transfer money from current account to saving account
    Given I have <current_ac> on currentAccount
    And I have <saving_ac> on savingAccount
    When I transfer <howMuchTransfer> from currentAccount
    Then Transfer was executed
    And Statement appear <what_statement>
    Examples:
      | current_ac | saving_ac | howMuchTransfer | what_statement |
      |10000       |1000       |500              |"String1"       |
      |1500        |1500       |1200             |"String2"       |




