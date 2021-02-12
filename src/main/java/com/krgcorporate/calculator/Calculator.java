package com.krgcorporate.calculator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Calculator {

    private double result;

    public void reset() {
        this.result = 0;
    }
}
