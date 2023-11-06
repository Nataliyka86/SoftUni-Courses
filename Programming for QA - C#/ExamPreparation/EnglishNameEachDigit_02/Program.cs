namespace EnglishNameEachDigit_02
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int number = int.Parse(Console.ReadLine());

            while (number > 0)
            {
                int currentDigit = number % 10;
                Console.WriteLine(ReturnEnglishNameOfDIgit(currentDigit));
                number /= 10;
            }
        }
        public static string ReturnEnglishNameOfDIgit(int n)
        {
            string output = "";
            if (n == 1)
                output = "one";
            else if (n == 2)
                output = "two";
            else if (n == 3)
                output = "three";
            else if (n == 4)
                output = "four";
            else if (n == 5)
                output = "five";
            else if (n == 6)
                output = "six";
            else if (n == 7)
                output = "seven";
            else if (n == 8)
                output = "eight";
            else if (n == 9)
                output = "nine";
            return output;
        }
    }
}