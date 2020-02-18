//******************************************************************************
//  Utilizes recursion to display the lyrics of "The Twelve Days of Christmas".
//******************************************************************************
public class TwelveDaysOfChristmas
{
    private static String[] lyrics = {"a partridge in a pear tree.", "and a partridge in a pear tree.", "two turtle doves,", "three French hens,", "four calling birds,", "five gold rings,", "six geese a laying,", "seven swans a swimming,", "eight maids a milking,", "nine ladies dancing,", "ten lords a leaping,", "eleven pipers piping,", "twelve drummers drumming,"};
    private static String[] days = {"","first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eight", "ninth","tenth", "eleventh", "twelfth"};

    //-----------------------------------------------------
    //  Prints out the lyrics for each day of "The Twelve
    //  Days of Christmas".
    //-----------------------------------------------------
    public static void main(String args[])
    {
        for (int i = 1; i <= 12; i++)
        {
            singleDay(i, true);
            System.out.println();
        } // end for
    } // end method main

    //-----------------------------------------------------
    //  Prints out the lyrics for a single day of "The
    //  Twelve Days of Christmas".
    //-----------------------------------------------------
    public static void singleDay(int day, boolean check) // check is necessary to prevent day repetition; always set as true when calling
    {
        boolean noAndCheck = false; // checks to see whether or not it is necessary to include the "and" in the statement
        if (check)
        {
            check = false;
            if (day == 1)
            {
                noAndCheck = true;
            } // end inner if
            System.out.print("On the " + days[day] + " day of Christmas, my true love gave to me ");
        } // end if
        if (noAndCheck)
        {
            System.out.print(lyrics[0]);
        } // end if
        else
        {
            System.out.print(lyrics[day] + " ");
        } // end else
        if (day > 1) // base case
        {
            singleDay(day - 1, false);
        } // end if
    } // end method singleDay
} // end class TwelveDaysOfChristmas

