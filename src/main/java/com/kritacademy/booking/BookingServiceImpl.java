package com.kritacademy.booking;

import com.kritacademy.audit.Logger;
import com.kritacademy.audit.LoggerFactory;

import java.util.Arrays;
import java.util.List;

/**
 * Service of booking
 * Created by Chertpong on 11/22/2016.
 */
public class BookingServiceImpl implements BookingService {
    private static final Logger logger = LoggerFactory.getLogger();
    public List<Booking> getAll() {
        logger.debug("BookingServiceImpl.getAll(): start");
        return Arrays.asList(new Booking("John"), new Booking("Jenny"));
    }
}
