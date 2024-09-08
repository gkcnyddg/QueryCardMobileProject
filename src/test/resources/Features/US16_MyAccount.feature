Feature: Kayitli bir kullanici olarak sitedeki islemlerimi ve ayarlarimi kontrol etmek icin sitede bana özel bir dashboard sayfasinin olmasini istiyorum.
  Background:
    * The user goes to the URL pagee.
       #Kullanıcı Url sayfasına gider
    * The user clicks on the profile icon on the sitee.
        #Kullanıcı sitede profil ikonuna tıklar
    * The user logs in by clicking the SignIn button with the correct "emailbeyza" and "passworddbeyza"..

       #SingIn butonundan doğru mail ve password ile giriş yapar
  Scenario: Tc01  View summary information and order history

    * The user clicks on the profile icon on the sitee.
   #Kullanıcı profil ikonuna tıklar
    * The user should be on the dashboard page
    # Kullanıcı dashboard sayfasında olmalı
    * And The user navigates to the My Account page
    #Kullanıcı My Account sayfasına gider
    * The My Account page should display summary information
    #My Account sayfasında özet bilgiler görünmelidir


  @beyza
    Scenario: TC2 The order history of the user should be displayed on the My Account page.
      * The user clicks on the profile icon on the sitee.
   #Kullanıcı profil ikonuna tıklar
    * And The user navigates to the My Account page
    #Kullanıcı My Account sayfasına gider
    * The My Account page should display the order history
    # My Account sayfasında sipariş geçmişi görünmelidir