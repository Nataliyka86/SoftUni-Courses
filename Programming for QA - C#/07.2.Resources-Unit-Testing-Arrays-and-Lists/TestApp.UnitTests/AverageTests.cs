using NUnit.Framework;

using System;

namespace TestApp.UnitTests;

public class AverageTests
{
    
    [Test]
    public void Test_CalculateAverage_InputIsEmptyArray_ShouldThrowArgumentException()
    {
        // Arrange
        int[] emptyArray = Array.Empty<int>();

        // Act & Assert       
        Assert.Throws<ArgumentException>(() => { Average.CalculateAverage(emptyArray); });
       
    }
    
    [Test]
    public void Test_CalculateAverage_InputHasOneElement_ShouldReturnSameElement()
    {
        // Arrange
        int[] array = new int[] { 42 };

        // Act
        double result = Average.CalculateAverage(array);

        // Assert
        Assert.AreEqual(42.0, result);
    }

    [Test]
    public void Test_CalculateAverage_InputHasPositiveIntegers_ShouldReturnCorrectAverage()
    {
        int[] positiveArray = new int[] { 1, 2, 3 };
        double result = Average.CalculateAverage(positiveArray);
        Assert.AreEqual(2, result);
    }

    [Test]
    public void Test_CalculateAverage_InputHasNegativeIntegers_ShouldReturnCorrectAverage()
    {
        int[] positiveArray = new int[] { -1, -2, -3 };
        double result = Average.CalculateAverage(positiveArray);
        Assert.AreEqual(-2, result);
    }

    [Test]
    public void Test_CalculateAverage_InputHasMixedIntegers_ShouldReturnCorrectAverage()
    {
        int[] positiveArray = new int[] { -1, 2, 5 };
        double result = Average.CalculateAverage(positiveArray);
        Assert.AreEqual(2, result);
    }
}
