Feature: Kayıtlı bir kullanıcı olarak sitede odemeyi tamamlamadan önce adres bilgilerimi secip yonetebilecegim bir sayfa olmasını istiyorum




  Scenario: Shipping Information sayfasındaki “Delivery” ve “Pick Up” butonlarının görünürlüğü ve aktifliğinin testi.  -  TC 1

    * Ziyaretçi kullanıcı girişi yapar.
    * Kullanıcı istediği ürünleri sepetine ekler ve Shipping Information sayfasına ulaşır.
    * Kullanıcı Pick Up Butonunun görüntüler ve tıklar.
    * Kullanıcı Delivery Butonunu görüntüler ve tıklar.





  Scenario: Shipping Information sayfasında yeni adres ekleme ve Adressi görüntüleme.  -  TC 2

    * Ziyaretçi kullanıcı girişi yapar.
    * Kullanıcı istediği ürünleri sepetine ekler ve Shipping Information sayfasına ulaşır.
    * Kullanıcı Add butonuna tıklar.
    * Kullanıcı ilgili Textboxları doldurur ve seçimleri yapar.
    * Kullanıcı Add Address Butonuna tıklar.
    * Kullanıcı Shipping Information sayfasında oluşturduğu Address’i görüntüler.
