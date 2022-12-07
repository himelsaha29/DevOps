package com.ecse437.project.controller;

import com.ecse437.project.math.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class WebController {

    @GetMapping(value = "/test")
    public String test() {
        return "Works";
    }

    @RequestMapping(value = "/absolute/{value}")
    public String getAbsolute(@PathVariable(name = "value", required = true) int value) {
        return "The absolute value of " + String.valueOf(value) + " is " + String.valueOf(Absolute.value(value));
    }

    @RequestMapping(value = "/max/{value1}/{value2}")
    public String getMax(@PathVariable(name = "value1", required = true) int value1,
                         @PathVariable(name = "value2", required = true) int value2) {
        return "The max value of " + String.valueOf(value1) + " and " + String.valueOf(value2) + " is " + String.valueOf(Max.values(value1, value2));
    }

    @RequestMapping(value = "/round/{value}")
    public String getRound(@PathVariable(name = "value", required = true) float value) {
        return "The round value of " + String.valueOf(value) + " is " + String.valueOf(Round.value(value));
    }

    @RequestMapping(value = "/squareroot/{value}")
    public String getSquareRoot(@PathVariable(name = "value", required = true) double value) {
        return "The square root value of " + String.valueOf(value) + " is " + String.valueOf(SquareRoot.value(value));
    }

    @RequestMapping(value = "/logbase10/{value}")
    public String getLogBase10(@PathVariable(name = "value", required = true) double value) {
        return "The LogBase10 of " + String.valueOf(value) + " is " + String.valueOf(LogBase10.value(value));
    }

    @RequestMapping(value = "/exponential/{value}")
    public String getExponential(@PathVariable(name = "value", required = true) int value) {
        return "The exponential of " + String.valueOf(value) + " is " + String.valueOf(Exponential.value(value));
    }

    @RequestMapping(value = "/add/{value1}/{value2}")
    public String getAddExact(@PathVariable(name = "value1", required = true) int value1,
                                @PathVariable(name = "value2", required = true) int value2) {
        return "The addition of " + String.valueOf(value1) + " and " + String.valueOf(value2) + " is " + String.valueOf(AddExact.values(value1, value2));
    }

    @RequestMapping(value = "/celsiustofahrenheit/{value}")
    public String getFahrenheit(@PathVariable(name = "value", required = true) int value) {

        CelsiusToFahrenheit temperature = new CelsiusToFahrenheit();

        return "Fahrenheit value of " + String.valueOf(value) + " in Celsius " + " is " + String.valueOf(temperature.convert(value));
    }

    @RequestMapping(value = "/coordinatedistance/{value1}/{value2}/{value3}/{value4}")
    public String getCoordinateDistance(@PathVariable(name = "value1", required = true) double value1,
                                        @PathVariable(name = "value2", required = true) double value2,
                                        @PathVariable(name = "value3", required = true) double value3,
                                        @PathVariable(name = "value4", required = true) double value4) {

        CoordinateDistance distance = new CoordinateDistance();

        return "Distance is " + String.valueOf(distance.value(value1, value2, value3, value4));
    }
}
