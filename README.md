# Java Mini Proje - Metot Alıştırmaları

Bu proje, Java dilinde temel **metot tanımlama**, **koşullar**, ve **return değerleri** kullanılarak yazılmış örneklerden oluşmaktadır.  
Program içerisinde farklı senaryolar için metotlar yazılmış ve `main` metodu içinde test edilmiştir.

---

## İçindekiler
1. [Barking Dog](#barking-dog)
2. [Teenage](#teenage)
3. [Cat Playing](#cat-playing)
4. [Area Hesaplama](#area-hesaplama)
5. [Area Cylinder (Çember Alanı)](#area-cylinder-çember-alanı)

---

## 1. Barking Dog
Metot:  
```java
public static boolean shouldWakeUp(boolean isBarking, int clock)
Parametreler:

isBarking: Köpek havlıyor mu?

clock: Saat (0–23 arasında değer almalı)

Kurallar:

Saat geçersiz (<0 veya >23) → false

Köpek havlıyorsa ve saat 8’den önce veya 20’den sonra → true

Diğer durumlar → false

2. Teenage
Metot:

java
Kodu kopyala
public static boolean hasTeen(int firstAge, int secondAge, int thirdAge)
Parametreler: Üç farklı yaş değeri

Kurallar:

Yaşlardan herhangi biri 13–19 aralığında ise → true

Hiçbiri bu aralıkta değilse → false

3. Cat Playing
Metot:

java
Kodu kopyala
public static boolean isCatPlaying(boolean isSummer, int temp)
Parametreler:

isSummer: Yaz mevsimi mi?

temp: Sıcaklık

Kurallar:

Yaz aylarında → kedi 25–45°C aralığında oynar

Yaz değilse → kedi 25–35°C aralığında oynar

Diğer durumlar → false

4. Area Hesaplama
Metot:

java
Kodu kopyala
public static double area(double width, double height)
Parametreler: width, height

Kurallar:

Eğer değerler negatifse → -1

Aksi durumda dikdörtgen alanı → width * height

5. Area Cylinder (Çember Alanı)
Metot:

java
Kodu kopyala
public static double area(double radius)
Parametreler: radius

Kurallar:

Eğer radius < 0 → -1

Aksi durumda daire alanı → radius * radius * Math.PI

Örnek Çalıştırma Çıktısı
Program çalıştırıldığında ekrana aşağıdakine benzer sonuçlar basılır:

sql
Kodu kopyala
---------------------------------------------------- 
Barking Dog
Result 1 true
Result 2 false
Result 3 false
Result 4 false
---------------------------------------------------- 
Teenage
Result 1 true
Result 2 true
Result 3 false
---------------------------------------------------- 
Cat Playing 
Result 1 false
Result 2 false
Result 3 true
---------------------------------------------------- 
Area
Result 1 = 20.0
Result 2 = -1.0
---------------------------------------------------- 
Area Cylinder
Result 1 = 78.53981633974483
Result 2 = -1.0
