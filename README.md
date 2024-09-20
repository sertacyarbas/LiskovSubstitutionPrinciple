# Liskov Substitution Principle (LSP) Uygulama Örneği

Bu proje, S.O.L.I.D prensiplerinden üçüncüsü olan Liskov Substitution Principle (LSP)'yi göstermek için hazırlanmıştır. Proje, LSP'yi ihlal eden bir yapıyı ve bu ilkeye uygun olarak yeniden yapılandırılmış bir yapıyı içermektedir.

## Proje Yapısı

Proje, iki ana klasör altında organize edilmiştir:

- **bad**: LSP'nin ihlal edildiği bir yapıyı temsil eder.
- **good**: LSP prensibine uygun olarak yeniden yapılandırılmış yapıyı temsil eder.

### Klasör ve Dosya Yapısı
![image](https://github.com/user-attachments/assets/f0f70964-85b2-4742-9bf9-76c027642a16)

### Klasörlerin Açıklamaları

- **bad**: Bu klasörde, `BitcoinPayment.java` sınıfı Payment sınıfından türer, ancak iade edebilme yeteneği yoktur ve refund metodu çağırıldığında hata fırlatılır. Bu yapı, LSP'yi ihlal eden bir örnek teşkil eder.
  
- **good**: Bu klasörde, LSP'ye uygun olarak yeniden yapılandırılmış bir yapıyı bulabilirsiniz. İade edebilme yeteneği RefundablePayment abstract sınıfına taşınmıştır. Sadece CreditCardPayment sınıfı bu sınıftan türer.

## Nasıl Çalıştırılır

### LSP İhlali Örneği (bad)

LSP'nin ihlal edildiği yapıyı çalıştırmak için `bad/Application.java` dosyasını çalıştırın.

### LSP'ye Uygun Örnek (good)

LSP prensibine uygun yapıyı görmek için `good/Application.java` dosyasını çalıştırın.

## Neden LSP?

**Liskov Substitution Principle**, nesne yönelimli programlamanın temel prensiplerinden biridir. Bu prensip, alt sınıfların üst sınıfların yerine geçebilmesi ve sistemin beklenmeyen hatalarla karşılaşmadan çalışmaya devam edebilmesini sağlar. LSP'ye uygun yapılar, tip hiyerarşisinde tutarlılık ve güvenlik sağlar, böylece yazılımın esnekliği ve bakımı kolaylaşır. Bu prensibe uyan projeler, daha sağlam, modüler ve hataya karşı dayanıklı yazılımlar geliştirmemize olanak tanır.
