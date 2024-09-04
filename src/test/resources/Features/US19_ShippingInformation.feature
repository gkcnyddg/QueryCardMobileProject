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



  Scenario: Shipping Information sayfasında Herhangi bir Address’i düzenleme.  -  TC 3

    * Ziyaretçi kullanıcı girişi yapar.
    * Kullanıcı istediği ürünleri sepetine ekler ve Shipping Information sayfasına ulaşır.
    * Kullanıcı Edit Butonuna Tıklar ve Address Sayfasına ulaşır.
    * Kullanıcı Adres Kartının üzerindeki yeşil yuvarlak butona tıklar.
    * Kullanıcı Güncellemek istediği bilgileri değiştirir ve Update Address Butonuna Tıklar.




  Scenario: Shipping Information sayfasında Herhangi bir Address’i Silme.  -  TC 4

    * Ziyaretçi kullanıcı girişi yapar.
    * Kullanıcı istediği ürünleri sepetine ekler ve Shipping Information sayfasına ulaşır.
    * Kullanıcı Edit Butonuna Tıklar ve Address Sayfasına ulaşır.
    * Kullanıcı Adres Kartının üzerindeki kırmızı yuvarlak butona tıklar.
    * Kullanıcı Are you sure you want to delete? yazısını görüntüler ve delete butonuna tıklar.



  Scenario: Shipping Information sayfasında Order Summary ve altındaki Subtotal, Tax, Shipping Charge, Discount, Total görüntüleme.  -  TC 5

    * Ziyaretçi kullanıcı girişi yapar.
    * Kullanıcı istediği ürünleri sepetine ekler ve Shipping Information sayfasına ulaşır.
    * Kullanıcı Order Summary’i ve altındaki Subtotal, Tax, Shipping Charge, Discount, Total’i görüntüler.



  Scenario: Shipping Information sayfasındaki “Save & Pay” Butonunun Görüntülenebiliriği ve Aktifliği testi.  -  TC 6

    * Ziyaretçi kullanıcı girişi yapar.
    * Kullanıcı istediği ürünleri sepetine ekler ve Shipping Information sayfasına ulaşır.
    * Kullanıcı Shipping Address’ini seçer.
    * Kullanıcı Save & Pay Butonunu Görüntüler ve Tıklar.