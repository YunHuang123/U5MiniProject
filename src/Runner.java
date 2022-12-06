public class Runner {
    public static void main(String[] args) {

        Time time1 = new Time(8, 9, 58);
        System.out.println(time1);
        time1.tick();
        System.out.println(time1);
        time1.tick();
        System.out.println(time1);
        time1.tick();
        System.out.println(time1);
        time1.tick();
        System.out.println(time1);
        time1.tick();
        time1.tick();
        time1.tick();
        time1.tick();
        time1.tick();
        time1.tick();
        time1.tick();
        time1.tick();
        System.out.println(time1);

        Time time2 = new Time(15, 59, 58);
        System.out.println(time2);
        time2.tick();
        System.out.println(time2);
        time2.tick();
        System.out.println(time2);
        time2.tick();
        System.out.println(time2);

        Time time4 = new Time(10, 14, 43);
        System.out.println(time4);
        Time time5 = new Time(8, 30, 29);
        time4.add(time5);
        System.out.println(time4);
        System.out.println(time5);

    }
}
