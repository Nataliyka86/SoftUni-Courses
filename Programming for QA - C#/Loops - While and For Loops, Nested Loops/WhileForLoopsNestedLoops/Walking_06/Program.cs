namespace Walking_06
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string input = Console.ReadLine();
            int allStepsPerDay = 0;

            while (input != "Going home")
            {
                int steps = int.Parse(input);
                allStepsPerDay += steps;
                if (allStepsPerDay >= 10000)
                {
                    break;
                }
                input = Console.ReadLine();
            }
            if (input == "Going home")
            {
                int steps = int.Parse(Console.ReadLine());
                allStepsPerDay += steps;
            }
            if (allStepsPerDay >= 10000)
            {
                Console.WriteLine("Goal reached! Good job!");
                Console.WriteLine("{0} steps over the goal!", allStepsPerDay - 10000);
            }
            else
            {
                Console.WriteLine("{0} more steps to reach goal.", 10000 - allStepsPerDay);
            }
        }
    }
}