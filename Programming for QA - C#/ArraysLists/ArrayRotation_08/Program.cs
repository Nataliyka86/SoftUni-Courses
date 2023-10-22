namespace ArrayRotation_08
{
    internal class Program
    {
        static void Main(string[] args)
        {
            List<int> list = Console.ReadLine().Split(" ").Select(int.Parse).ToList();
            int number = int.Parse(Console.ReadLine());

            for (int i = 1; i <= number; i++)
            {
                list.Add(list[0]);
                list.RemoveAt(0);
            }
            Console.WriteLine(string.Join(" ", list));
        }
    }
}