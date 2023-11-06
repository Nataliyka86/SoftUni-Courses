using NUnit.Framework;

namespace TestApp.UnitTests;

public class CalculateTests
{
    [Test]
    public void Test_Addition_WhenParametersArePositive()
    {
        // Arrange
        Calculate calculator = new Calculate();

        // Act
        int actual = calculator.Addition(5, 2);

        // Assert
        Assert.AreEqual(7, actual, "Addition did not work properly.");
        Assert.Greater(actual, 0);
        
    }
    [Test]
    public void Test_Addition_WhenParametersAreNegative()
    {
        // Arrange
        Calculate calculator = new Calculate();

        // Act
        int actual = calculator.Addition(-2, -4);

        // Assert
        Assert.AreEqual(-6, actual, "Addition did not work properly.");
        Assert.Less(actual, 0);

    }

    [Test]
    public void Test_Subtraction()
    {
        Calculate calculate = new Calculate();
        int actual = calculate.Subtraction(5, 2);
        Assert.AreEqual(3, actual);
    }
}
