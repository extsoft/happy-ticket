package com.extsoft.happy.ticket.calculator;

import com.extsoft.happy.ticket.Ticket;

/**
 * @author Dmytro Serdiuk
 */
public class MoskowCalculationMethod implements CalculationMethod {

    @Override
    public String methodName() {
        return "Moscow";
    }

    @Override
    public boolean isHappy(Ticket ticket) {
        Integer[] number = ticket.getNumber();
        return number[0] + number[1] + number[2] == number[3] + number[4] + number[5];
    }
}
