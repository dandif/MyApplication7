package simple.example.hewanpedia;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import simple.example.hewanpedia.model.Anjing;
import simple.example.hewanpedia.model.Hewan;
import simple.example.hewanpedia.model.Kucing;
import simple.example.hewanpedia.model.Ular;

public class DataProvider {
    private static List<Hewan> hewans = new ArrayList<>();
    private static Object String;

    private static List<Kucing> initDataKucing(Context ctx) {
        List<Kucing> kucings = new ArrayList<>();
        kucings.add(new Kucing("Angora", "Turki",
                "Aslinya berasal dari Ankara, Turki dengan ciri khas berbulu panjang dan lembut", R.drawable.cat_angora));
        kucings.add(new Kucing("Bengal", "Inggris",
                "Merupakan hasil persilangan antara Kucing Leopard Asia dengan kucing domestik Inggris", R.drawable.cat_bengal));
        kucings.add(new Kucing("Birmani", "Birma/Myanmar",
                "Konon awalnya merupakan ras kucing yand biasa menemani para biksu yang menetap pada kuil di Birma", R.drawable.cat_birman));
        kucings.add(new Kucing("Persia", "Iran",
                "Kucing berbulu panjang dengan wajah bundar dan hidung pesek. Awalnya berasal dari Iran kemudian diimpor ke Italia", R.drawable.cat_persia));
        kucings.add(new Kucing("Siam", "Thailand",
                "Kucing hasil turunan dari Wichian Maat (Kucing Thailand) dengan ciri khas berbadan panjang dan langsing, wajah lonjong, telinga lebar, dan mata kebiruan", R.drawable.cat_siam));
        kucings.add(new Kucing("Siberia", "Rusia",
                "Kucing domestik Rusia dengan bulu lebat dan badan besar tapi sangat lincah dan terkenal dengan kemampuan melompatnya ", R.drawable.cat_siberian));
        return kucings;
    }

    private static List<Anjing> initDataAnjing(Context ctx) {
        List<Anjing> anjings = new ArrayList<>();
        anjings.add(new Anjing("Bulldog", "Inggris",
                "Anjing populer yang dikenal dengan badan yang gemuk berotot, wajah seperti kain kusut, dan hidung yang pesek", R.drawable.dog_bulldog));
        anjings.add(new Anjing("Husky", "Alaska,Siberia,Finlandia (daerah bersalju) ",
                "Anjing jenis khusus yang awalnya digunakan untuk menarik kereta salju", R.drawable.dog_husky));
        anjings.add(new Anjing("Kintamani", "Indonesia",
                "Ras anjing asli pulau Bali ", R.drawable.dog_kintamani));
        anjings.add(new Anjing("Samoyed", "Rusia",
                "Anjing yang berasal dari Siberia yang awalnya biasa digunakan untuk menjaga ternak oleh suku Samoyed", R.drawable.dog_samoyed));
        anjings.add(new Anjing("Shepherd", "Jerman",
                "Anjing pintar dan kuat, sekarang banyak digunakan sebagai anjing penjaga, pengawal, dan anjing polisi (K9)", R.drawable.dog_shepherd));
        anjings.add(new Anjing("Shiba", "Jepang",
                "Anjing dari daerah Shiba ini gesit dan lincah sehingga awalnya banyak digunakan untuk berburu ", R.drawable.dog_shiba));
        return anjings;
    }
    private static List<Ular> initDataUlar(Context ctx) {
        List<Ular> ulars = new ArrayList<>();
        ulars.add(new Ular("Cylindrophis ruffus", "asia selatan",
                "Cylindrophis ruffus adalah lebih dikenal sebagai Two-headed snake atau ular berkepala dua. Walaupun bernama kepala dua, tapi ular ini tidak memiliki dua kepala", R.drawable.cylindrophis_ruffus));
        ulars.add(new Ular("Indotyphlops braminus", "asia selatan",
                "Ular kawat biasa (Indotyphlops braminus), juga sering disebut ular cacing atau ular kawat saja, adalah salah satu jenis ular yang terkecil di dunia. Nama-namanya dalam bahasa Inggris adalah common blindsnake, Brahminy blindsnake, flowerpot snake, bootlace snake", R.drawable.indotyphlops_braminus));
        ulars.add(new Ular("Lycodon capucinus", "asia selatan",
                "Ular cecak (Lycodon capucinus) atau yang juga disebut ular genteng, adalah spesies ular serigala. Ular ini disebut \"ular cecak\" karena ular ini sering ditemukan sedang memangsa cecak yang berkeliaran di sekitar rumah", R.drawable.lycodon_capucinus));
        ulars.add(new Ular("Xenopeltis Unicolor", "asia selatan",
                "Berikutnya adalah Xenopeltis unicolor atau yang sering disebut dengan ular Pelangi. Sebab, lapisan transparan di sisiknya membiaskan warna pelangi dari cahaya matahari", R.drawable.xenopeltis_unicolor));
        ulars.add(new Ular("Xenopeltis Unicolor", "asia selatan",
                "Ular piton atau sanca kembang merupakan salah satu jenis ular tidak berbisa selain Anaconda yang memiliki tubuh besar dan panjang, umumnya sering ditemukan di hutan", R.drawable.phyton_reticulatus));
        return ulars;

    }
        private static void initAllHewans(Context ctx) {
        hewans.addAll(initDataKucing(ctx));
        hewans.addAll(initDataAnjing(ctx));
        hewans.addAll(initDataUlar(ctx));
    }

    public static List<Hewan> getAllHewan(Context ctx) {
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        return  hewans;
    }

    public static List<Hewan> getHewansByTipe(Context ctx, String jenis) {
        List<Hewan> hewansByType = new ArrayList<>();
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        for (Hewan h : hewans) {
            if (h.getJenis().equals(jenis)) {
                hewansByType.add(h);
            }
        }
        return hewansByType;
    }

}


