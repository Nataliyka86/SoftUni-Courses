namespace Grades_02
{
    internal class Program
    {
        static void Main(string[] args)
        {
            double grade = double.Parse(Console.ReadLine());
            PrintGradeInWords(grade);

        }
        public static void PrintGradeInWords(double grade)
        {
            if (grade < 3)
                Console.WriteLine("Fail");
            else if (grade < 3.50)
                Console.WriteLine("Average");
            else if (grade < 4.50)
                Console.WriteLine("Good");
            else if (grade < 5.50)
                Console.WriteLine("Very good");
            else
                Console.WriteLine("Excellent");
        }
    }
}