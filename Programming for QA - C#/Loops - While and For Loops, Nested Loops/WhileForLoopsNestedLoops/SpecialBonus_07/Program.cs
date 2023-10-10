namespace SpecialBonus_07
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int stopNumber = int.Parse(Console.ReadLine());
            bool isFound = false;
            double previousNumber = 0;

            while (!isFound)
            {
                int number = int.Parse(Console.ReadLine());

                if (number == stopNumber)
                {
                    isFound = true;
                    break;
                }
                previousNumber = number;
            }
            previousNumber = previousNumber + previousNumber * 0.20;
            Console.WriteLine(previousNumber);
        }
    }
}