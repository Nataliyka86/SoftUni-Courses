namespace ChangeList_01
{
    internal class Program
    {
        static void Main(string[] args)
        {
            List<int> numbers = Console.ReadLine().Split(" ").Select(int.Parse).ToList();
            string command = Console.ReadLine();

            while (command != "end")
            {
                string[] commandArr = command.Split(" ");
                int element = int.Parse(commandArr[1]);
                switch (commandArr[0])
                {
                    case "Delete":
                        numbers.RemoveAll(n => n == element);
                        break;
                    case "Insert":
                        int position = int.Parse(commandArr[2]);
                        numbers.Insert(position, element);
                        break;
                }
                command = Console.ReadLine();
            }

            Console.WriteLine(string.Join(" ", numbers));
        }
    }
}