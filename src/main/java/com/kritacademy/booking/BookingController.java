package com.kritacademy.booking;

import com.kritacademy.audit.Logger;
import com.kritacademy.audit.LoggerFactory;

import java.util.List;

/**
 * API interface of booking service
 * Created by Chertpong on 11/22/2016.
 */
public class BookingController {
    private static final Logger logger = LoggerFactory.getLogger();
    private BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    public List<Booking> getAll() {
        logger.debug("BookingController.getAll(): starting");
        return bookingService.getAll();
    }
}
