Feature: Kayıtlı bir  kullanici olarak ana sayfada Women menusune ait kategorileri ve urunleri gorebilmek istiyorum.

  Background:
    * The user goes to the URL pagee.
       #Kullanıcı Url sayfasına gider
    * The user clicks on the profile icon on the sitee.
        #Kullanıcı sitede profil ikonuna tıklar
    * The user logs in by clicking the SignIn button with the correct "emailbeyza" and "passworddbeyza"..
       #SingIn butonundan doğru mail ve password ile giriş yapar

  Scenario: TC01 The user should be able to log in to the site with their email and password.beyza
    * Clicks on the category link



  Scenario: TC02 Women category window and subcategories should be displayed in the body section of the home page.
    * Clicks on the category link
    * The Women category and its subcategories should be visible in the body section.
      #"Women" kategorisi ve alt kategorileri body bölümünde görünür olmalıdır


  Scenario: TC03 "The user selects a desired subcategory on the Women category page and adds a desired product to favorites."
    * Clicks on the category link
    * The user is on the Women category pagee
    #Kullanıcı Kadın kategori sayfasında olmalı
    *  The user selects a product from the listtt
    #Kullanıcı listeden bir ürün seçer
    * The user adds the product to favorites
    # Kullanıcı seçilen ürünü favorilere ekler
   * The user views the product in favoritess
    #Kullanıcı favorilerde ürünü görüntüler


Scenario: TC04 Perform actions on products in Women category
  * Clicks on the category link
  * I select a product
  # Bir ürünü seçiyorum
  * I add the product to the cart
  #Ürünü sepete ekliyorum
  * I view the product details to the cart
  # ürünü sepette görüntüleme

  Scenario: TC05 Verify filter icons are visible and active
    * Clicks on the category link
    * The user is on the Women category pagee
    #Kullanıcı Kadın kategori sayfasında olmalı
    * the filter icons should be active
    #Filtreleme ikonları aktif olmalı

