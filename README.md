About this project:

Sistem yang dapat digunakan untuk merekam transaksi data nasabah di bank, dimana terdapat 2 jenis nasabah yaitu individu dan perusahaan. Setiap  nasabah dapat memiliki 1 atau lebih rekening.

Libraries and Tools of this project:
- mysql-connector-java-8.0.26.jar
- sqlite-jdbc-3.36.0.3.jar
- scene builder
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
      #int nasabahID
      #String nama
      #String alamat
    }
    class Individu{
      -long nik
      -long npwp
    }
    class Perusahaan{
      -String nib
    }
    class Rekening{
      -int noRekening;
      -double saldo
      +tambahSaldo(double jumlah)
      +tartikSaldo(double jumlah)
      +double getSaldo()
    }
![mermaid-diagram-20211226134001](https://user-images.githubusercontent.com/81194811/147400976-bdc10f10-14ba-48ca-bd92-356e232643cf.png)

 
- ER Diagram:
  
erDiagram
            Nasabah ||..|| Individu : is
            Nasabah ||--|| Perusahaan : is
            Nasabah ||--|{ Rekening : "has"
            Nasabah {
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
  ![mermaid-diagram-20211226133533](https://user-images.githubusercontent.com/81194811/147400927-fb6b512c-6e30-48ad-b44f-c4132c4c7104.png)


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
![WhatsApp Image 2021-12-26 at 12 39 57](https://user-images.githubusercontent.com/95564115/147400028-615628ef-eeef-452f-88a8-0964513a5fcc.jpeg)


- Perusahaan:
![WhatsApp Image 2021-12-26 at 12 40 03](https://user-images.githubusercontent.com/95564115/147400031-fc15bcf5-e0df-464c-966f-ea6d8d295aed.jpeg)


- Transaksi
![WhatsApp Image 2021-12-26 at 12 40 11](https://user-images.githubusercontent.com/95564115/147400032-c71222f7-6142-49ad-af57-9feec7db9221.jpeg)
![WhatsApp Image 2021-12-26 at 12 40 17](https://user-images.githubusercontent.com/95564115/147400039-a504a502-1aff-4aa0-89ec-6ed11474b119.jpeg)



-------------------------------------------
TOOLS & PROJECT, YOU CAN DOWNLOAD IN LINK HERE !
https://drive.google.com/drive/folders/1_5uDVCLZ19Iaq8ZKq2fuMSCrcbxMd6Kf?usp=sharing
