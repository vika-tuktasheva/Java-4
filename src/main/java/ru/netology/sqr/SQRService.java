package ru.netology.sqr;

public class SQRService {
    public int squareNumber(int lowerValue, int upperValue) {
        int count = 0;

        for (int i = 10; i <= 99; i++) {
            if (i * i >= lowerValue && i * i <= upperValue) {
                count++;
            }
        }
        return count;
    }
}
