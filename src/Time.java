public class Time {
    private int hour;
    private int minute;
    private int second;

    /**
     * A constructor in the Time Class to create objects that starts with the initial time provided by the parameters.
     * @param h an integer that represents the hour of the initial time
     * @param m an integer that represents the minute of the initial time
     * @param s an integer that represents the second of the initial time
     */
    public Time(int h, int m, int s)
    {
        hour = h;
        minute = m;
        second = s;
    }

    /**
     * A method in the Time Class that ticks the second hand of a clock by 1 each time
     */
    public void tick()
    {
        second ++;
        if (second == 60)
        {
            minute ++;
            second = 0;
            if (minute == 60)
            {
                hour ++;
                minute = 0;
                if (hour > 24)
                {
                    hour = 0;
                }
            }
        }
    }

    /**
     * A method in the Time Class adds the time of two objects that's created in the Main Class.
     * @param object an object created in the Main Class that is added to another object
     */
    public void add(Time object)
    {
        this.second += object.second;
        if (this.second >= 60)
        {
            this.minute++;
            this.second -= 60;
        }
        this.minute += object.minute;
        if (this.minute >= 60)
        {
            this.hour++;
            this.minute -= 60;
        }
        this.hour += object.hour;
        if (this.hour > 24)
        {
            this.hour -= 25;
        }


    }

    /**
     * A method in the Time Class that is used to return the current time.
     * @return the time in the format of HH:MM:SS
     */
    public String toString()
    {
        String h = Integer.toString(hour);;
        String m = Integer.toString(minute);
        String s = Integer.toString(second);
        if (hour < 10)
        {
            h = "0" + hour;
        }
        if (minute < 10)
        {
            m = "0" + minute;
        }
        if (second < 10)
        {
            s = "0" + second;
        }
        return h + ":" + m + ":" + s;
    }
}
