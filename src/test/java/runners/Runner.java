package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty",
                "json:target/cucumber.json",
                "utils.formatter.PrettyReports:target/cucumber-pretty-reports"},
        features = "src/test/resources/features",
        glue = "stepdefinitions",
        tags = "",
        dryRun = false
)

public class Runner {

    /*
    Cucumber'da Runner class'ı bos bir classtır.
    Runner class'ını diger classlardan farklı kılan
    ve TestNG'deki .xml dosyaları gibi calısmasını saglayan
    2 adet notasyon mevcuttur.
    @RunWith(Cucumber.class) notasyonu projemize cucumber
    junit dependecy eklememizin sebebidir. Bu sayede
    Runner classlarımız cucumber ile calısır.
    @CucumberOptions notasyonu ile istedigimiz özellikleri
    Runner class'ına ekleyebiliriz.
    Raporlama gibi ekstra optionlarıda ileride ekleyecegiz.
    Ancak öncelikli görevi features dosyaları ile stepdefinitions'da
    bulunan Java methodlarını ilisiklendirmektir.
     tags : Features klasoru icerisinde yazılan tag(ları) aratıp
     buldugu tüm feature veya scenarioları calıstırır.
     dryRun : İki deger alabilir
     true : secilirse, verilen tag ile isaretli olan Feature veya
     scenario'daki eksik stepDefinitionsları bulup ilgili methodları
     olusturur.
     Hic bir sekilde testimizi calıstırmaz eksik adım yoksa test
     passed olarak isaretler.
     false : secilirse, verilen tag ile isaretlenen feature veya
     scenarioları calıstırır.
     */


}