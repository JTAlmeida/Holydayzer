public class CheckHoliday {
    private Holiday[] holidays;

    CheckHoliday(Holiday[] data) {
        this.holidays = data;
    }

    String isHoliday(String date) {
        for (int i = 0; i < this.holidays.length; i++) {
            if (holidays[i].getDate().equals(date)) {
                return "Nesta data temos o feriado " + holidays[i].getName() + ".";
            }
        }
        return "Não existe um feriado nesta data.";
    }

    void allHolidays() {
        for (Holiday h : holidays) {
            System.out.println(h.getName());
        }
    }
}
