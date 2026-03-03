package com.demo.user_api;

import java.io.InputStream;
import java.util.function.Function;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/process")
public class ProcessController {

    public record NumberDTO(long result) {}

    @GetMapping
    public NumberDTO executeProcess() {
        try {
            ProcessBuilder pBuilder = new ProcessBuilder("python", "script.py");
            Process process = pBuilder.start();
            process.waitFor();

            InputStream input = process.getInputStream();
            String output = new String(input.readAllBytes()).trim();
        
            double parsedNumber = Double.parseDouble(output);

            Function<Double, Long> roundNumber = num -> Math.round(num);

            long finalNumber = roundNumber.apply(parsedNumber);

            return new NumberDTO(finalNumber);
        } catch (Exception e) {
            return new NumberDTO(-1);
        }
    }
}
