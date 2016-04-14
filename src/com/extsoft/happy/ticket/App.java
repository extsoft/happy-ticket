package com.extsoft.happy.ticket;

import com.extsoft.happy.ticket.calculator.CalculationMethod;
import com.extsoft.happy.ticket.calculator.MoskowCalculationMethod;
import com.extsoft.happy.ticket.calculator.PiterCalculationMethod;
import com.extsoft.happy.ticket.calculator.TicketsCalculator;
import com.extsoft.happy.ticket.generator.TicketGenerator;
import com.extsoft.happy.ticket.input.InputReader;

/**
 * @author Dmytro Serdiuk
 */
public class App {

    public static void main(String[] args) {
        String method = new InputReader().getCalculationMethod(args);

        if ("Moscow".equalsIgnoreCase(method)) {
            calculate(new MoskowCalculationMethod());
        } else if ("Piter".equalsIgnoreCase(method)) {
            calculate(new PiterCalculationMethod());
        } else {
            System.out.println("Provided calculation method is unknown: " + method);
        }
    }

    private static void calculate(CalculationMethod calculationMethod) {
        TicketGenerator ticketGenerator = new TicketGenerator();
        new TicketsCalculator(ticketGenerator, calculationMethod).calculate();
    }
}
