package day27abstraction;

public abstract class Courses {
    //ABSTRACTION

    public abstract void math();
    public void art (){
        System.out.println("Learn art");
    }


    /*
    1)Eger bir classtan object olusturulmasini istemiyorsak ve bu classi sadece
    child classlarin yapmak zorunda olduklari gorevleri belirlemek icin kullaniyorsak
    "Abstraction" yapariz.
    2)Bazen parent class daki methodun bodysi hicbir child class tarafindan kullanilmaz.
    Bu durumda parenttaki methoda body yazmak hic kullanilmadigi icin mantikli degildir
    Bizde yazmayiz
    3)Body si yazilmayan method Abstract Mehod denir. Abstract ingilizcede vucutsut yada soyut demektir
    4)Methodun body sini yazmayinca java bize hata verir, bizde abstract keywordunu kullanarak
    javaya bu methodun bodyis olmayacak deriz
    5)abstract keywordunu kullaninca elde ettigimiz abstract method normal classlara konulamaz
    o yuzden classi da abtstract yapmaliyiz
    6) Parent taki method abhstract ise butun cild classlar o methodu override etmek zorundadir
    Bu yuzden tum childler icin mecburi olmasini istedigimiz fonksiyonlari abstract yapmak mantikli bir secimdir.
    7) Body si olan methodlar (=Concrete Method) abstract classlarin icine yazilabilir. Abstract methodlar concrete
    classlarin icine yazilamazlar. Concrete methodlar child classlar tarafindan override edilmek zorunda degildir
    8)"abstract " keyword ile method body bir methodda ayni anda kullanilamaz
    9) final methodlar abstract olamazlar. final methodlar override edilemezler, halbuki abstract methodlar
    override edilmek icin olusturulurlar. Bu celiskidir, bu yuzden java abstract methodlarin final olmasina musaade etmez
    10) "abstract class"larin icinde abstract methodlar olur. "abstract methodlar" bodysi olmadigindan eksik methodlar gibi
    dusunulebilir, yani abstract class icinde eksik bir yapi barindirir. Eger siz abstract classdan
    object uretirseniz bu eksiklik object e yansir, java bunu istemez cunku eksik object eksik isyapar
    buda applicationin yanlis calismasina sebep olur
    java application u korumak icin abstract classlardan object uretilmesini engellemistir
    11) "abstract class"larin constructor i vardir ama object olusturamazlar
    12) "abstract" classin abstract childi veya concrete childi olabiliyor. Eger child abstract ise
    abstract methodlari override etmek zorunda degildir.
    13) abstract methodlar private olamazlar cunku child classlar abstract methodlari kullanirlar
    private yapinca kullanima kapali olur. Bu celiskidir, bu yuzden java abstract methodlarin
    private olmasina musade etmez
    14) Classlar final oldugunda child classa sahip olamazlar. Ama abstract classlar icin child class
    olmalidir, cunku child classlar abstract parent classdaki abstract methodlari kullanirlar
    bu yuzden java abstract classlarin final olmasina musaade etmez
    15) abstract methodlar static method olamaz. Override edilemezler.
     */




}
