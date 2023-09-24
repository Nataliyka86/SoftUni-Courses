namespace Graduation_10
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string studentName = Console.ReadLine();
            double allGrades = 0.00;
            int count = 0;
            bool expell = false;

            while (count < 12)
            {
                double grade = double.Parse(Console.ReadLine());
                count++;

                if (grade < 4.00)
                {
                    if (expell == true)
                    {
                        Console.WriteLine($"{studentName} has been excluded at {count} grade");
                        break;
                    }
                    expell = true;
                    count--;
                }
                allGrades += grade;

            }
            if (expell == false)
            {
                Console.WriteLine("{0} graduated. Average grade: {1:F2}", studentName, allGrades / count);
            }

        }
    }
}