package com.extsoft.happy.ticket.calculator;

import com.extsoft.happy.ticket.Ticket;
import com.extsoft.happy.ticket.generator.TicketGenerator;

/**
 * @author Dmytro Serdiuk
 */
public class TicketsCalculator {

    private final TicketGenerator ticketGenerator;
    private final CalculationMethod calculationMethod;

    public TicketsCalculator(TicketGenerator ticketGenerator, CalculationMethod calculationMethod) {
        this.ticketGenerator = ticketGenerator;
        this.calculationMethod = calculationMethod;
    }

    public void calculate() {
        int all = 0, happy = 0;

        while (ticketGenerator.hasNext()) {
            Ticket ticket = ticketGenerator.next();
            all++;
            if (calculationMethod.isHappy(ticket)) happy++;
        }
        System.out.println(String.format("%s tickets were calculated by %s method. There are %s happy tickets!",
                all, calculationMethod.methodName(), happy)
        );
    }
}
