[# Hayvanat Bahçesi Yönetim Sistemi UML Class Diyagramı

Hayvanat bahçesi yönetim sistemi için UML diyagramı için klasör oluşturuldu. UML dosyası draw.io ile tasarlanıp eklenmiştir.

*Hayvanlar:
Atlar (atlar, zebralar, eşekler vb.),
Kedigiller (kaplanlar, aslanlar vb.),
Kemirgenler (sıçanlar, kunduzlar vb.) gibi gruplardaki türlerle karakterize edilir.
Hayvanlar hakkında depolanan bilgilerin çoğu tüm gruplamalar için aynıdır.
tür adı, ağırlığı, yaşı vb.
Sistem ayrıca her hayvan için belirli ilaçların dozajını alabilmeli => getDosage ()
Sistem Yem verme zamanlarını hesaplayabilmelidir => getFeedSchedule ()
Sistemin bu işlevleri yerine getirme mantığı, her gruplama için farklı olacaktır. Örneğin, atlar için yem verme algoritması farklı olup, kaplanlar için farklı olacaktır.
Polimorfizm modelini kullanarak, yukarıda açıklanan durumu ele almak için bir sınıf diyagramı tasarlayın.*

Bilgileri doğrultusunda çizim oluşturulmuştur.

Zoo ve Animals arasında composition ilişkisi bulunmaktadır.  **composition** ile bağlandı.
Animal **abstract** sınıfı *ile At, Kedi ve Kemirgen sınıfları* arasında  **inheritance** ilişkisi bulunmaktadır.

Draw.io çizimine ait görsel aşağıdaki linke eklenmiştir.

https://drive.google.com/file/d/14GQQBzpHsNJh2Z0PX_7eqjks1jFezkrM/view?usp=sharing