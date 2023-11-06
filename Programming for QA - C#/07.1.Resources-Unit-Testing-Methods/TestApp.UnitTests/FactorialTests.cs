using NUnit.Framework;
using System;

namespace TestApp.UnitTests;

public class FactorialTests
{
    [Test]
    public void CalculateFactorial_InputZero_ReturnsOne()
    {
        int input = 0;
        int output = Factorial.CalculateFactorial(input);
        Assert.AreEqual(1, output);
    }

    [Test]
    public void CalculateFactorial_InputPositiveNumber_ReturnsCorrectFactorial()
    {
        int input = 3;
        int output = Factorial.CalculateFactorial(input);
        Assert.AreEqual(6, output);
    }

    [Test]
    public void CalculateFactorial_InputNegativeNumber_ThrowsException()
    {
        int input = -3;        

        Assert.Throws<ArgumentOutOfRangeException>(() => { Factorial.CalculateFactorial(input); });
    }
}
