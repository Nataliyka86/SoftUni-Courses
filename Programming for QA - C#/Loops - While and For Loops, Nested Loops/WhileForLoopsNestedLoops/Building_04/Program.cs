namespace Building_04
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int floors = int.Parse(Console.ReadLine());
            int estates = int.Parse(Console.ReadLine());

            for (int i = floors; i >= 1; i--)
            {
                for (int j = 0; j < estates; j++)
                {
                    string type = "";
                    if (i == floors)
                    {
                        type = "L";
                    }
                    else if (i % 2 == 0)
                    {
                        type = "O";
                    }
                    else
                    {
                        type = "A";
                    }
                    Console.Write($"{type}{i}{j} ");

                }
                Console.WriteLine();
            }
        }
    }
}