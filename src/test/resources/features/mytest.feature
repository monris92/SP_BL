Feature: google landing page

  @registerPage
  Scenario: system display page register
    Given Open the chrome and navigate register page
    When system display register page
    Then field regist no phone or email
    And button daftar
    And button register with facebook
    And button register with google
    And text on page register with word
      | text1 | Daftar dulu, yuk  |
      | text2 | Bisa juga pakai   |
      | text3 | Sudah punya akun? Login |
      | text4 | Login             |



  @LoginPage
  Scenario: system display page login
    Given Open the chrome and navigate login page
    When system display login page
    Then field login no phone or email
    And button lanjut
    And button login with facebook
    And button login with google
    And text on page login with word
      | text1 | Login dulu, yuk  |
      | text2 | Atau login pakai   |
      | text3 | Belum punya akun? Daftar |
      | text4 | Daftar                  |
