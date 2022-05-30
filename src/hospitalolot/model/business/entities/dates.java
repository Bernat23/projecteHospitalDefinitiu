/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitalolot.model.business.entities;

import hospitalolot.model.persistence.dao.implementations.jdbc.JDBCGuardies;
import hospitalolot.model.persistence.dao.implementations.jdbc.utils.JDBCTipusGuardia;
import hospitalolot.model.persistence.exception.DAOException;
import java.time.LocalDate;
import static java.time.temporal.TemporalAdjusters.next;
import java.time.DayOfWeek;
import static java.time.DayOfWeek.SUNDAY;
import java.util.List;

/**
 *
 * @author Bernat
 */
public class dates {

    static LocalDate dataActual = LocalDate.now();
    LocalDate data;
    JDBCTipusGuardia jtg = new JDBCTipusGuardia();
    JDBCGuardies jg = new JDBCGuardies();

    public void crearGuardies() throws DAOException {
        LocalDate anyQueVe = LocalDate.now().plusYears(1); //any següent quan s'ha d'acabar
        if (dataActual.getDayOfWeek() == SUNDAY) {

        } else {
            dataActual = dataActual.with(next(SUNDAY));
        }
        boolean arribaAny;
        List<Guardies> guardies = jtg.getAll();
        do {
            //System.out.println((dataActual.compareTo(anyQueVe) == -1)); Comprovacio de com funciona el compareTo
            if (dataActual.compareTo(anyQueVe) == 1) {
                arribaAny = false;
            } else {
                arribaAny = true;
                for (int i = 0; i < guardies.size(); i++) {
                    Guardies g = guardies.get(i);
                    g.setDia(dataActual);
                    jg.add(g);
                }
                dataActual = dataActual.with(next(SUNDAY));

            }
        } while (arribaAny);

    }
}
