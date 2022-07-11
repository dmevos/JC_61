package ru.osipov;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;


public class ComplexTest {

    @BeforeAll
    static void startTests(){
        System.out.println("Начинаем гонять тесты:");
    }

    @AfterAll
    static void stopTests(){
        System.out.println("Закончили гонять тесты!");
    }

    @BeforeEach
    public void startTest(){
        System.out.println("Гоним очередной тест:");
    }

    @AfterEach
    public void stopTest(){
        System.out.println("Прогнали очередной тест!");
    }

    @Test
    public void testAdd() {
        // given:
        final Complex complex1 = new Complex(1, 1);
        final Complex complex2 = new Complex(2, 2);
        final Complex complex3 = new Complex(3, 3);
        // when:
        final String result = complex1.add(complex2).toString();
        // then:
        assertEquals(complex3.toString(), result);

        //ATTENTION, QUESTION!!!  ATTENTION, QUESTION!!!  ATTENTION, QUESTION!!!
/*        Хотел проверить объекты - строка ниже выдает неверный тест
          final Complex result = complex1.add(complex2);
          assertEquals(complex3, result);
          как проверить именно объекты???
*/
    }

    @Test
    public void testMul() {
        // given:
        final Complex complex1 = new Complex(1, 1);
        final Complex complex2 = new Complex(2, 2);
        final Complex complex3 = new Complex(0, 4);
        // when:
        final String result = complex1.mul(complex2).toString();
        // then:
        assertEquals(complex3.toString(), result);
    }

    @Test
    public void testSub() {
        // given:
        final Complex complex1 = new Complex(1, 1);
        final Complex complex2 = new Complex(2, 2);
        final Complex complex3 = new Complex(-1, -1);
        // when:
        final String result = complex1.sub(complex2).toString();

        // then:
        assertEquals(complex3.toString(), result);
    }

    @Test
    public void testDiv() {
        // given:
        final Complex complex1 = new Complex(1, 1);
        final Complex complex2 = new Complex(2, 2);
        final Complex complex3 = new Complex(0.5, 0);
        // when:
        final String result = complex1.div(complex2).toString();
        // then:
        assertEquals(complex3.toString(), result);
    }

    @Test
    public void testAbs() {
        // given:
        final Complex complex1 = new Complex(1, 1);
        // when:
        final double result = complex1.abs();
        // then:
        assertEquals(Math.sqrt(2), result);
    }
}
