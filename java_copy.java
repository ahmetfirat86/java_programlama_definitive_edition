import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
//ctrl+k,8 tüm regionları kapat aç

public class java_copy { // Sınıf ismi büyük harfle başladı

    //#region Java Programlama ve Veri Yapıları Çalışma Kılavuzu
    /*
    Bu belge, Java programlama dilinin temel kavramlarını, nesne yönelimli tasarımı ve klasik veri yapılarını kapsayan kapsamlı bir çalışma rehberidir. Kaynak metinler ve çıkmış sınav soruları analiz edilerek hazırlanmıştır.

    1. Giriş (Introduction)

    Koleksiyonlar (collections), nesneleri bir araya getiren ve yöneten soyut veri tipleridir. Java'da koleksiyonlar iki ana kategoriye ayrılır:

    * Lineer (Doğrusal) Yapılar: Kuyruklar (Queues) ve Yığınlar (Stacks).
    * Lineer Olmayan Yapılar: Ağaçlar (Trees) ve Graflar (Graphs).

    Java Standard Library içinde yer alan Java Collections API, bu yapıların verimli bir şekilde uygulanmasını sağlayan sınıfları (ArrayList, LinkedList vb.) ve arayüzleri (List, Set, Map vb.) içerir.


    --------------------------------------------------------------------------------


    2. Veriler ve İfadeler (Data and Expressions)

    Generics (Genel Türler)

    Java, koleksiyonları tanımlarken tip güvenliğini sağlamak için Generic yapıları destekler. Generic bir sınıf veya arayüz, tipler üzerinden parametreleştirilir.

    * Avantajı: Koleksiyona sadece belirli bir tipteki nesnelerin eklenmesini sağlar ve nesne çıkarıldığında tip dönüşümü (cast) gereksinimini ortadan kaldırır.
    * Örnek Tanımlama: LinkedList<Book> myList = new LinkedList<Book>();


    --------------------------------------------------------------------------------


    3. Sınıfları ve Nesneleri Kullanma (Using Classes and Objects)

    Polimorfizm (Çok Biçimlilik)

    Polimorfizm, "birçok form" anlamına gelir. Bir referans değişkeninin zaman içinde farklı tipteki nesnelere işaret edebilmesi yeteneğidir.

    * Dinamik Bağlama (Dynamic Binding): Java'da metot çağrıları derleme zamanında değil, çalışma zamanında (run-time) bağlanır. Buna "geç bağlama" (late binding) denir.
    * Polimorfik Referans: Bir üst sınıf referansı, alt sınıf nesnesini tutabilir. Örneğin; Holiday day = new Summer(); (Eğer Summer, Holiday sınıfından türetilmişse).


    --------------------------------------------------------------------------------


    4. Sınıf Yazma (Writing Classes)

    Bir sınıf, nesnelerin durumunu (state) ve davranışlarını (behavior) tanımlayan bir taslaktır.

    Sınıf Anatomisi

    * Instance Data (Örnek Veri): Sınıf seviyesinde tanımlanan değişkenlerdir. Her nesne kendi bellek alanına ve bu verilerin kendi kopyasına sahiptir.
    * Local Data (Yerel Veri): Bir metot içinde tanımlanır ve sadece o metot içinden erişilebilir.
    * Encapsulation (Kapsülleme): Nesnenin iç verilerinin doğrudan erişime kapatılmasıdır. Java'da bu, visibility modifiers (görünürlük belirleyicileri) ile sağlanır:

    Belirleyici	Tanım
    public	Her yerden erişilebilir. Servis metotları için kullanılır.
    private	Sadece tanımlandığı sınıf içinden erişilebilir. Örnek veriler için kullanılır.
    protected	Kalıtım (inheritance) ile ilgilidir.

    * Accessors ve Mutators: get ve set metotları olarak bilinirler. Özel (private) verilere kontrollü erişim sağlarlar.
    * Constructors (Yapıcılar): Nesne ilk oluşturulduğunda çalışan, sınıf ile aynı ada sahip özel metotlardır.


    --------------------------------------------------------------------------------


    5. Koşullu İfadeler ve Döngüler (Conditionals and Loops)

    Temel Kontrol Yapıları

    * if-else: Koşula dayalı karar verme.
    * while: Koşul doğru olduğu sürece çalışır; gövde hiç çalışmayabilir.
    * do-while: Koşul sonunda kontrol edilir; gövde en az bir kez çalışır.
    * for: Belirli bir sayıda tekrar eden işlemler için idealdir. Üç kısımdan oluşur: initialization (başlatma), condition (koşul) ve increment (artırma).


    --------------------------------------------------------------------------------


    6. Daha Fazla Koşullu İfade ve Döngü (More Conditionals and Loops)

    Switch İfadesi

    Bir değişkenin değerine göre çok yollu dallanma sağlar.

    * break ifadesi kullanılmazsa, program bir sonraki case bloğuna "akar" (fall-through).
    * default bloğu, hiçbir case eşleşmediğinde çalışır.

    Koşullu Operatör (Ternary Operator)

    condition ? expression1 : expression2 formatındadır. Koşul doğruysa ilk ifadeyi, yanlışsa ikinciyi döndürür.

    For-each Döngüsü

    Iterable arayüzünü uygulayan nesneler (ArrayList vb.) üzerinde gezinmek için kullanılır.

    * Örnek: for (Book myBook : library) { System.out.println(myBook); }

    Dialog Kutuları

    JOptionPane sınıfı, kullanıcıyla etkileşim kurmak için grafiksel pencereler sağlar:

    * showInputDialog: Veri girişi.
    * showMessageDialog: Bilgi verme.
    * showConfirmDialog: Onay alma.


    --------------------------------------------------------------------------------


    7. Nesne Yönelimli Tasarım (Object-Oriented Design)

    Sınıflar Arası İlişkiler

    Çıkmış sorularda vurgulanan üç temel ilişki tipi şunlardır:

    1. Dependency (Bağımlılık): A uses B (A, B'yi kullanır).
    2. Aggregation (Toplama/İçerme): A has-a B (A, bir B'ye sahiptir).
    3. Inheritance (Kalıtım): A is-a B (A, bir B'dir).

    Kalıtım ve Arayüz Anahtar Kelimeleri

    Durum	Anahtar Kelime
    Sınıf, başka bir Sınıftan türetiliyorsa	extends
    Sınıf, bir Arayüzü (Interface) uyguluyorsa	implements
    Arayüz, başka bir Arayüzden türetiliyorsa	extends


    --------------------------------------------------------------------------------


    8. Diziler ve Veri Yapıları (Arrays and Data Structures)

    Lineer Veri Yapıları

    * Stack (Yığın): LIFO (Last-In, First-Out - Son Giren İlk Çıkar) prensibiyle çalışır. Temel işlemler: push (ekle), pop (çıkar), peek (bak), empty.
    * Queue (Kuyruk): FIFO (First-In, First-Out - İlk Giren İlk Çıkar) prensibiyle çalışır. Temel işlemler: enqueue (arkaya ekle), dequeue (önden çıkar).
    * Linked List (Bağlı Liste): Düğümlerden (node) oluşur. Araya düğüm eklemek için:

    Lineer Olmayan Veri Yapıları

    * Tree (Ağaç): Hiyerarşik bir yapıdır. Bir kök (root) düğümü vardır. Çocukları olmayan düğümlere yaprak (leaf) denir. Binary Tree (İkili Ağaç)'da her düğümün en fazla iki çocuğu olabilir.
    * Graph (Graf): Düğümler ve onları bağlayan kenarlardan (edge) oluşur. Kökü yoktur. Yönlü (digraph) veya yönsüz olabilir.


    --------------------------------------------------------------------------------


    Bilgi Kontrolü: Test Soruları

    1. Yığın (Stack) işlemleriyle ilgili aşağıdakilerden hangisi yanlıştır? A) Empty: Yığın boşsa True döndürme B) Peek: Yığının tepesindeki elemanı bulup gösterme C) Push: Yığının en üstüne eleman ekleme D) Enqueue: Yığının altına bir eleman ekleme E) Pop: Yığının tepesinden eleman çıkarma Cevap: D (Enqueue bir kuyruk işlemidir).

    2. Bağlı listelerde (Linked List) araya bir düğüm eklemek için hangi işlem sırası doğrudur? A) newNode.next = current; current = newNode; B) current.next = newNode.next; newNode = current.next; C) newNode.next = current.next; current.next = newNode; D) newNode = current; newNode.next = current.next; Cevap: C

    3. Sınıflar arası ilişkilerde "A is-a B" (A bir B'dir) ifadesi hangi ilişkiyi tanımlar? A) Dependency (Bağımlılık) B) Aggregation (İçerme) C) Inheritance (Kalıtım) D) Encapsulation (Kapsülleme) Cevap: C


    --------------------------------------------------------------------------------


    Sözlük

    * ADT (Abstract Data Type): Verinin ve üzerinde yapılabilecek işlemlerin mantıksal tanımı.
    * Downcasting: Bir üst sınıf referansını açıkça (explicit) bir alt sınıf tipine dönüştürmek.
    * FIFO: İlk Giren İlk Çıkar (Kuyruk prensibi).
    * LIFO: Son Giren İlk Çıkar (Yığın prensibi).
    * UML: Sınıflar ve nesneler arasındaki ilişkileri göstermek için kullanılan standart diyagram dili.
    * Visibility Modifiers: Nesne içindeki üyelerin hangi kapsamda erişilebilir olduğunu belirleyen sözcükler (public, private vb.).

    */ 
    //#endregion
   
    //#region Notlar1
    /*
    platformdan bağımsız -architecture neutral- bir dildir.
    1.kod yazılır
    2.kod derleyici(java compiler) tarafından bytecode'a çevrilir
    3.yorumlayıcı (java virtual machine) jvm bytecode'u okur ve bilgisayarın makine dilekine çevirir ve çalıştırır.

    Tanımlayıcı (Identifier) Kuralları: sınıf değişken veya metod isimleri tanımlarken aşağıdaki kurallara uymalıyız:
    1. Tanımlayıcılar harf, rakam, alt çizgi (_) veya dolar işareti ($) içerebilir, ancak rakamla başlayamazlar.
    2. Tanımlayıcılar Java anahtar kelimeleriyle aynı olmamalıdır. Örneğin, "class", "public", "static" gibi kelimeler tanımlayıcı olarak kullanılamaz.
    3. Tanımlayıcılar büyük/küçük harfe duyarlıdır. Örneğin, "myVariable" ve "myvariable" farklı tanımlayıcılar olarak kabul edilir.
    örneğin:
    3rdTestScore -> GEÇERSİZ (Rakamla başlayamaz)
    student# -> GEÇERSİZ (# işareti kullanılamaz) 
    MIN_CAPACITY -> GEÇERLİ

    Hata türleri:
    1. Syntax Error (Sözdizimi Hatası): Kodun dil kurallarına uymaması durumunda ortaya çıkan hatalardır. Örneğin, noktalama işaretlerinin eksik olması veya yanlış yerleştirilmesi gibi durumlar syntax error'a neden olabilir.
    2. Runtime Error (Çalışma Zamanı Hatası): Programın çalışması sırasında ortaya çıkan hatalardır. Örneğin, sıfıra bölme, null referans kullanımı veya bellek taşması gibi durumlar runtime error'a neden olabilir.
    3. Logical Error (Mantıksal Hata): Programın sözdizimi ve çalışma zamanı hatası içermemesine rağmen, beklenen sonucu vermemesi durumunda ortaya çıkan hatalardır. Örneğin, yanlış bir algoritma kullanmak veya yanlış bir koşul ifadesi yazmak gibi durumlar logical error'a neden olabilir.
    4. Compile-Time Error (Derleme Zamanı Hatası): Kodun derlenmesi sırasında ortaya çıkan hatalardır. Örneğin, tanımlanmamış bir değişken kullanmak veya yanlış bir veri türü atamak gibi durumlar compile-time error'a neden olabilir.

    Nesne Yönelimli Programlama (OOP) kavramları:
    1. Sınıf (Class): Nesnelerin özelliklerini ve davranışlarını tanımlayan bir şablondur. Sınıflar, nesnelerin oluşturulması için bir plan sağlar.
    2. Nesne (Object): Programın temel taşıdır. her nesnenin bir durumu -state- ve davranışı -behavior- vardır. Nesneler, sınıflardan oluşturulur ve sınıfların tanımladığı özelliklere ve davranışlara sahiptir. Örneğin; bir banka hesabı nesnesinin hesap bakiyesi onun durumunu, para yatırma eylemi ise davranışını belirtir

    Değişkenler -variables- and sabitler-constants-:
    değişken belleklte bir değeri tutmak için ayrılmış ve isimlendirilmiş bir alandır. 
    sabit program boyunca değişmeyen bir değeri temsil eder. final anahtar kelimesi ile tanımlanır ve bir kez atandıktan sonra değeri değiştirilemez. Örneğin, pi sayısı gibi matematiksel sabitler genellikle final olarak tanımlanır.
    final int pi = 3.14; // pi sayısı bir sabittir ve değeri değiştirilemez
    
    ifadeler operatörler işlem önceliği
    total += 5; ifadesi total = total + 5; ifadesiyle aynıdır.  +=, -=, *=, /= gibi operatörler işlemi yapıp sonucu tekrar aynı değişkene atar

    Prefix ve Postfix:
    prefix -önce- ++i  önce 1 i arttırır sonra i'yi kullanır
    postfix -sonra- i++ önce i'yi kullanır sonra 1 i arttırır

    Veri Türü Dönüşümleri (Data Conversions):
    1.genişletilen dönüşüm -widening conversion : küçük bir tipten büyük tipe dönüşüm. örn byte -> int . güvenlidir veri kaybı olmaz
    2.daraltılan dönüşüm -narrowing conversion- : büyük bir tipten küçük tipe dönüşüm. örn double -> int . güvenli değildir veri kaybı olabilir
    3.tip zorlaması -type casting- : açıkça dönüşüm yapmak için değerin başına parantez içinde tip yazılır. örn: (int) 86.5 ifadesi 86 sonucunu verir.

    Etkileşimli Programlar ve Scanner Sınıfı:
    program çalışırken kullanıcıdan girdi almak için java.until paketi içindeki scanner sınıfı kullanılır. 
    import java.until.Scanner ile projeye dahil edilir.



    
    */
    //#endregion

    //#region Notlar2
    /*
    nesne oluşturma -creating objects- ve referanslar 
    new operatörü -> bellekte nesneye yer açmak ve nesneyi başlatmak için new operatörü kullanılır. 
    çöp toplama -> garbage collection bir nesneye işaret eden tüm geçerli referanslar kaybolduğunda o nesne çöp -garbage- haline gelir java bellek yönetimini otomatik olarak bu çöpleri temizler.

    string sınıfı stringler karakter dizilerini temsil eder ve string sınıfı tarafından sağlanan birçok yöntemle birlikte gelir. stringler immutable yani değiştirilemezdir. bir string oluşturulduktan sonra içeriği değiştirilemez. herhangi bir değişiklik yapıldığında yeni bir string nesnesi oluşturulur.

    iki stringin değerinin aynı olup olmadığını == operatörünü kullanarak kontrol edilmez. .equals() ile yapılır. örneğin:
    
    enum -enumeration- sabit değerler kümesini temsil eden özel bir veri türüdür. enum kullanarak belirli bir kategoriye ait sabit değerleri tanımlayabiliriz. örneğin:

    */ 
    //#endregion
    
    //#region Notlar3
    /*
    nesne yönelimli tasarım

    yazılım geliştirme akitiviteleri  - software development activities-
    1.gereksinimleri belirleme -requirements
    2.tasarım olusturma -design-
    3.uygulama -implementation
    4.test etme -testing-

    Method overloading
    Java'da Metot Aşırı Yükleme (Method Overloading), aynı isme sahip birden fazla metodun, farklı parametre listeleriyle (sayı, tip veya sıralama) aynı sınıf içerisinde tanımlanabilmesidir.

    public int topla(int a, int b) {
        return a + b;
    }

    // 2. Metot: Üç tam sayıyı toplar (Parametre sayısı farklı)
    public int topla(int a, int b, int c) {
        return a + b + c;
    }

    // 3. Metot: İki double sayıyı toplar (Veri tipi farklı)
    public double topla(double a, double b) {
        return a + b;
    }

    En güzel örneği System.out.println() metodudur. İçine String, int veya double alabilen farklı versiyonları arka planda aşırı yüklenmiştir

    */
    //#endregion
    
    //#region Notlar4
    /*
    Bir dizi oluşturulduktan sonra boyutu değiştirilemez. Eğer dinamik bir yapıya ihtiyacın olursa Java'daki ArrayList yapısını kullanmalısın.

    diziler üzerinde gezinme -iteration-
    int[] puanlar = {85, 90, 78, 92};

    for (int i = 0; i < puanlar.length; i++) {
        System.out.println("İndeks " + i + ": " + puanlar[i]);
    }
    for (int puan : puanlar) {
        System.out.println("Puan: " + puan);
    }
    
    Java'da diziler aslında birer nesnedir ve bellekte yer açılabilmesi için new anahtar kelimesiyle başlatılmaları (instantiate) gerekir
    int[] scores = new int[31];

    Diziler sadece int, double gibi ilkel tipleri değil, nesneleri (örneğin String veya sizin yazdığınız sınıfları) de tutabilir
    Nesne dizisi oluşturduğunuzda, aslında nesnelerin kendisi için değil, nesne referansları (adresleri) için yer ayırırsınız.
     */
    //#endregion

    //--------------------------------------------------------------

    //#region scanner methodu
    static void scnr_1(Scanner input) {
        System.out.println("scnr_1 methodu çalıştı. Lütfen bir metin giriniz:"); // Kullanıcıya bir metin girmesini istiyoruz
        String str = input.nextLine(); // Kullanıcıdan bir satır girişi alıyoruz
        System.out.print("Kullanıcı girişi: " + str); // Kullanıcının girdiği metni ekrana yazdırıyoruz
    }
    //#endregion

    //#region tek çift kontrolü
    static void tek_cift(Scanner input)
    {
      System.out.println("tek_cift methodu çalıştı. Lütfen bir sayı giriniz:"); 
      try
      {
        int number = input.nextInt();
        if(number %2==0){
          System.out.println("Girdiğiniz sayı çifttir.");
        }
        else{
          System.out.println("Girdiğiniz sayı tektir.");
        }
      }
      catch (Exception e)
      {
          System.out.println("Geçersiz giriş. Lütfen bir sayı giriniz.");
          input.nextLine();
      }
    }
    //#endregion

    //#region print ve println farkı 
    static void print_ve_println()
    {
        System.out.print("Bu bir print örneğidir. "); // Bu satırın sonunda yeni bir satır oluşturmaz
        System.out.println("Bu bir println örneğidir."); // Bu satırın sonunda yeni bir satır oluşturur
        System.out.print("Bu da başka bir print örneğidir."); // Bu satırın sonunda yeni bir satır oluşturmaz
    }
    //#endregion

    //#region Kaçış Dizileri (Escape Sequences): 
    static void kacs_dizileri()
    {
        System.out.println("Kaçış dizileri örneği:");
        System.out.println("Yeni satır için: \\n  \n Bu metin yeni satırda görünecektir.");
        System.out.println("Tab karakteri için: \\t");
        System.out.println("Ters bölü için: \\\\");
        System.out.println("Çift tırnak için: \\\"");
    }
    //#endregion
    
    //#region pozitif negatif kontrol - kullanıcı girişi alan versiyon
    static void poz_neg(Scanner input){
        System.out.println("poz_neg methodu çalıştı. Lütfen bir sayı giriniz:"); 
        try
        {
            int number = input.nextInt();
            if(number > 0){
                System.out.println("Girdiğiniz sayı pozitiftir.");
            }
            else if(number < 0){
                System.out.println("Girdiğiniz sayı negatiftir.");
            }
            else{
                System.out.println("Girdiğiniz sayı sıfırdır.");
            }
        }
        catch (Exception e)
        {
            System.out.println("Geçersiz giriş. Lütfen bir sayı giriniz.");
            input.nextLine();
        }
    }
    //#endregion

    //#region pozitif negatif kontrol - kullanıcı girişi yerine parametre olarak sayı alan versiyon
    static void poz_neg_2(int input){
        System.out.println("poz_neg methodu çalıştı. Lütfen bir sayı giriniz:"); 
        try
        {
            int number = input;
            if(number > 0){
                System.out.println("Girdiğiniz sayı pozitiftir.");
            }
            else if(number < 0){
                System.out.println("Girdiğiniz sayı negatiftir.");
            }
            else{
                System.out.println("Girdiğiniz sayı sıfırdır.");
            }
        }
        catch (Exception e)
        {
            System.out.println("Geçersiz giriş. Lütfen bir sayı giriniz.");
        }
    }
    //#endregion
    
    //#region iki sayının yerini değiştirme
    static void num_swap(){
      int a = 10;
      int b = 20;
      System.out.println("Değiştirilmeden önce: a = " + a + ", b = " + b);

      int temp = a;
      a = b;
      b = temp;
      System.out.println("Değiştirildikten sonra: a = " + a + ", b = " + b);
    }
    //#endregion
    
    //#region prfix ve postfix örneği
    static void prefix_postfix(){
      int i = 5;
      System.out.println("\n Prefix ve Postfix örneği:");
      System.out.println("Başlangıç değeri: i = " + i);
      
      System.out.println("Postfix (i++): " + i++); // Önce i'nin değeri kullanılır, sonra i 1 artırılır
      System.out.println("Postfix sonrası değer: i = " + i); // i artık 6'dır

      i = 5; // i'yi tekrar 5 yapalım
      System.out.println("Başlangıç değeri: i = " + i);

      System.out.println("Prefix (++i): " + ++i); // Önce i 1 artırılır, sonra yeni değeri kullanılır
      System.out.println("Prefix sonrası değer: i = " + i); // i artık 6'dır
    }
    //#endregion
    
    //#region string equal
    static void is_strings_equal(){
      System.out.println("\nString eşitlik kontrolü:");
      String str1 = "Merhaba";
      String str2 = "Merhaba";
      String str3 = new String("Merhaba");

      if (str1.equals(str2)) {
          System.out.println("str1 ve str2 eşittir.");
      } else {
          System.out.println("str1 ve str2 eşit değildir.");
      }

      if(str2.equals(str3)){
          System.out.println("str2 ve str3 eşittir.");
      }
      else{
          System.out.println("str2 ve str3 eşit değildir.");
      }
    }
    //#endregion

    //#region random sayı üretme
    static void random_sayi(){
      Random random_number = new Random();
      int randomNum = random_number.nextInt(10)+10;
      System.out.println("\n 10 ile 20 arasında Rastgele sayı oluşturuldu: " + randomNum);
    }
    //#endregion

    //#region math sınıfı 
    static void math_sinifi(){
      double number = 16.0;
      double sqrt = Math.sqrt(number);
      double power = Math.pow(number, 2);

      System.out.println("\n" + number + " sayısının karekökü: " + sqrt);
      System.out.println(number + " sayısının karesi: " + power);
    }
    //#endregion
    
    //#region enum örneği
    enum Gunler {
        PAZARTESI,
        SALI,
        ÇARŞAMBA,
        PERŞEMBE,
        CUMA,
        CUMARTESI,
        PAZAR
      }
    static void enum_ornegi(){
      System.out.println("\nEnum örneği:");
      
      
      Gunler bugun = Gunler.PAZARTESI;
      System.out.println("Bugün günlerden: " + bugun);
    }
    //#endregion

    //#region arraylist örneği
    static void arrayList_ornek(){
      System.out.println("\nArrayList örneği:");

      ArrayList<String> diller = new ArrayList<String>();

      diller.add("Java");
      diller.add("Python");
      diller.add("C++");  
      //1.indekse ekler python 2.indekse kayar
      diller.add(1,"c#");
      System.out.println("Liste boyutu: " + diller.size());
      System.out.println("2. indeksteki dil: " + diller.get(2));
      System.out.println("Tüm diller: " + diller);
      
      for(String dil : diller){ //java foreach
        System.out.println("dil -> " + dil);
      }
    }
    //#endregion
    
    //#region çıkmış sorular
    static void cıkmıs_sorular_vize(){
      
    }
    //#endregion

    //--------------------------------------------------------------

    //#region main methodu
    public static void main(String[] args)
    {
      Scanner input = new Scanner(System.in);
      //calling methods
      print_ve_println();
      kacs_dizileri();
    //poz_neg(input);//scanner methodu parametre olarak gönderiliyor
      poz_neg_2(-1); //-1 parametre olarak gönderiliyor
      num_swap();
      prefix_postfix();
      is_strings_equal();
      random_sayi();
      math_sinifi();
      enum_ornegi();
      arrayList_ornek();

      cıkmıs_sorular_vize();

      input.close();
    }
    //#endregion
}
 