package com.sheila.encrypt.util;

public class CaesarCipher {
    public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    public static String encrypt(String password, int key ) {

        password = password.toLowerCase();
        String encryptPass = "";

        for (int i = 0; i < password.length(); i++) {

            int pos = ALPHABET.indexOf(password.charAt(i));

            int encryptPos = (key + pos) % 26;
            char encryptChar = ALPHABET.charAt(encryptPos);

            encryptPass += encryptChar;
        }

        return encryptPass;

    }

    public static String decrypt(String password, int key) {

        password = password.toLowerCase();

        String decryptPass = "";

        for (int i = 0; i < password.length(); i++) {

            int pos = ALPHABET.indexOf(password.charAt(i));

            int decryptPos = (pos - key) % 26;

            if (decryptPos < 0){
                decryptPos = ALPHABET.length() + decryptPos;
            }
            char decryptChar = ALPHABET.charAt(decryptPos);

            decryptPass += decryptChar;
        }

        return decryptPass;
    }



}
