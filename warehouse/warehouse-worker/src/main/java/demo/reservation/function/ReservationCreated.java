package demo.reservation.function;

import demo.reservation.domain.Reservation;
import demo.reservation.domain.ReservationStatus;
import demo.reservation.event.ReservationEvent;
import demo.reservation.event.ReservationEventType;
import org.apache.log4j.Logger;
import org.springframework.statemachine.StateContext;

import java.util.function.Function;

public class ReservationCreated extends ReservationFunction {

    final private Logger log = Logger.getLogger(ReservationCreated.class);

    public ReservationCreated(StateContext<ReservationStatus, ReservationEventType> context, Function<ReservationEvent,
            Reservation> lambda) {
        super(context, lambda);
    }

    /**
     * Apply an {@link ReservationEvent} to the lambda function that was provided through the
     * constructor of this {@link ReservationFunction}.
     *
     * @param event is the {@link ReservationEvent} to apply to the lambda function
     */
    @Override
    public Reservation apply(ReservationEvent event) {
        log.info("Executing workflow for reservation created...");
        return super.apply(event);
    }
}
