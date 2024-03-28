import fr.ecole3il.rodez2023.carte.elements.Case;
import org.junit.jupiter.api.Test;
import fr.ecole3il.rodez2023.carte.AdaptateurAlgorithme;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdaptateurAlgorithmeTests {


    @Test
    public void testCalculerCout() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Case from = new Case(null, 0, 0);
        Case to = new Case(null, 3, 4);
        double expectedCost = 7.0;
        // Utilisation de la réflexion pour obtenir la méthode calculerCout
        Method method = AdaptateurAlgorithme.class.getDeclaredMethod("calculerCout", Case.class, Case.class);
        method.setAccessible(true); // Rendre la méthode accessible même si elle est privée

        // Appel de la méthode calculerCout avec les instances from et to
        double actualCost = (double) method.invoke(null, from, to);
        assertEquals(expectedCost, actualCost, 0.01); // 0.01 is the delta for double comparison
    }
}
