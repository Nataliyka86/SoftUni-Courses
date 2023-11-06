using NUnit.Framework;

namespace TestApp.UnitTests;

public class FibonacciTests
{
    [Test]
    public void Test_CalculateFibonacci_NegativeInput()
    {
        // Arrange
        int n = -1;

        // Act & Assert
        Assert.That(() => Fibonacci.CalculateFibonacci(n), Throws.ArgumentException);
    }

    [Test]
    public void Test_CalculateFibonacci_ZeroInput()
    {
        int n = 0;
        int ouput = Fibonacci.CalculateFibonacci(n);
        Assert.AreEqual(0, ouput);
    }

    [Test]
    public void Test_CalculateFibonacci_PositiveInput()
    {
        int n =10;
        int output = Fibonacci.CalculateFibonacci(n);
        Assert.AreEqual(55, output);
    }
}