namespace CalculateAverageGrade_01
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());

            double sumGrades = 0;

            for (int i = 1; i <= n; i++)
            {
                double grade = double.Parse(Console.ReadLine());
                sumGrades += grade;
            }
            double averageGrade = sumGrades / n;
            Console.WriteLine($"{averageGrade:F2}");
        }
    }
}