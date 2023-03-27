import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Holiday[] holidays = new Holiday[] {
                new Holiday("01/01/2023", "Confraternização mundial"),
                new Holiday("21/02/2023", "Carnaval"),
                new Holiday("17/04/2023", "Páscoa"),
                new Holiday("21/04/2023", "Tiradentes"),
                new Holiday("01/05/2023", "Dia do trabalho"),
                new Holiday("08/06/2023", "Corpus Christi"),
                new Holiday("07/09/2023", "Independência do Brasil"),
                new Holiday("12/10/2023", "Nossa Senhora Aparecida"),
                new Holiday("02/11/2023", "Finados"),
                new Holiday("15/11/2023", "Proclamação da República"),
                new Holiday("25/12/2023", "Natal")
        };

        CheckHoliday function = new CheckHoliday(holidays);

        System.out.println("A lista completa de feriados é: \n");
        function.allHolidays();

        Scanner input = new Scanner(System.in);
        System.out.println("\n Informe a data do feriado que quer buscar (Ex.: 01/01/2023) ");
        String date = input.nextLine();

        System.out.println(function.isHoliday(date));
    }
}
