package be.someTests;

import decorator.Extension;
import decorator.RandomUser;
import models.UserModel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(Extension.class)
public class DecoratorTest {

    @Test
    public void comparisonTest() {
        System.out.println("Сравнить два значения");
        Assertions.assertTrue(5 < 10);
        System.out.println("какой-то текст для вывода на консоль");
    }

    @Test
    public void test2(@RandomUser UserModel user){
        System.out.println(user);
        System.out.println("HAHA");
    }
}
