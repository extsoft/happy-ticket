package com.extsoft.happy.ticket.calculator;

import com.extsoft.happy.ticket.Ticket;

/**
 * @author Dmytro Serdiuk
 */
public class PiterCalculationMethod implements CalculationMethod {

    @Override
    public String methodName() {
        return "Piter";
    }

    @Override
    public boolean isHappy(Ticket ticket) {
        Integer[] number = ticket.getNumber();
        return number[0] + number[2] + number[4] == number[1] + number[3] + number[5];
    }
}
