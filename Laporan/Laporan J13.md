# LAPORAN JOBSHEET 13 PRAKTIKUM ALGORITMA DAN STRUKTUR DATA

Dibuat oleh : <p>
Bagus Dwi Putranto <p>
1F D4 Teknik Informatika <p>
2141720079 <p>

## 2.1 Implementasi Binary Search Tree menggunakan Linked List
### 2.1.1 Tahapan Percobaan
<img src="2.1.1 a.PNG"> <p>
<img src="2.1.1 b.PNG"> <p>

1. Buatlah class Node, BinaryTree dan BinaryTreeMain
2. Di dalam class Node, tambahkan atribut data, left dan right, serta konstruktor default dan berparameter. <p>
<img src="2.1.1 2.PNG"> <p>

3. Di dalam class BinaryTree, tambahkan atribut root. <p>
<img src="2.1.1 3.PNG"> <p>

4. Tambahkan konstruktor default dan method isEmpty() di dalam class BinaryTree. <p>
<img src="2.1.1 4.PNG"> <p>

5. Tambahkan method add() di dalam class BinaryTree. Di bawah ini proses 
penambahan node tidak dilakukan secara rekursif, agar lebih mudah dilihat alur 
proses penambahan node dalam tree. Sebenarnya, jika dilakukan dengan proses 
rekursif, penulisan kode akan lebih efisien. <p>
<img src="2.1.1 5.PNG"> <p>

6. Tambahkan method find() <p>
<img src="2.1.1 6.PNG"> <p>

7. Tambahkan method traversePreOrder(), traverseInOrder() dan
traversePostOrder(). Method traverse digunakan untuk mengunjungi dan 
menampilkan node-node dalam tree, baik dalam mode pre-order, in-order 
maupun post-order <p>
<img src="2.1.1 7.PNG"> <p>

8. Tambahkan method getSuccessor(). Method ini akan digunakan ketika proses 
penghapusan node yang memiliki 2 child. <p>
<img src="2.1.1 8.PNG"> <p>

9. Tambahkan method delete(). <p>
<img src="2.1.1 9.PNG"> <p>

Di dalam method delete tambahkan pengecekan apakah tree kosong, dan jika tidak
cari posisi node yang akan di hapus. <p>
<img src="2.1.1 9 2.PNG"> <p>

Kemudian tambahkan proses penghapusan terhadap node current yang telah 
ditemukan. <p>
<img src="2.1.1 9 3.PNG"> <p>

10. Buka class BinaryTreeMain dan tambahkan method main(). <p>
<img src="2.1.1 10.PNG"> <p>

11. Compile dan jalankan class BinaryTreeMain untuk mendapatkan simulasi jalannya 
program tree yang telah dibuat. <p>

12. Amati hasil running tersebut. <p>
<img src="ll.PNG"> <p>

### 2.1.2 Pertanyaan Percobaan
1. Mengapa dalam binary search tree proses pencarian data bisa lebih efektif 
dilakukan dibanding binary tree biasa? <p>
- Jawab = 

2. Untuk apakah di class Node, kegunaan dari atribut left dan right? <p>
- Jawab = untuk menentukan alamat dari leftchild dan rightchild

3. a. Untuk apakah kegunaan dari atribut root di dalam class BinaryTree?
b. Ketika objek tree pertama kali dibuat, apakah nilai dari root?
- a = untuk menentukan root dari sebuah tree
- b = iya, terdapat pada method add(int data), if(isEmpty()) maka root = new node(data)

4. Ketika tree masih kosong, dan akan ditambahkan sebuah node baru, proses apa 
yang akan terjadi? <p>
- Jawab = method add(int data), if(isEmpty()) maka root = new node(data)

5. Perhatikan method add(), di dalamnya terdapat baris program seperti di bawah 
ini. Jelaskan secara detil untuk apa baris program tersebut? <p>
<img src="2.1.2 5.PNG"> <p>
<img src="2.1.2 5 answer.PNG"> <p>

## 2.2 Implementasi binary tree dengan array
### 2.2.1 Tahapan Percobaan

1. Di dalam percobaan implementasi binary tree dengan array ini, data tree 
disimpan dalam array dan langsung dimasukan dari method main(), dan 
selanjutnya akan disimulasikan proses traversal secara inOrder. <p>

2. Buatlah class BinaryTreeArray dan BinaryTreeArrayMain <p>

3. Buat atribut data dan idxLast di dalam class BinaryTreeArray. Buat juga method 
populateData() dan traverseInOrder(). <p>
<img src="2.2.1 3.PNG"> <p>


4. Kemudian dalam class BinaryTreeArrayMain buat method main() seperti gambar 
berikut ini. <p>
<img src="2.2.1 4.PNG"> <p>

5. Jalankan class BinaryTreeArrayMain dan amati hasilnya! <p>
<img src="array.PNG"> <p>

### 13.2.2 Pertanyaan Percobaan

1. Apakah kegunaan dari atribut data dan idxLast yang ada di class 
BinaryTreeArray? <p>
- Jawab = untuk memberi tau index terakhir dari array

2. Apakah kegunaan dari method populateData()? <p>
- Jawab = Untuk menggabungkan array dengan idxlast yaitu sebagai batas maksimal masuknya data

3. Apakah kegunaan dari method traverseInOrder()? <p>
- Jawab = Untuk mentraverse dengan metode inorder

4. Jika suatu node binary tree disimpan dalam array indeks 2, maka di indeks berapakah posisi left child dan rigth child masin-masing? <p>
- Jawab = 4 dan 5

5.  Apa kegunaan statement int idxLast = 6 pada praktikum 2 percobaan nomor 4? <p>
- Jawab = untuk memberi index terakhir pada tree tersebut

### 13.3 Tugas Praktikum

1. Buat method di dalam class BinaryTree yang akan menambahkan node 
dengan cara rekursif. <p>
<img src="13.3 1.PNG"> <p>

2. Buat method di dalam class BinaryTree untuk menampilkan nilai paling kecil 
dan yang paling besar yang ada di dalam tree. <p>
<img src="13.3 2.PNG"> <p>

3. Buat method di dalam class BinaryTree untuk menampilkan data yang ada 
di leaf <p>
<img src="13.3 3.PNG"> <p>

4. Buat method di dalam class BinaryTree untuk menampilkan berapa jumlah 
leaf yang ada di dalam tree. <p>
<img src="13.3 4.PNG"> <p>

5. Modifikasi class BinaryTreeArray, dan tambahkan : <P>
- method add(int data) untuk memasukan data ke dalam tree <p>
- method traversePreOrder() dan traversePostOrder() <p>
<img src="13.3 5.PNG"> <p>