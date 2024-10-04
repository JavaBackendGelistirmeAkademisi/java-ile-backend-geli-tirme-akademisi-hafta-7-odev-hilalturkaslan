[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/pDA8nEN2)
**Ödev Konusu: Freelancer Matching Platform Geliştirme**

Bir Freelancer Matching Platform (Serbest Çalışan Eşleştirme Platformu) geliştirin. Bu platformda işverenler projeler oluşturabilir, freelancer'lar bu projelere teklif verebilir. Uygulama, kullanıcıların proje ve teklif yönetimini kolaylaştırırken aynı zamanda güvenilir ve hatasız bir deneyim sunmalıdır. Bu proje sayesinde öğrendiklerinizi uygulayarak kapsamlı bir backend sistemi geliştireceksiniz.

**Projenin Gereksinimleri:**

1.  **Veritabanı Tasarımı ve JDBC Bağlantısı:**

-   RDBMS (MySQL, PostgreSQL) veya NoSQL (MongoDB) veritabanı kullanarak bir veri modeli oluşturun. Bu modelde kullanıcılar (freelancer ve işveren), projeler, teklifler ve ödeme bilgileri gibi tablolar yer almalıdır.
-   Java ile JDBC bağlantısını kurun ve veritabanı üzerinde gerekli tabloları oluşturun.
-   Kullanıcı, proje ve teklif CRUD işlemleri için PreparedStatement ve CallableStatement kullanın.

3.  **Hata Yönetimi ve Transaction Yönetimi:**

-   Kullanıcı işlemleri sırasında oluşabilecek hataları yönetin. Örneğin, negatif teklif tutarları veya eksik proje açıklamaları gibi durumları kontrol edin ve bu hataları kullanıcılara uygun mesajlarla iletin.
-   Transaction yönetimi kullanarak, örneğin bir proje için teklif verildiğinde işlem bütünlüğünü sağlayın. Teklif verirken freelancer'ın bakiyesinin düşmesi ve işlemin sorunsuz tamamlanması sağlanmalıdır.

5.  **RESTful API Geliştirme:**

-   Spring Boot kullanarak bir RESTful API oluşturun. Bu API, kullanıcıların proje oluşturması, projelere teklif vermesi ve teklifleri görüntülemesi için gerekli işlemleri sağlamalıdır.
-   API üzerinden projelerin listelenmesi, tekliflerin yönetilmesi ve kullanıcı işlemlerinin yapılması sağlanmalıdır.

7.  **Uygulama Testi ve Dokümantasyon:**

-   Geliştirdiğiniz API'yi test etmek için Postman veya Swagger kullanarak tüm endpoint'lerin doğru çalıştığını kontrol edin.
-   Projenin kurulumunu, kullanılan endpoint'leri ve test sonuçlarını içeren bir dokümantasyon oluşturun.

**Teslim Edilecekler:**

-   Çalışan bir Spring Boot uygulaması
-   Veritabanı bağlantısı ve CRUD işlemlerini içeren Java kodları
-   Hata ve transaction yönetimini içeren örnek kod blokları
-   Postman veya Swagger ile test edilebilir durumda olması
-   Uygulamayı dockerize etme (opsiyonel)
