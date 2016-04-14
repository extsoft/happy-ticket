package com.extsoft.happy.ticket.generator;

import com.extsoft.happy.ticket.Ticket;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author Dmytro Serdiuk
 */
public class TicketGenerator implements Iterator<Ticket> {

    private final Integer[] currentTicket = new Integer[]{0, 0, 0, 0, 0, 0};

    @Override
    public Ticket next() {
        for (Integer position : positionToUpdate()) {
            Integer value = currentTicket[position];
            if (value == 9) {
                currentTicket[position] = 0;
            } else {
                currentTicket[position] = ++value;
            }
        }
        return new Ticket(currentTicket);
    }

    private Set<Integer> positionToUpdate() {
        Set<Integer> result = new HashSet<>();

        for (int position = 5; position >= 0; position--) {
            if (currentTicket[position] == 9) {
                result.add(position);
            } else {
                result.add(position);
                break;
            }
        }
        return result;
    }

    @Override
    public boolean hasNext() {
        for (Integer digit : currentTicket) {
            if (digit != 9) {
                return true;
            }
        }
        return false;
    }
}
