public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int h, int m, int s)
    {
        hour = h;
        minute = m;
        second = s;
    }

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
