package com.extsoft.happy.ticket;

import java.util.Arrays;

/**
 * @author Dmytro Serdiuk
 */
public class Ticket {

    private final Integer[] number;

    public Ticket(Integer[] number) {
        this.number = number;
    }

    public Integer[] getNumber() {
        return number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ticket ticket = (Ticket) o;

        return Arrays.equals(number, ticket.number);

    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(number);
    }
}
