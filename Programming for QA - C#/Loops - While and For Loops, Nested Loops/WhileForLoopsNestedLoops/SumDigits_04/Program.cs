namespace SumDigits_04
{
    internal class Program
    {
        static void Main(string[] args)
        {
            double number = double.Parse(Console.ReadLine());
            string input = Console.ReadLine();

            while (input != "End")
            {
                if (input == "Inc")
                    number++;
                else
                    number--;

                input = Console.ReadLine();
            }
            Console.WriteLine(number);
        }
    }
}