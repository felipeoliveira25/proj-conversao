package com.example.conversor_temperatura;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConversorController {
    @GetMapping("/celsiusParaFahrenheit")
    public String celsiusParaFahrenheit(@RequestParam double grau) {
        double fahrenheit = (grau * 9/5) + 32;
        return grau + "°C é igual a " + fahrenheit + "°F";
    }

    @GetMapping("/fahrenheitParaCelsius")
    public String fahrenheitParaCelsius(@RequestParam double grau) {
        double celsius = (grau - 32) * 5/9;
        return grau + "°F é igual a " + celsius + "°C";
    }
}
