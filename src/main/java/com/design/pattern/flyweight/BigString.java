package com.design.pattern.flyweight;

/**
 * program: design-pattern
 * description:
 * author: szmiao
 * version V1.0.0
 * create: 2019-04-09 16:08:28
 **/
public class BigString {

    private BigChar[] bigChars;

    public BigString(String word, boolean isUsed){
        if(isUsed == true){
            bigChars = new BigChar[word.length()];
            BigCharFactory bf = BigCharFactory.getInstance();
            for(int i = 0; i < word.length(); i++){
                bigChars[i] = bf.getBigChar(word.charAt(i));
            }
        }else{
            bigChars = new BigChar[word.length()];
            BigCharFactory bf = BigCharFactory.getInstance();
            for(int i = 0; i < word.length(); i++){
                bigChars[i] = bf.getBigCharNotUsed(word.charAt(i));
            }
        }
    }

    public void print(){
        for(int i = 0; i < bigChars.length; i++){
            bigChars[i].print();
        }
    }
}
