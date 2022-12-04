package com.ecse437.controller;

import com.ecse437.math.*;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class WebController {

    @RequestMapping(value = "/absolute/{value}")
    public List<Integer> getAbsolute(@PathVariable(name = "value", required = true) int value) {

        ArrayList<Integer> results = new ArrayList<>();
        results.add(Absolute.value(value));
        return results;
    }

    @RequestMapping(value = "/max/{value1}/{value2}")
    public List<Integer> getMax(@PathVariable(name = "value1", required = true) int value1,
                                @PathVariable(name = "value2", required = true) int value2) {

        ArrayList<Integer> results = new ArrayList<>();
        results.add(Max.values(value1, value2));
        return results;
    }

    @RequestMapping(value = "/round/{value}")
    public List<Integer> getRound(@PathVariable(name = "value", required = true) float value) {

        ArrayList<Integer> results = new ArrayList<>();
        results.add(Round.value(value));
        return results;
    }

    @RequestMapping(value = "/squareroot/{value}")
    public List<Double> getSquareRoot(@PathVariable(name = "value", required = true) double value) {

        ArrayList<Double> results = new ArrayList<>();
        results.add(SquareRoot.value(value));
        return results;
    }

    @RequestMapping(value = "/logbase10/{value}")
    public List<Double> getLogBase10(@PathVariable(name = "value", required = true) double value) {

        ArrayList<Double> results = new ArrayList<>();
        results.add(LogBase10.value(value));
        return results;
    }

    @RequestMapping(value = "/exponential/{value}")
    public List<Double> getExponential(@PathVariable(name = "value", required = true) double value) {

        ArrayList<Double> results = new ArrayList<>();
        results.add(Exponential.value(value));
        return results;
    }

    @RequestMapping(value = "/add/{value1}/{value2}")
    public List<Integer> getAddExact(@PathVariable(name = "value1", required = true) int value1,
                                @PathVariable(name = "value2", required = true) int value2) {

        ArrayList<Integer> results = new ArrayList<>();
        results.add(AddExact.values(value1, value2));
        return results;
    }

    @RequestMapping(value = "/celsiustofahrenheit/{value}")
    public List<Double> getFahrenheit(@PathVariable(name = "value", required = true) double value) {

        ArrayList<Double> results = new ArrayList<>();

        return results;
    }
}
