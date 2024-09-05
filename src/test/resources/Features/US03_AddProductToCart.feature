Feature:
@Melike
  Scenario: As a user, I want to browse the products without having to register on the site.
    Given Open the application.
    # Uygulamayı aç.

  Then Verify that the product listing section is visible on the homepage.
    # Anasayfada ürün listeleme alanının görünür olduğunu doğrula.

  Then Click on a product to navigate to the product detail page.
    # Bir ürüne tıklayarak ürün detay sayfasına git.

  And Verify that the product details (name, price, description, image) are displayed correctly.
    # Ürün detaylarının (isim, fiyat, açıklama, resim) doğru görüntülendiğini doğrula.

  Scenario: I should be able to review the products, select the product and add it to the cart without registering.
    Given Open the application.
    # Uygulama açılır

    Then Click on a product to navigate to the product detail page.
    # Bir ürüne tıklayarak ürün detay sayfasına git.

    Then The user adds the product to the cart
    # Kullanıcı ürünü sepete ekler

    And The product is successfully added to the cart
    # Ürün başarıyla sepete eklenir
