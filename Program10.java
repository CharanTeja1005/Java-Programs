class InvalidAgeException extends Exception {
    public InvalidAgeException(String message)
    {
        super(message);
    }
}

class ExpiryAgeException extends Exception {
    public ExpiryAgeException(String message)
    {
        super(message);
    }
}

public class Program10 {
    private static boolean isValid(int age) throws InvalidAgeException, ExpiryAgeException
    {
        if(age < 0) throw new InvalidAgeException("Age should be positive");
        else if(age > 100) throw new ExpiryAgeException("You've lived enough");
        return true;
    }

    public static void main(String[] args) {
        try
        {
            int age = -10;
            // System.out.println(isValid(age));
            age = 101;
            System.out.println(isValid(age));
        }
        catch(InvalidAgeException e)
        {
            System.out.println(e.getMessage());
        }
        catch(ExpiryAgeException e)
        {
            System.out.println(e.getMessage());
        }
    }
}