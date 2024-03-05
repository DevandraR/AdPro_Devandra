Nama : Devandra Reswara Arkananta <br>
NPM  : 2206083552

<details>
  <summary>Modul 1</summary>
  - Reflection 1 <br>
    Agar source code dapat dibaca dengan lebih jelas, maka digunakan beberapa hal seperti nama function yang jelas dan mendefinisikan kegunaannya, contonya seperti fungsi findAll() yang tentunya sesuai namanya digunakan untuk mencari semua produk. Lalu jarak spasi antara baris kode juga penting untuk membuat kode lebih mudah dipisahkan berdasarkan bagiannya, juga posisi dari buka dan tutup kurung ditambahkan jarak juga agar batas dari suatu fungsi atau kelas dapat terlihat. Sekarang bagian yang agak sulit adalah tracking asal dari seluruh class karena jumlahnya, dari nama variable seharusnya sudah terlihat asalnya darimana, jadi mungkin saya butuh latihan lagi untuk mengingat asal dari sebuah object. <br>

  - Reflection 2 <br>
    Setelah mengerjakan unit test, saya merasa bahwa testing harus ditambahkan ke semua aspek dari program tersebut, sehingga jumlah yang dibutuhkan adalah sesuai dengan test case yang dibutuhkan. Untuk code coverage, meskipun sudah 100 persen, belum tentu tidak ada error karena bisa ada bugs. <br>

</details>

<details>
  <summary>Modul 2</summary>
  - Reflection <br>
    Code Quality issue yang saya selesaikan adalah saat edit pada Product model. Yang saya lakukan adalah refactor kode dengan membuat ulang function sehingga code menjadi lebih baik kualitasnya. Pada CI/CD workflows saya, sudah ada workflow untuk code checking yaitu SonarCloud, lalu ada juga workflow untuk continuous integration yang berjalan setiap push code ke repository. Lalu untuk deployment, menggunakan koyeb yang juga akan mendeploy kode setiap ada perubahan pada repository. Jadi menurut saya sistem untuk continuous integration/deployment sudah ada pada project saya ini. <br>

</details>

<details>
  <summary>Modul 3</summary>
  - Reflection <br>
    Principle Solid yang saya implementasikan adalah SRP dan OCP. Saya implementasi SRP karena pada repository, Car dan Product harus dipisahkan pada delete dan updatenya dibuatlah class baru untuk menampungnya. untuk OCP pada controller, dipisahkan juga untuk perbedaan antara link, jadi untuk homepage juga di handle. Menerapkan prinsip-prinsip SOLID seperti SRP dan OCP memberikan keuntungan besar dalam pengembangan perangkat lunak. SRP memisahkan tanggung jawab ke dalam kelas-kelas yang memiliki satu tujuan, meningkatkan maintainability dan testability, serta memfasilitasi reuse. OCP memastikan fleksibilitas dan stabilitas dengan merancang kelas-kelas terbuka untuk perluasan tetapi tertutup untuk modifikasi, memungkinkan penyesuaian tanpa mengganggu bagian yang sudah ada. Dengan demikian, penerapan SRP dan OCP memperkuat kode, menjadikannya lebih mudah dipelihara, diperluas, dan diuji. contohnya adalah kode yang memisahkan tanggung jawab akan lebih mudah dibaca. Ketidakpatuhan terhadap prinsip-prinsip SOLID seperti SRP dan OCP dapat menyebabkan masalah dalam pengembangan perangkat lunak. Ini termasuk kompleksitas kode yang tidak terkendali, ketergantungan yang tinggi antarbagian sistem, serta kesulitan dalam memperluas atau mengubah fitur tanpa merusak fungsionalitas yang sudah ada. Masalah lainnya termasuk duplikasi kode dan kerentanan terhadap bug. Oleh karena itu, penting untuk mematuhi prinsip-prinsip SOLID untuk memastikan desain yang lebih bersih dan kode yang lebih mudah dipelihara. <br>

</details>

<details>
  <summary>Modul 4</summary>
  - Reflection <br>
   <br> Menurut saya, Test driven development atau TDD sangatlah membantu dalam pengembangan aplikasi, karena kita dapat menentukan kriteria yang kita inginkan pada sebuah aplikasi sebelum kita membuatnya secara langsung, jadi sudah ada target yang di tetapkan sebelum kita membuat aplikasi. Jadi pembuatan aplikasi menjadi lebih terarah dan sekaligus langsung mengecek kode yang akan dibuat. Jika testing dibuat setelah development aplikasi, maka kadang testing yang dibuat tidak memenuhi ekspektasi awal karena akan cenderung untuk memenuhi kode yang sudah dibuat. Jadi Testing yang dibuat terlebih dahulu dapat menjadi safeguard dan benchmark terhadap aplikasi agar optimal dan target awal terpenuhi. <br>
  
   <br> Dalam mengevaluasi alur TDD dan tes unit, penting untuk memastikan bahwa prinsip F.I.R.S.T. terpenuhi, termasuk kecepatan, kemandirian, ketepatan, kemampuan untuk memvalidasi diri sendiri, dan ketepatan waktu. Jika ada pelanggaran terhadap prinsip-prinsip ini, perbaikan dapat dilakukan dengan mengurangi ketergantungan, mengontrol variabilitas, meningkatkan organisasi tes, dan mengintegrasikan alat otomatisasi tes. Selain itu, evaluasi alur TDD harus memperhitungkan apakah tes mencakup fungsionalitas yang diinginkan dengan cukup, apakah kode memenuhi kebutuhan tes, dan apakah iterasi dalam TDD membantu meningkatkan desain dan keberlanjutan kode. Jika alur TDD tidak membuktikan kegunaannya, langkah-langkah perbaikan termasuk peninjauan ulang kasus tes, analisis kode, dan refleksi pada konsistensi dalam penerapan TDD.<br>

</details>
