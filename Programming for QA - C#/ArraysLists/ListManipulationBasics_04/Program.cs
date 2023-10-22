namespace ListManipulationBasics_04
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
                int number = int.Parse(commandArr[1]);
                switch (commandArr[0])
                {
                    case "Add":
                        list.Add(number);
                        break;
                    case "Remove":
                        list.Remove(number);
                        break;
                    case "RemoveAt":
                        list.RemoveAt(number);
                        break;
                    case "Insert":
                        int index = int.Parse(commandArr[2]);
                        list.Insert(index, number);
                        break;
                }
                command = Console.ReadLine();
            }

            Console.WriteLine(string.Join(" ", list));
        }
    }
}