package Pregunta2.Fase3.Pruebas;

import Pregunta2.Fase2.Produccion.Passenger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import Pregunta2.Fase3.Produccion.*;

public class AirportTest {

    @DisplayName("Dado que hay un vuelo economico")
    @Nested
    class EconomyFlightTest {

        private Pregunta2.Fase2.Produccion.Flight economyFlight;

        @BeforeEach
        void setUp() {
            economyFlight = new Pregunta2.Fase2.Produccion.EconomyFlight("1");
        }

        @Test
        public void testEconomyFlightRegularPassenger() {
            Pregunta2.Fase2.Produccion.Passenger jessica = new Pregunta2.Fase2.Produccion.Passenger("Jessica", false);

            assertEquals("1", economyFlight.getId());
            assertEquals(true, economyFlight.addPassenger(jessica));
            assertEquals(1, economyFlight.getPassengers().size());
            assertEquals("Jessica", economyFlight.getPassengers().get(0).getName());

            assertEquals(true, economyFlight.removePassenger(jessica));
            assertEquals(0, economyFlight.getPassengers().size());
        }

        @Test
        public void testEconomyFlightVipPassenger() {
            Pregunta2.Fase2.Produccion.Passenger cesar = new Pregunta2.Fase2.Produccion.Passenger("Cesar", true);

            assertEquals("1", economyFlight.getId());
            assertEquals(true, economyFlight.addPassenger(cesar));
            assertEquals(1, economyFlight.getPassengers().size());
            assertEquals("Cesar", economyFlight.getPassengers().get(0).getName());

            assertEquals(false, economyFlight.removePassenger(cesar));
            assertEquals(1, economyFlight.getPassengers().size());
        }

    }

    @DisplayName("Dado que hay un vuelo negocios")
    @Nested
    class BusinessFlightTest {
        private Pregunta2.Fase2.Produccion.Flight businessFlight;

        @BeforeEach
        void setUp() {
            businessFlight = new Pregunta2.Fase2.Produccion.BusinessFlight("2");
        }

        @Test
        public void testBusinessFlightRegularPassenger() {
            Pregunta2.Fase2.Produccion.Passenger jessica = new Pregunta2.Fase2.Produccion.Passenger("Jessica", false);

            assertEquals(false, businessFlight.addPassenger(jessica));
            assertEquals(0, businessFlight.getPassengers().size());
            assertEquals(false, businessFlight.removePassenger(jessica));
            assertEquals(0, businessFlight.getPassengers().size());

        }

        @Test
        public void testBusinessFlightVipPassenger() {
            Pregunta2.Fase2.Produccion.Passenger cesar = new Passenger("Cesar", true);

            assertEquals(true, businessFlight.addPassenger(cesar));
            assertEquals(1, businessFlight.getPassengers().size());
            assertEquals(false, businessFlight.removePassenger(cesar));
            assertEquals(1, businessFlight.getPassengers().size());
        }
    }
}