namespace OnTimeForExam_08
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int hourExam = int.Parse(Console.ReadLine()); // 0 - 23
            int minExam = int.Parse(Console.ReadLine()); // 0 - 59
            int hourArrived = int.Parse(Console.ReadLine()); // 0 - 23
            int minArrived = int.Parse(Console.ReadLine()); // 0 - 59

            int onlyMinExam = hourExam * 60 + minExam;
            int onlyMinArrived = hourArrived * 60 + minArrived;

            if (onlyMinArrived < onlyMinExam - 30)
            {
                Console.WriteLine("Early");
                int difference = onlyMinExam - onlyMinArrived;
                int hours = difference / 60;
                int minutes = difference % 60;
                if (hours == 0)
                {
                    Console.WriteLine("{0} minutes before the start", minutes);
                }
                else
                {
                    Console.WriteLine("{0}:{1:D2} hours before the start", hours, minutes);
                }
            }
            else if (onlyMinExam == onlyMinArrived)
            {
                Console.WriteLine("On time");
            }
            else if (onlyMinArrived >= onlyMinExam - 30 && onlyMinArrived < onlyMinExam)
            {
                Console.WriteLine("On time");
                int difference = onlyMinExam - onlyMinArrived;
                Console.WriteLine("{0} minutes before the start", difference);
            }
            else
            {
                Console.WriteLine("Late");
                int difference = onlyMinArrived - onlyMinExam;
                int hours = difference / 60;
                int minutes = difference % 60;
                if (hours == 0)
                {
                    Console.WriteLine("{0} minutes after the start", minutes);
                }
                else
                {
                    Console.WriteLine("{0}:{1:D2} hours after the start", hours, minutes);
                }
            }
        }
    }
}