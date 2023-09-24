namespace ExamPreparation_04
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int numberOfPoorGrades = int.Parse(Console.ReadLine());
            double score = 0.00;
            int countProblems = 0;
            int countPoorGrades = 0;
            string lastProblem = "";

            while (countPoorGrades < numberOfPoorGrades)
            {
                string nameProblem = Console.ReadLine();
                if (nameProblem == "Enough")
                {
                    break;
                }
                lastProblem = nameProblem;
                int grade = int.Parse(Console.ReadLine());
                score += grade;
                countProblems++;
                if (grade <= 4)
                {
                    countPoorGrades++;
                }
            }
            if (countPoorGrades == numberOfPoorGrades)
            {
                Console.WriteLine($"You need a break, {countPoorGrades} poor grades.");
            }
            else
            {
                Console.WriteLine("Average score: {0:F2}", score / countProblems);
                Console.WriteLine($"Number of problems: {countProblems}");
                Console.WriteLine($"Last problem: {lastProblem}");
            }
        }
    }
}