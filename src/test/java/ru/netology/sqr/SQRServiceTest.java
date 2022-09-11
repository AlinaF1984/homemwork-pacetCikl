package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {

    @Test
    public void shouldCountSqr() {
        SQRService service = new SQRService();

        int expected = 3;
        int actual = SQRService.countSqr(200, 300);

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void notRangeCountSqr() {
        SQRService service = new SQRService();

        int expected = 0;
        int actual = SQRService.countSqr(1, 9);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void limitValuesCountSqr() {
        SQRService service = new SQRService();

        int expected = 0;
        int actual = SQRService.countSqr(10, 99);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void negativNumberCountSqr() {
        SQRService service = new SQRService();

        int expected = 0;
        int actual = SQRService.countSqr(-200, -300);


        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void oneNegativNumberCountSqr() {
        SQRService service = new SQRService();

        int expected = 8;
        int actual = SQRService.countSqr(-200, 300);


        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void valueZeroCountSqr() {
        SQRService service = new SQRService();

        int expected = 5;
        int actual = SQRService.countSqr(0, 200);


        Assertions.assertEquals(expected, actual);
    }

}