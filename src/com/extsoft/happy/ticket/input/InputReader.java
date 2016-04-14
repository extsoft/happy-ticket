package com.extsoft.happy.ticket.input;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * @author Dmytro Serdiuk
 */
public class InputReader {

    private static final String INSTRUCTION = "Please provide path to file with a method for calculation " +
            "when run a program. The file has to contain 'Moscow' or 'Piter' word at the first line.";

    public String getCalculationMethod(String[] args) {
        if (args.length == 0) {
            System.out.println(INSTRUCTION);
            System.exit(0);
        }
        String path = args[0];
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String method = reader.readLine().trim();
            if (method.isEmpty()) {
                System.out.println("Input file is empty. The file: " + path);
            } else {
                return method;
            }
        } catch (Exception e) {
            System.out.println("Unable to access a file: " + e.getMessage());
        }
        System.exit(-1);
        return null;
    }
}
