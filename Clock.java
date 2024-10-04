public class Clock
{
  public static void main(String[] args)
  {
    System.out.println(timeOfDay(17));
  }

  public static String timeOfDay(int n )
  {
    if (n == 0)
    {
      return("midnight");
    } 
    else if (n == 12)
    {
      return("noon");
    }
    else if (n == 18)
    {
      return("dusk");
    }
    else if ( 0 <= n && n <= 12)
    {
      return("morning");
    }
    else if (12 <= n && n <= 18)
    {
      return("afternoon");
    }
    else if (18 <= n && n <= 24)
    {
      return("evening");
    }
    return ("ERROR");
  }

}
