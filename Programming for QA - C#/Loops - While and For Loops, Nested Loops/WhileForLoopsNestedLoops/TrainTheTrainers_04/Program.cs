namespace TrainTheTrainers_04
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            string presentation = Console.ReadLine();
            double sumOfAllGrades = 0.00;
            int countOfPresentations = 0;

            while (presentation != "Finish")
            {
                double allGrades = 0.00;
                for (int i = 0; i < n; i++)
                {
                    double grade = double.Parse(Console.ReadLine());
                    allGrades += grade;
                    countOfPresentations++;
                }
                Console.WriteLine("{0} - {1:F2}.", presentation, allGrades / n);
                sumOfAllGrades += allGrades;
                presentation = Console.ReadLine();
            }

            Console.WriteLine("Student's final assessment is {0:F2}.", sumOfAllGrades / countOfPresentations);
        }
    }
}