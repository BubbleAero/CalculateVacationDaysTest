import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.javaqa.CalculateVacationDays;

public class CalculateVacationDaysTest {

    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/bonus.csv")

    public void testShouldReturnThreeMonth(int expected, int income, int expenses, int threshold) {
        CalculateVacationDays service = new CalculateVacationDays();

        // подготавливаем данные:
       // int income = 10_000;
       // int expenses = 3_000;
       // int threshold = 20_000;

        // вызываем целевой метод:
        int actual = service.calculate(income, expenses, threshold);
        //int expected = 3;

        Assertions.assertEquals(expected, actual);


   /// @Test
    /// public void testShouldReturnTwoMonth(int expected, int income, int expenses, int threshold) {
    //        CalculateVacationDays service = new CalculateVacationDays();
    //
    //        // подготавливаем данные:
    //        int income = 100_000;
    //        int expenses = 60_000;
    //        int threshold = 150_000;
    //
    //        // вызываем целевой метод:
    //        int actual = service.calculate(income, expenses, threshold);
    //        int expected = 3;
    //
    //        Assertions.assertEquals(expected, actual);
    }
}