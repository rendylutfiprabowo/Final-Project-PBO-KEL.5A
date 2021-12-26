About this project:

Sistem yang dapat digunakan untuk merekam transaksi data nasabah di bank, dimana terdapat 2 jenis nasabah yaitu individu dan perusahaan. Setiap  nasabah dapat memiliki 1 atau lebih rekening.

Libraries and Tools of this project:
- mysql-connector-java-8.0.26.jar
- sqlite-jdbc-3.36.0.3.jar
- scene builder
- sqlite studio
- xampp (mysql server)
- netbean editor
-------------------------------------------

Contributor of Kelompok 5:
- Muhammad Faiz - 2017051007
- Rendy Lutfi Prabowo - 2017051053
- Indah Nirmala Zahra Nabil - 2057051004

-------------------------------------------

Kelompok 5's work divisions:

Muhammad Faiz Handle:
- NasabahFormController.java
- Design Diagram
- Error Handling
- Design NasabahForm.fxml

Rendy Lutfi Prabowo Handle:
- Individu.java
- Perusahaan.java
- Rekening.java
- Utama.java
- DBHelper.java

Indah Nurmala Zahra Nabil Handle:
- Nasabah.java
- NasabahDataModel.java

-------------------------------------------

Design -> make with mermaid.live
- Class Diagram:

classDiagram
  Nasabah <|-- Individu
  Nasabah <|-- Perusahaan
  Nasabah "1"--o"*" Rekening : has
    
  
  class Nasabah{
    <<abstract>>
    #IntegerProperty nasabahID
    #StringProperty nama
    #StringProperty alamat
  }
  class Individu{
    -LongProperty nik
    -LongProperty npwp
  }
  class Perusahaan{
    -StringProperty nib
  }
  class Rekening{
    -IntegerProperty noRekening;
    -DoubleProperty saldo
    +tambahSaldo(double jumlah)
    +tartikSaldo(double jumlah)
    +double getSaldo()
  }
 ![Class Diagram](https://user-images.githubusercontent.com/81194811/147399231-687454cc-5c77-47ba-8e65-22eb7afc826b.png)
 
- ER Diagram:
 erDiagram
            Nasbaah ||..|| Individu : is
            Nasbaah ||--|| Perusahaan : is
            Nasbaah ||--|{ Rekening : "has"
            Nasbaah {
                int NasabahID
                string nama
                string alamat
            }
            Individu{
                lomg nik
                long npwp
            }
            Perusahaan{
                string nib
            }
            Rekening{
                int noRekening
                double saldo
            }
 ![ER Diagram](https://user-images.githubusercontent.com/81194811/147399256-5eef30a0-6ba0-4403-b364-68202b3e02d5.png)

- Class Diagram for JavaFX and Database:
 classDiagram

  Nasabah <|-- Individu
  Nasabah <|-- Perusahaan
  Nasabah "1"--o"*" Rekening : has
  Nasabah o-- NasabahDataModel : Data Modeling
  NasabahDataModel <-- NasabahFormController : Data Control
  NasabahDataModel --> DBHelper : DB Connection
  NasabahFormController <.. NasabahForm : Form Control
  class Nasabah{
    <<abstract>>
    #IntegerProperty nasabahID
    #StringProperty nama
    #StringProperty alamat
  }
  class Individu{
    -LongProperty nik
    -LongProperty npwp
  }
  class Perusahaan{
    -StringProperty nib
  }
  class Rekening{
    -IntegerProperty noRekening;
    -DoubleProperty saldo
    +tambahSaldo(double jumlah)
    +tartikSaldo(double jumlah)
    +double getSaldo()
  }
  class NasabahDataModel{
      Connection conn
      addNasabah()
      addRekening()
      getIndividu()
      getPerusahaan()
      nextNasabahID()
      nextNoRekening()
  }

  class NasabahFormController{
      initialize()
      handleButtonAddRekening()
      handleButtonAddNasabah()
      loadDataIndividua()
      loadDataPerusahaan()
      loadDataRekening()
      handleClearForm()
  }
  class DBHelper{
      - String USERNAME
      - String PASSWORD
      - String DB
      getConnection()
      getConnection(String driver)
      createTable();
  }
 ![Class Diagram for JavaFX and Database ](https://user-images.githubusercontent.com/81194811/147399248-b66d4ceb-f417-481a-a55e-22e4dddd1cac.png)

-------------------------------------------

Result:
Terkoneksi ke Database

- Individu:
![WhatsApp Image 2021-12-26 at 12 28 09](https://user-images.githubusercontent.com/95564115/147399791-ac483933-c32c-4954-9574-e5653acd9ca1.jpeg)

- Perusahaan:
![WhatsApp Image 2021-12-26 at 12 30 55](https://user-images.githubusercontent.com/95564115/147399854-f10af43a-74f0-4d15-8ace-411c504285b8.jpeg)

- Transaksi
![WhatsApp Image 2021-12-26 at 12 30 59](https://user-images.githubusercontent.com/95564115/147399863-9530e351-5204-47b0-abc7-69f86ff72b06.jpeg)
![WhatsApp Image 2021-12-26 at 12 31 04](https://user-images.githubusercontent.com/95564115/147399867-310cdaa3-0070-4914-a748-813e0257da1d.jpeg)


-------------------------------------------
