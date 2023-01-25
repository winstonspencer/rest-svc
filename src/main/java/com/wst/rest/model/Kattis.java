package com.wst.rest.model;

import lombok.Data;

@Data
public class Kattis {

    private int totalStates;
    private int totalTransitions;
    private String[] transitions;
    private int totalAcceptStates;
    private int[] acceptStates;
    private int totalInputStrings;
    private String[] inputStrings;

}
