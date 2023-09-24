namespace Moving_09
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int widthFreeSpace = int.Parse(Console.ReadLine());
            int lengthFreeSpace = int.Parse(Console.ReadLine());
            int heightFreeSpace = int.Parse(Console.ReadLine());
            string input = Console.ReadLine();
            bool isRunsOut = false;

            int volumeFreeSpace = widthFreeSpace * lengthFreeSpace * heightFreeSpace;

            while (input != "Done")
            {
                int numberOfBoxes = int.Parse(input);
                volumeFreeSpace -= numberOfBoxes;
                if (volumeFreeSpace < 0)
                {
                    isRunsOut = true;
                    break;
                }

                input = Console.ReadLine();
            }

            if (isRunsOut)
            {
                Console.WriteLine("No more free space! You need {0} Cubic meters more.", Math.Abs(volumeFreeSpace));
            }
            else
            {
                Console.WriteLine($"{volumeFreeSpace} Cubic meters left.");
            }
        }
    }
}