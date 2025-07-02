# 🎨 Gallerist Projesi

Gallerist, sanat galerileri için geliştirilmiş bir içerik yönetim sistemidir. Sanatçılar, eserler ve sergiler kolayca yönetilebilir.

---

## 🚀 Özellikler

- 🖼️ Sanatçı ve eser yönetimi
- 🗂️ Kategorilendirme ve filtreleme
- 🔒 JWT ile güvenli giriş sistemi
- 🌐 Swagger dokümantasyonu

---

## 🛠️ Teknolojiler

| Katman | Teknoloji |
|--------|-----------|
| Backend | Java 17, Spring Boot |
| Veritabanı | PostgreSQL |
| Güvenlik | Spring Security, JWT |
| Dokümantasyon | Swagger/OpenAPI |
| Test | JUnit, Mockito |

---

## 📸 Ekran Görüntüleri

![Ana Sayfa](images/homepage.png)
![Sanatçı Paneli](images/artist-panel.png)

> Not: `/images` klasörünü repo içinde oluşturmalı ve içine görselleri koymalısın.

---

## ⚙️ Kurulum

```bash
# Repoyu klonla
git clone https://github.com/kullanici-adi/proje-adi.git

# Proje dizinine gir
cd proje-adi

# Maven ile çalıştır
./mvnw spring-boot:run
