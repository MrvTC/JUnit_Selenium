package Day6_Dropdown_SeleniumWaits;

import com.github.javafaker.Faker;
import org.junit.Test;

public class C01_Faker {

    //faker değerler üretmek için faker classından bir obje üretir
    //ve var olan metotları kullanırız

    @Test
    public void fakerExample(){

        //faker objesini oluşturuyoruz
        Faker faker=new Faker();

        System.out.println(faker.name().firstName());

        System.out.println(faker.name().lastName());

        System.out.println(faker.address().country());
    }

}
