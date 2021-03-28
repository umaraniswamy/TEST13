Feature: A preson from Wales

  Scenario Outline: Testing
    Given A person navigate to the url "https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/start"
    Then  The person should be navigated to Start Page
    When  The person click on Start button
    Then  The person select "<COUNTRY>" on where-you-live page and click next
    And   The person enter "<DOB>" and click next
    And   The person select option "<LIVEWITHPARTNER>" on live with partner page and click next
    And   The person select option "<CLAIM_BENEFIT>" on claim-benefits-tax-credits page and click next
    And   The person select option "<UNIVERSAL_CREDITS>" on paid-universal-credit page and click next
    And   The person click next button on  awaiting-universal-credit page
    And   The person select "<UNIVERSAL_BENEFITS>" on benefits page and click next
    And   The person select option "<TAX_TYPE>" on tax-credit-type page and click next
    And   The person select option "<TAX_CREDIT_INCOME>" on tax-credit-income page and click next
    And   The person select option "<EMPLOYMENT_ALLOWANCE>" on employment-support-allowance-type page and click next
    And   The person select option "<JOBSEEKER_ALLOWANCE>" on jobseekers-allowance-type page and click next
    And   The person select option "<UNIVERSAL_CREDIT_CLAIM>" on universal-credit-claim page and click next
    And   The person select option "<UNIVERSAL_TAKE_HOME_PAY>" on universal-credit-take-home-pay page and click next
    And   The person select option "<PREGNANT_OR_GIVE_BIRTH>" on pregnant-or-given-birth page and click next
    And   The person select option "<WAR_PENSIONER>" on war-pensioner page and click next
    And   The person select option "<DIABETES>" on diabetes page and click next
    And   The person select option "<GLAUCOMA>" on glaucoma page and click next
    And   The person select option "<CARE_HOME>" on care-home page and click next
    And   The person select option "<LOCAL_COUNSIL_ASSESSED>" on local-council-assessed and click next
    And   The person select option "<SAVINGS>" on savings page and click next
    Then  The person get help with NHS costs

    Examples:
      | COUNTRY | DOB        | LIVEWITHPARTNER | CLAIM_BENEFIT | UNIVERSAL_CREDITS | UNIVERSAL_BENEFITS | TAX_TYPE | TAX_CREDIT_INCOME | EMPLOYMENT_ALLOWANCE | JOBSEEKER_ALLOWANCE | UNIVERSAL_CREDIT_CLAIM | UNIVERSAL_TAKE_HOME_PAY | PREGNANT_OR_GIVE_BIRTH | WAR_PENSIONER | DIABETES | GLAUCOMA | CARE_HOME | LOCAL_COUNSIL_ASSESSED | SAVINGS |
     # | WALES   | 10-09-1980 | YES             | YES           | NO              |  YES,NO,NO,YES,NO,NO |  CHILD TAX |     YES       |                     |                |                      |                   |     YES               |      NO     |  YES  |   NO   |  YES       |      YES           |       |

    #  | WALES   | 10-09-1980 | YES             | YES           | NO              |  YES,YES,NO,NO,NO,NO |  CHILD TAX |     YES       |                     |                |                      |               |     YES               |      NO     |  YES  |   NO   |  YES       |      YES           |       |
    #  | WALES   | 10-09-1980 | YES             | YES           | NO               |  NO,NO,NO,NO,NO,NO   |           |               |                     |                |                      |         |     NO               |      NO     |  YES  |   NO   |  YES       |      YES           |       |
     # | WALES   | 10-09-1980 |    YES             |  YES          | YES            |                    |           |                  |YES                 |YES              |                 |                       |          |             |       |         |         |                      |        |
     # | WALES   | 10-09-1980 |    YES             |   YES         | YES              |                    |          |               | YES              |                   |      |NO                      |NO                 |     NO      | NO    |  NO     | NO       |                     |    YES  |
     # | WALES   | 10-09-1980 |     NO             |   NO          |                  |                   |           |              |              |                        |                      |          |YES                |    YES      | YES   |  NO     | NO       |                     |    YES  |
      | WALES   | 10-09-1980 | NO              | NO            |                   |                    |          |                   |                      |                     |                        |                         | YES                    | YES           | YES      | NO       | YES       | YES                    |         |






