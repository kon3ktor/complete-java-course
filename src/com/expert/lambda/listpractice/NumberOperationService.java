package com.expert.lambda.listpractice;

import java.util.ArrayList;
import java.util.List;

public class NumberOperationService {

    public List<Integer> executeOperation(List<Integer> inputNumbers, Operation operation) {
        List<Integer> outputNumbers = new ArrayList<>();
        for (int number : inputNumbers) {
            outputNumbers.add(operation.operate(number));
        }
        return outputNumbers;
    }
}
