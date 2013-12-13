/*
 * Copyright (c) Shawn M. Crawford All Rights Reserved.
 */
package generator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.lang3.StringUtils;

/**
 * The password generator.
 * 
 * @author Shawn M. Crawford
 */
public class PasswordGenerator {

    /**
     * Pattern to check against the input password.
     */
    private static final Pattern PASSWORD_PATTERN = Pattern.compile("^-?\\d+$");

    /**
     * char array of characters in this password.
     */
    private static final char[] passwordCharArray = {'B', 'D', 'G', 'H', 'K', 'L', 'M', 'N', 'P', 'Q', 'R', 'T', 'V', 'W', 'X', 'Z'};

    /**
     * The password array.
     */
    private int[] passwordArray;

    /**
     * Constructor
     */
    public PasswordGenerator() {
        passwordArray = new int[12];
    }

    /**
     * Check if the passed in score is a valid score to use in this generator.
     * 
     * @param score
     * @return true if valid, false otherwise
     */
    public boolean isValidScore(String score) {

        boolean scoreValidated = true;

        if (score == null || score.isEmpty() || !isWholeNumber(score) || score.length() > 6) {
            scoreValidated = false;
        } else {
            int scoreAsInt = Integer.parseInt(score);
            if (scoreAsInt < 0 || scoreAsInt > 999999) {
                scoreValidated = false;
            }
        }

        return scoreValidated;
    }

    /**
     * Handle the score portion of the password.
     * 
     * @param score The inputted score.
     */
    public void handleScore(String score) {
        // Pad the string to 6 places, with 0's
        String fixedScore = StringUtils.leftPad(score, 6, '0');

        passwordArray[1] += getCharNumericValueFromString(fixedScore, 1);
        passwordArray[5] += getCharNumericValueFromString(fixedScore, 2);
        passwordArray[4] += getCharNumericValueFromString(fixedScore, 3);
        passwordArray[6] += getCharNumericValueFromString(fixedScore, 4);
        passwordArray[7] += getCharNumericValueFromString(fixedScore, 5);
        passwordArray[11] += getCharNumericValueFromString(fixedScore, 6);
    }

    /**
     * Convenience method to get the numeric value of a char in a passed in string.
     * 
     * @param string The passed in string. 
     * @param lengthModifier The int value to subtract from the string to find the char
     * to get the numeric value of.
     * @return The numeric value of a char
     */
    private int getCharNumericValueFromString(String string, int lengthModifier) {
        return Character.getNumericValue(string.charAt(string.length() - lengthModifier));
    }

    /**
     * Handles the pod portion of the password.
     * 
     * @param index The index the pod was located at in the form.
     */
    public void handlePod(int index) {
        if (index == 1) {
            // Nippon Sports Jetpod
            passwordArray[10] += 4;
        } else if (index == 2) {
            // Italian Racing Jetpod
            passwordArray[10] += 8;
        } else if (index == 3) {
            // Invalid Jetpod
            passwordArray[10] += 12;
        }
    }
    
    /**
     * Handles the shields portion of the password.
     * 
     * @param hasShields true if shields false if not
     */
    public void handleShields(boolean hasShields) {
        if (hasShields) {
            passwordArray[10] += 2;
        }
    }
    
    /**
     * Handles the thrusters portion of the password.
     * 
     * @param hasThrusters true if thrusters false if not
     */
    public void handleThrusters(boolean hasThrusters) {
        if (hasThrusters) {
            passwordArray[10] += 1;
        }
    }

    /**
     * Handles the lives portion of the password.
     * 
     * @param lives The number of lives 0-15
     */
    public void handleLives(int lives) {
        passwordArray[0] += lives;
    }
    
    /**
     * Handles the level portion of the password.
     * 
     * @param levelIndex The index of the level selected from the form.
     */
    public void handleLevel(int levelIndex) {
        passwordArray[2] = (int) Math.floor(levelIndex / 4);
        passwordArray[8] = (levelIndex % 4) * 4;
    }
    
    /**
     * Handles the map portion of the password.
     * 
     * @param mapIndex 
     */
    public void handleMap(int mapIndex) {
        if (mapIndex == 1) {
            passwordArray[8] += 1;
        } else if (mapIndex == 2) {
            passwordArray[8] += 2;
        } else if (mapIndex == 3) {
            passwordArray[8] += 3;
        }
    }

    /**
     * Check if a string represents a whole number.
     * 
     * @param string The string to check if it represents a whole number
     * @return true if string represents a whole number
     */
    private boolean isWholeNumber(String string) {
        Matcher matcher = PASSWORD_PATTERN.matcher(string);
        return matcher.find();
    }

    /**
     * Calculate the checksum for the password
     */
    private void calculateChecksum() {
        passwordArray[9] = (((passwordArray[6] ^ passwordArray[7]) + passwordArray[8]) ^ passwordArray[10]) + passwordArray[11];
        passwordArray[3] = ((((passwordArray[0] ^ passwordArray[1]) + passwordArray[2]) ^ passwordArray[4]) + passwordArray[5] + (int) Math.floor(passwordArray[9] / 16));
        passwordArray[9] += (passwordArray[3] >= 16) ? 1 : 0;
        passwordArray[3] %= 16;
        passwordArray[9] %= 16;
    }
    
    /**
     * Generates the password.
     * 
     * @return passcode The password
     */
    public String generateCode() {

        calculateChecksum();

        String passcode = "";
        for(int i=0; i < passwordArray.length; i++) {
            passcode += passwordCharArray[passwordArray[i]];
        }
        return passcode;
    }
}
