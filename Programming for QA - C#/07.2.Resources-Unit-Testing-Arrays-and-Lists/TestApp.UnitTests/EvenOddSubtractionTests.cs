using NUnit.Framework;

using System;

namespace TestApp.UnitTests;

public class EvenOddSubtractionTests
{
    [Test]
    public void Test_FindDifference_InputIsEmpty_ShouldReturnZero()
    {
        // Arrange
        int[] emptyArray = Array.Empty<int>();

        // Act
        int result = EvenOddSubtraction.FindDifference(emptyArray);

        // Assert
        Assert.That(result, Is.EqualTo(0));
    }

    // TODO: finish the test
    [Test]
    public void Test_FindDifference_InputHasOnlyEvenNumbers_ShouldReturnEvenSum()
    {
        // Arrange
        int[] evenArray = new int[] { 2, 4, 6 };

        // Act
        int result = EvenOddSubtraction.FindDifference(evenArray);

        // Assert
       Assert.AreEqual(12, result);
    }

    [Test]
    public void Test_FindDifference_InputHasOnlyOddNumbers_ShouldReturnOddSum()
    {
        int[] oddArray = new int[] { 1, 3, 5 };
        int result = EvenOddSubtraction.FindDifference(oddArray);
        Assert.AreEqual(9, result);
    }

    [Test]
    public void Test_FindDifference_InputHasMixedNumbers_ShouldReturnDifference()
    {
        int[] oddArray = new int[] { 1, 2, 3, 4, 5 };
        int result = EvenOddSubtraction.FindDifference(oddArray);
        Assert.AreEqual(3, result);
    }
}
