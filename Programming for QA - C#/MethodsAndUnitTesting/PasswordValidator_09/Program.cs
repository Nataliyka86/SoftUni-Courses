namespace PasswordValidator_09
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string password = Console.ReadLine();


            bool countCharacters = CheckCountCharacters(password);
            bool content = CheckContains(password);
            bool countDigits = CheckCountOfDigits(password);

            if (countCharacters && content && countDigits)
                Console.WriteLine("Password is valid");
            if (!countCharacters)
                Console.WriteLine("Password must be between 6 and 10 characters");
            if (!content)
                Console.WriteLine("Password must consist only of letters and digits");
            if (!countDigits)
                Console.WriteLine("Password must have at least 2 digits");

        }
        public static bool CheckCountCharacters(string password)
        {
            if (password.Length >= 6 && password.Length <= 10)
                return true;
            else
                return false;
        }

        public static bool CheckContains(string password)
        {
            for (int i = 0; i < password.Length; i++)
            {
                char currentSymbol = password[i];
                if ((currentSymbol >= 48 && currentSymbol <= 57) || (currentSymbol >= 65 && currentSymbol <= 90) || (currentSymbol >= 97 && currentSymbol <= 122))
                    continue;
                else
                    return false;
            }
            return true;
        }

        public static bool CheckCountOfDigits(string password)
        {
            int count = 0;
            for (int i = 0; i < password.Length; i++)
            {
                char currentSymbol = password[i];
                if (currentSymbol >= 48 && currentSymbol <= 57)
                {
                    count++;
                }
            }
            if (count >= 2)
                return true;
            else
                return false;
        }
    }
}