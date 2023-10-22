namespace ListManipulationAdvanced_05
{
    internal class Program
    {
        static void Main(string[] args)
        {
            List<int> list = Console.ReadLine().Split(" ").Select(int.Parse).ToList();
            string command = Console.ReadLine();

            while (command != "end")
            {
                string[] commandArr = command.Split(" ");
                switch (commandArr[0])
                {
                    case "Contains":
                        int number = int.Parse(commandArr[1]);
                        if (list.Contains(number))
                            Console.WriteLine("Yes");
                        else
                            Console.WriteLine("No such number");
                        break;
                    case "PrintEven":
                        foreach (int num in list)
                        {
                            if (num % 2 == 0)
                                Console.Write(num + " ");
                        }
                        Console.WriteLine();
                        break;
                    case "PrintOdd":
                        foreach (int num in list)
                        {
                            if (num % 2 != 0)
                                Console.Write(num + " ");
                        }
                        Console.WriteLine();
                        break;
                    case "GetSum":
                        int sum = 0;
                        foreach (int num in list)
                            sum += num;
                        Console.WriteLine(sum);
                        break;
                    case "Filter":
                        string condition = commandArr[1];
                        int number2 = int.Parse(commandArr[2]);
                        if (condition == ">=")
                        {
                            list = list.FindAll(x => x >= number2);
                        }
                        else if (condition == "<=")
                        {
                            list = list.FindAll(x => x <= number2);
                        }
                        else if (condition == "<")
                        {
                            list = list.FindAll(x => x < number2);
                        }
                        else if (condition == ">")
                        {
                            list = list.FindAll(x => x > number2);
                        }
                        break;
                }

                command = Console.ReadLine();
            }
            Console.WriteLine(string.Join(" ", list));
        }
    }
}