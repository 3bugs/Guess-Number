package th.ac.su.cp.guessnumber.model;

import android.util.Log;

import java.util.Random;

public class Answer {
    private int value;

    public Answer() {
        randomValue();
    }

    private void randomValue() {
        // code สำหรับสุ่มค่า value
        Random r = new Random();
        this.value = r.nextInt(100);
        Log.i("MainActivity", "ค่าของ value ที่สุ่มได้คือ " + this.value);
    }

    public String checkAnswer(int guess) {
        String msg;

        if (guess == value) { // ทายถูก
            msg = "ถูกต้องครับ";
        } else if (guess > value) { // ทายตัวเลขที่มากเกินไป
            msg = "ผิดครับ, มากเกินไป";
        } else { // ทายตัวเลขที่น้อยเกินไป
            msg = "ผิดครับ, น้อยเกินไป";
        }

        return msg;
    }
}
