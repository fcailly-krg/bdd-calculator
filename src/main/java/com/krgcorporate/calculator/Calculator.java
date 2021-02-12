package com.krgcorporate.calculator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Calculator {

    private double result;

    public void write(double value) {
        this.result = value;
    }

    public void add(double value) {
        this.result += value;
    }

}
