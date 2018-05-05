package org.secuso.privacyfriendlydicer;

import android.util.Log;

import java.security.SecureRandom;

/**
 * Created by yonjuni on 5/6/15.
 */
public class Dicer {

    public int[] rollDice(int poolSize, int faceNum){
        int[] dice = new int[poolSize];

        for (int i=0;i<dice.length;i++){
            //dice[i] = (int) (Math.random() * 6) + 1;

            SecureRandom random = new SecureRandom();
            dice[i] = random.nextInt(faceNum) +1;
            //Log.d("DICER", String.valueOf(dice[i]));
        }
        return dice;
    }

}
