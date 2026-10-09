# Latihan Pewarisan (Inheritance) Java: Bentuk, Bujursangkar, Lingkaran, Silinder

Tugas Pemrograman Berorientasi Objek yang menerapkan konsep *pewarisan (inheritance), **enkapsulasi, dan **method overriding* di Java.

## Hierarki Kelas


Bentuk
├── BujurSangkar
└── Lingkaran
    └── Silinder


| Kelas | Induk | Atribut | Method utama |
|---|---|---|---|
| Bentuk | - | warna | getWarna(), setWarna(), printInfo() |
| BujurSangkar | Bentuk | sisi | getSisi(), setSisi(), hitungLuas(), printInfo() |
| Lingkaran | Bentuk | radius, PHI (konstanta) | getRadius(), setRadius(), hitungLuas(), printInfo() |
| Silinder | Lingkaran | tinggi | getTinggi(), setTinggi(), hitungVolume(), printInfo() |

## Rumus

- Luas bujursangkar = sisi × sisi
- Luas lingkaran = PHI × radius × radius (PHI = 3.14159265359)
- Volume silinder = luas alas × tinggi = hitungLuas() × tinggi

## Struktur File


.
├── Bentuk.java
├── BujurSangkar.java
├── Lingkaran.java
├── Silinder.java
├── Main.java
└── README.md


> Nama file harus sama dengan nama class public di dalamnya (misalnya Main.java untuk public class Main).

## Prasyarat

- *JDK* (bukan hanya JRE) versi 8 atau lebih baru.
- Cek dengan:
  
  javac -version
  java -version
  

## Cara Menjalankan

1. Buka terminal (CMD atau PowerShell) di folder proyek:
   
   cd "path\ke\folder\proyek"
   
2. Compile semua file:
   
   javac *.java
   
3. Jalankan program:
   
   java Main
   

### Jika muncul UnsupportedClassVersionError

Artinya javac dan java di komputer berasal dari versi JDK yang berbeda. Solusi cepat, compile untuk Java 8:


javac --release 8 *.java
java Main


Solusi permanen: pastikan folder bin JDK yang baru berada paling atas di PATH, lalu buka ulang terminal. Cek dengan where java.

## Contoh Output


Bujursangkar berwarna Biru, luas = 49.0
Warna: Biru
Luas: 49.0

Lingkaran berwarna Kuning, luas = 50.26548245743669
Warna: Kuning
Luas: 50.26548245743669

Silinder warna Putih, volume = 62.83185307179586
Warna: Putih
Tinggi: 5.0
Radius: 2.0
Volume: 62.83185307179586


## Konsep yang Diterapkan

- *Inheritance*: BujurSangkar dan Lingkaran mewarisi Bentuk; Silinder mewarisi Lingkaran.
- *Enkapsulasi*: atribut dibuat private dan diakses lewat getter/setter.
- *Method overriding*: printInfo() ditimpa di setiap subclass dengan anotasi @Override.
- *Pemanggilan constructor induk*: memakai super(...).
- *Konstanta*: PHI dideklarasikan private static final.

## Identitas

- Nama: MIFTAHURRAHMAN
- NIM: F1D02510074
- Mata Kuliah: Pemrograman Berorientasi Objek
