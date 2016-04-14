package com.extsoft.happy.ticket.calculator;

import com.extsoft.happy.ticket.Ticket;

/**
 * @author Dmytro Serdiuk
 */
public interface CalculationMethod {

    String methodName();

    boolean isHappy(Ticket ticket);
}
