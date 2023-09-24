namespace SpecialNumbers_05
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());

            for (int i = 1111; i <= 9999; i++)
            {
                string currentNumber = i.ToString();
                int countWithoutRemainder = 0;
                for (int j = 0; j < currentNumber.Length; j++)
                {
                    int currentDigit = int.Parse(currentNumber[j].ToString());
                    if (currentDigit == 0)
                        break;
                    if (n % currentDigit == 0)
                    {
                        countWithoutRemainder++;
                    }
                    else
                    {
                        break;
                    }
                    if (countWithoutRemainder == 4)
                    {
                        Console.Write(currentNumber + " ");
                    }
                }
            }
        }
    }
}