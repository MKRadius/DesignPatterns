public class Main {
    public static void main(String[] args) {
        NewDateInterface dateAdapter = new CalendarToNewDateAdapter();
        
        dateAdapter.setDay(8);
        dateAdapter.setMonth(4);
        dateAdapter.setYear(2024);
        System.out.println(dateAdapter.getDay() + "." + dateAdapter.getMonth() + "." + dateAdapter.getYear());  

        dateAdapter.advanceDays(2);
        System.out.println(dateAdapter.getDay() + "." + dateAdapter.getMonth() + "." + dateAdapter.getYear());
    }
}
