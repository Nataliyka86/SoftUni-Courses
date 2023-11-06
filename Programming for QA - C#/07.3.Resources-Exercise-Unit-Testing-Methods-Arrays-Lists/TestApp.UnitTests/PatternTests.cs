using NUnit.Framework;

using System;

namespace TestApp.UnitTests;

public class PatternTests
{
    
    [Test]
    public void Test_SortInPattern_NullInput_ThrowsException()
    {
        // Arrange
        int[]? inputArray = null;

        // Act + Assert
        Assert.Throws<ArgumentException>(() => { Pattern.SortInPattern(inputArray); });
    }

    [Test]
    public void Test_SortInPattern_SortsIntArrayInPattern_SortsCorrectly()
    {
        int[] inputArray = new int[] { 1, 2, 1, 3, 4, 10, 12, 15 };
        int[] outputArray = Pattern.SortInPattern(inputArray);
        int[] resultArray = new int[] { 1, 15, 2, 12, 3, 10, 4 };
        CollectionAssert.AreEqual(resultArray, outputArray);
    }

    [Test]
    public void Test_SortInPattern_EmptyArray_ReturnsEmptyArray()
    {
        int[] inputArray = Array.Empty<int>();
        int[] outputArray = Pattern.SortInPattern(inputArray);
        CollectionAssert.AreEqual(inputArray, outputArray);
    }

    [Test]
    public void Test_SortInPattern_SingleElementArray_ReturnsSameArray()
    {
        int[] inputArray = new int[] { 1};
        int[] outputArray = Pattern.SortInPattern(inputArray);
        
        CollectionAssert.AreEqual(inputArray, outputArray);
    }
}
