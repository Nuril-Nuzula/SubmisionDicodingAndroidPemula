package com.nna.submisiondicodingandroidpemula.Data

import com.nna.submisiondicodingandroidpemula.Model.tumbuhan
import com.nna.submisiondicodingandroidpemula.R

object DataTumbuhan {

    private val Nama = arrayOf(
        "Asam Jawa",
        "Bambu",
        "Bonsai",
        "Kaktus",
        "Kersen",
        "Ketapang Kencana",
        "Mahoni",
        "Mangga",
        "Pakis",
        "Pucuk Merah"
    )

    private val Harga = arrayOf(
        "125.000",
        "68.500",
        "384.000",
        "173.800",
        "93.000",
        "73.000",
        "354.000",
        "87.000",
        "65.000",
        "72.000"
    )

    private val sisa = arrayOf(
        "59",
        "65",
        "53",
        "47",
        "178",
        "13",
        "374",
        "3",
        "87",
        "28",
    )

    private val Deskripsi = arrayOf(
        "terawat dengan baik,di jamin aman, 2 hari pasti sampai kalau tidak akan ada pengembalian dana sebesar 100%",
        "Kualitas terbaik di antara yang terbaik,tidak akan rugi beli di sini",
        "yang terkuat di antara yang terkuat,mudah untuk di rawat",
        "yang paling tahan lama di antara yang paling tahan lama,bisa hidup 1 Bulan tanpa air",
        "efek nya terbaik",
        "tidak membuat banyak sampah",
        "tidak ada tandingan nya",
        "besar dan manis,bila nantu buah nya ada yang asam maka kami akan memberikan pengembalian dana 90% atau memberikan pohon yang baru *Buah yang sudah matang",
        "mudah di tanam dan dapat tumbuh pada iklim tropis",
        "bagus untuk menghias rumah,di jamin tidak akan menyesal"
    )

    private val Manfaat = arrayOf(
        "1. Membantu menjaga kesehatan sistem pencernaan.\n" +
                "Menurut penelitian yang dilakukan oleh Shri Ram Institute of Technology-Pharmacy tentang manfaat asam jawa bagi kesehatan manusia, memperlihatkan adanya efek pencahar pada tumbuhan tersebut.\n" +
                "\n" +
                "Selain itu, ditemukan pula bahwa anak-anak di Afrika menggunakan asam jawa sebagai bagian dari sarapan untuk mengatasi sembelit. Biasanya, mereka mencampur buah masam yang belum matang dengan jus jeruk nipis atau madu.\n" +
                "\n" +
                "Oleh karena itu, minum minuman yang mengandung asam jawa diyakini bisa membantu mengatasi gangguan pencernaan, seperti diare dan sembelit.\n" +
                "2. Menjaga kesehatan jantung.\n" +
                "Efektivitas asam jawa dalam menurunkan kolesterol dibuktikan melalui sebuah penelitian yang dilakukan di University of Malaya yang melibatkan binatang percobaan.\n" +
                "\n" +
                "Uji coba tersebut menunjukkan adanya penurunan kadar kolesterol jahat (LDL), kolesterol total, dan trigliserida. Ekstrak asam jawa yang diberikan kepada hewan tersebut menyerap dan membantu membersihkan LDL dari jaringan saraf.\n" +
                "3. Membantu mengontrol gula darah.\n" +
                "Dalam uji coba yang dilakukan pada hewan, ekstrak asam jawa yang sudah dicairkan dapat berperan sebagai antidiabetes yang cukup kuat.\n" +
                "\n" +
                "Masih dari penelitian yang sama, pemberian ekstrak asam jawa mampu menurunkan risiko hiperglikemia karena kandungan magnesium yang relatif tinggi.\n" +
                "\n" +
                "Magnesium yang terkandung di dalam asam jawa memiliki peran yang penting atas 600 fungsi organ tubuh manusia, termasuk sebagai antidiabetes.\n" +
                "4. Membantu menurunkan berat badan.\n" +
                "Obesitas merupakan kondisi ketika kadar lemak tubuh seseorang meningkat secara berlebihan, terutama di dalam jaringan lemak.\n" +
                "\n" +
                "Uji coba yang dilakukan pada tikus gemuk menunjukkan bahwa pemberian ekstrak asam jawa terbukti menurunkan berat badan.\n" +
                "\n" +
                "Hal tersebut terjadi karena zat asam hidroksi tikit atau HCA membantu menghambat penyimpanan lemak di dalam tubuh. Akan tetapi, masih diperlukan penelitian lebih lanjut tentang hal ini.\n" +
                "5. Membantu melindungi organ hati.\n" +
                "Pada sebuah studi eksperimen terhadap hamster, terlihat bahwa ekstrak hidroalkohol dari asam tamarin membantu meningkatkan sistem anti peradangan untuk organ hati.\n" +
                "\n" +
                "Alkohol dan zat perusak organ liver lainnya dapat meningkatkan risiko penyakit hati dan menjadi salah satu penyebab apoptosis yaitu proses matinya sel-sel yang tidak diperlukan tubuh.\n" +
                "\n" +
                "Oleh karena itu, asam jawa dipercaya oleh kebanyakan orang dapat membantu mengurangi kerusakan liver. Walaupun demikian, belum ada penelitian yang membuktikan efek tersebut terhadap organ hati manusia.\n" +
                "\n" +
                "Manfaat asam jawa atau tamarin untuk kesehatan sebenarnya sudah sering digunakan oleh masyarakat Indonesia. Mereka percaya bahwa minum jamu atau makan makanan yang mengandung asam jawa dapat meningkatkan kesehatan mereka.\n" +
                "6. Menjaga kesehatan gigi.\n" +
                "Sebuah penelitian dilakukan oleh para ahli kimia dari Fakultas Kedokteran Gigi Universitas Jember. Tujuannya untuk menguji efek antibakteri pada air hasil rendaman daun asam jawa.\n" +
                "\n" +
                "Dari penelitian tersebut disimpulkan bahwa berkumur dengan menggunakan air tersebut efektif untuk mencegah gigi berlubang dan mengatasi plak pada gigi.\n" +
                "\n" +
                "Hal ini karena daun asam jawa mengandung etanol dan klorin. Dua zat ini dapat membunuh berbagai jenis bakteri, termasuk Streptococcus dan Lactobacillus yang dapat menyebabkan lubang pada gigi.\n" +
                "7. Mencegah infeksi jamur.\n" +
                "Asam jawa seringkali diolah menjadi jamu. Secara turun temurun, asam jawa dipercaya memiliki khasiat untuk menjaga kesehatan area kewanitaan.\n" +
                "\n" +
                "Ternyata manfaat ini diperoleh karena kandungan antijamur yang terdapat pada tumbuhan tersebut, yaitu etanol dan klorin. Selain membunuh bakteri, dua zat ini juga dapat digunakan untuk mengatasi infeksi jamur.\n" +
                "\n" +
                "Untuk itu, para wanita dianjurkan untuk rutin meminum jamu asam jawa untuk mencegah infeksi jamur di area kewanitaan. Infeksi jamur dapat menyebabkan keputihan dan bau badan tak sedap.\n" +
                "8. Meredakan mual.\n" +
                "Menghisap permen asam jawa diyakini mampu meredakan rasa mual tersebut. Ternyata efek anti mual diperoleh dari kandungan kalium yang tinggi pada tumbuhan yang satu ini.\n" +
                        "\n" +
                        "Berdasarkan sejumlah penelitian, kalium dapat membantu meredakan mual dan muntah.\n" +
                        "\n" +
                        "Meskipun demikian, jika perut Anda sensitif terhadap asam sebaiknya tidak mengonsumsi permen asam jawa karena akan membuat perut Anda terasa perih.",
        "Batang bambu baik yang tua maupun yang muda sangat berguna untuk berbagai keperluan, baik digunakan sebagai keperluan secara Tradisional seperti membangun rumah, mulai dari atap, dinding, peralatan dapur hingga alat musik tradisioal, begitupun dipergunakan sebagai bahan baku modern baik untuk kontruksi ataupun non kontruksi, kita bisa lihat sendiri hasil-hasil produk furnitur minimalis yang terbuat dari bambu dan di jual di pasaran.",
        "Mengurangi stres.\n" +
                "Membuatmu banyak bergerak saat merawatnya.\n" +
                "Mengasah otak kanan untuk terus bekerja.\n" +
                "Mengasah sisi sensitif dalam diri.\n" +
                "Menjaga daya ingatmu tetap tajam.\n" +
                "Mengajarkan ketekunan menghadapi hidup.\n" +
                "Membersihkan udara di dalam rumah.",
        "1. Tanaman Kaktus sebagai sumber Makanan\n" +
                "\n" +
                "Manfaat tanaman kaktus yang pertama adalah sebagai sumber makanan. Hal ini bisa ditemukan pada suku Indian dan Suku Meksiko.\n" +
                "\n" +
                "Ternyata tidak semua jenis kaktus bisa digunakan, hanya jenis kaktus nopales. Oleh suku Indian dan meksiko kaktus ini dimasak menjadi sup dan salad.\n" +
                "\n" +
                "Alasan mereka memilih kaktus nopales karena kaktus jenis ini mengandung berbagai vitamin, nutrisi dan kalsium.\n" +
                "\n" +
                "2. Untuk Perawatan Kulit\n" +
                "\n" +
                "Manfaat tanaman kaktus selanjutnya bisa digunakan untuk merawat kulit. Lebih tepatnya, untuk melindungi kulit dari iritasi.\n" +
                "\n" +
                "Tanaman kaktus memiliki kandungan antioksidan yang lebih tinggi 7x dari vitamin c.\n" +
                "\n" +
                "Selain itu, kaktus juga mampu mencerahkan wajah hingga menangkal tanda-tanda penuaan.\n" +
                "\n" +
                "4. Bisa Digunakan Sebagai Antiradiasi\n" +
                "\n" +
                "Manfaat tanaman kaktus ke empat, yaitu bisa digunakan untuk menangkal radiasi. Tanaman ini bisa menangkal radiasi dari layar laptop dan telepon genggam\n" +
                "\n" +
                "5. Untuk Membersihkan Udara Ruangan\n" +
                "\n" +
                "Manfaat tanaman kaktus berikutnya, yaitu bisa membersihkan udara di ruangan. Hal ini karena kaktus bisa menghasilkan oksigen dan mengikat karbondioksida.\n" +
                "\n" +
                "Oleh Sebab itu, ruangan yang ada tanaman kaktus terasa lebih segar dan nyaman.",
        "- Membantu mengatasi rasa nyeri.\n" +
                "- Membantu menurunkan tekanan darah.\n" +
                "- Meningkatkan sistem imunitas tubuh dan mencegah infeksi.\n" +
                "- Menjaga kesehatan saluran pencernaan.\n" +
                "- Membantu mengelola kadar gula darah.",
        "Dapat mengurangi hipertensi.\n" +
                "Daun ketapang bisa menyembuhkan sariawan.\n" +
                "Dapat mempercepat penyembuhan penyakit kulit.\n" +
                "Daun ketapang bisa melancarkan pencernaan.\n" +
                "Meredakan nyeri pada saat haid.\n" +
                "Mempertajam daya ingat.\n" +
                "Mengurangi risiko stroke.",
        "Meningkatkan sirkulasi darah.\n" +
                "Mencegah timbulnya arterosclerosis.\n" +
                "Mencegah penumpukan lemak di dinding pembuluh darah.\n" +
                "Menurunkan tingkat kolesterol darah.\n" +
                "Mengurangi risiko emboli koroner.\n" +
                "Mendorong produksi zat antibodi yang dapat membantu mencegah peradangan jaringan.",
        "Radang sendi. Buah mangga dipercaya mampu meredakan radang sendi.\n" +
                "Mencegah kanker. Buah mangga kaya akan antioksidan yang mampu menangkal radikal bebas serta menurunkan risiko kanker.\n" +
                "Melancarkan pencernaan.\n" +
                "Meningkatkan daya tahan tubuh.\n" +
                "Mencegah diabetes.\n" +
                "Kesehatan jantung.",
        "Menjaga kesehatan mata.\n" +
                "Baik untuk kesehatan otak.\n" +
                "Meningkatkan sistem kekebalan tubuh.\n" +
                "Mengurangi risiko penyakit jantung.\n" +
                "Mencegah penyakit Alzheimer.\n" +
                "Mencegah anemia.\n" +
                "Meningkatkan kesehatan kulit.",
        "1. Melawan pertumbuhan sel kanker.\n" +
                "Senyawa asam betulinat dan triterpenat yang terkandung dalam ekstrak pucuk merah diketahui dapat membantu membunuh sel kanker sekaligus menghambat penyebarannya, khususnya sel kanker payudara. Meski demikian, khasiat ini masih perlu diteliti lebih lanjut.\n" +
                "2. Mengatasi gejala irritable bowel syndrome.\n" +
                        "Asam betulinat pada ekstrak pucuk merah juga diketahui memiliki aktivitas antidiare dan antispasmodik yang baik dengan membantu merelaksasikan otot di dinding usus. Khasiat ini akan sangat berguna untuk meredakan keluhan kram perut dan diare yang sering terjadi pada penderita irritable bowel syndrome.\n" +
                "3. Mencegah penyakit bawaan makanan.\n" +
                "Kandungan senyawa antimikroba dalam pucuk merah juga diketahui mampu melindungi tubuh Anda dari keracunan makanan akibat kontaminasi bakteri. Manfaat pucuk merah ini didukung oleh riset yang menunjukkan bahwa senyawa dalam tanaman ini efektif membunuh bakteri Salmonella dan E. Coli.\n" +
                "4. Meningkatkan fungsi kekebalan tubuh.\n" +
                "Pucuk merah kaya akan kandungan antioksidan yang bermanfaat untuk melindungi tubuh dari kerusakan oksidatif akibat penumpukan radikal bebas berlebih. Kerusakan ini bisa terjadi di mana saja, termasuk organ dan sel-sel imun, sehingga kemampuan tubuh untuk melawan infeksi bisa menurun.\n" +
                "\n" +
                "Kerusakan oksidatif juga bisa terjadi pada berbagai organ tubuh dan menyebabkan terganggunya metabolisme, sistem peredaran darah, hingga regenerasi sel. Hal tersebut bisa menyebabkan berbagai penyakit kronis.\n" +
                "5. Menurunkan kadar gula darah.\n" +
                "Sebuah riset menunjukkan bahwa pucuk merah dapat dimanfaatkan untuk menurunkan kadar gula darah dan menjaganya tetap stabil.\n" +
                        "\n" +
                        "Khasiat ini diduga berasal dari senyawa aktif steroid dan terpenoid yang ada dalam ekstrak pucuk merah. Meski demikian, masih diperlukan penelitian lebih lanjut untuk membuktikannya.\n" +
                        "\n" +
                        "Kini Anda sudah mengetahui apa saja manfaat pucuk merah bagi kesehatan tubuh. Meski khasiatnya dalam pengobatan belum begitu valid, Anda bisa memanfaatkan pucuk merah sebagai teh herbal untuk meningkatkan dan menjaga kesehatan.\n" +
                        "\n" +
                        "Namun, bila memiliki kondisi tertentu, Anda sebaiknya berkonsultasi terlebih dahulu ke dokter sebelum mengonsumsi pucuk merah. Hal ini penting untuk memastikan keamanannya."


    )
    private val Gambar = intArrayOf(
        R.drawable.asamjawa,
        R.drawable.bambu,
        R.drawable.bonsaiberingin,
        R.drawable.kaktus,
        R.drawable.kersen,
        R.drawable.ketapangkencana,
        R.drawable.mahoni,
        R.drawable.mangga,
        R.drawable.pakis,
        R.drawable.pujukmerah
    )

    val listtanaman : ArrayList<tumbuhan>
        get(){
            val list = arrayListOf<tumbuhan>()
            for (position in Nama.indices){
                val Tumbuhan = tumbuhan()
                Tumbuhan.namatumbuhan = Nama[position]
                Tumbuhan.harga = Harga[position]
                Tumbuhan.deskripsi = Deskripsi[position]
                Tumbuhan.manfaat = Manfaat[position]
                Tumbuhan.gambar = Gambar[position]
                Tumbuhan.stock = sisa[position]
                list.add(Tumbuhan)

            }
            return list
        }

}