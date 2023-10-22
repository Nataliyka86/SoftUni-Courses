namespace DayOfWeek_01
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());

            string[] daysArr = {
            "Monday", "Tuesday", " Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
            };
            if (n <= 0 || n > 7)
            {
                Console.WriteLine("Invalid day!");
            }
            else
            {
                Console.WriteLine(daysArr[n - 1]);
            }
        }
    }
}
