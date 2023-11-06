using NUnit.Framework;
using System;
using System.Collections.Generic;

namespace TestApp.UnitTests;

public class AdjacentEqualTests
{
    [Test]
    public void Test_Sum_InputIsNull_ShouldThrowArgumentException()
    {
        // Arrange
        List<int>? nullList = null;

        // Act & Assert
        Assert.Throws<ArgumentException>(() => { AdjacentEqual.Sum(nullList); });
    }


    [Test]
    public void Test_Sum_InputIsEmptyList_ShouldReturnEmptyString()
    {
        // Arrange
        List<int> emptyList = new();

        // Act
        string result = AdjacentEqual.Sum(emptyList);
        string expectedResult = "";

        // Assert
        Assert.AreEqual(expectedResult, result);

    }


    [Test]
    public void Test_Sum_NoAdjacentEqualNumbers_ShouldReturnOriginalList()
    {
        // Arrange
        List<int> noEqualList = new List<int>() { 1, 2, 3 };

        // Act
        string result = AdjacentEqual.Sum(noEqualList);
        string expectedResult = "1 2 3";

        // Assert
        Assert.AreEqual(expectedResult, result);
    }

    [Test]
    public void Test_Sum_AdjacentEqualNumbersExist_ShouldReturnSummedList()
    {

        // Arrange
        List<int> equalList = new List<int>() { 1, 2, 2, 3 };

        // Act
        string result = AdjacentEqual.Sum(equalList);
        string expectedResult = "1 4 3";

        // Assert
        Assert.AreEqual(expectedResult, result);
    }

    [Test]
    public void Test_Sum_AllNumbersAreAdjacentEqual_ShouldReturnSingleSummedNumber()
    {
        // Arrange
        List<int> equalList = new List<int>() { 1, 1, 2, 4 };

        // Act
        string result = AdjacentEqual.Sum(equalList);
        string expectedResult = "8";

        // Assert
        Assert.AreEqual(expectedResult, result);
    }

    [Test]
    public void Test_Sum_AdjacentEqualNumbersAtBeginning_ShouldReturnSummedList()
    {
        // Arrange
        List<int> equalList = new List<int>() { 1, 1, 3, 4 };

        // Act
        string result = AdjacentEqual.Sum(equalList);
        string expectedResult = "2 3 4";

        // Assert
        Assert.AreEqual(expectedResult, result);
    }

    [Test]
    public void Test_Sum_AdjacentEqualNumbersAtEnd_ShouldReturnSummedList()
    {
        // Arrange
        List<int> equalList = new List<int>() { 1, 2, 4, 3, 3 };

        // Act
        string result = AdjacentEqual.Sum(equalList);
        string expectedResult = "1 2 4 6";

        // Assert
        Assert.AreEqual(expectedResult, result);
    }

    [Test]
    public void Test_Sum_AdjacentEqualNumbersInMiddle_ShouldReturnSummedList()
    {
        // Arrange
        List<int> equalList = new List<int>() { 1, 2, 4, 4, 3, 5 };

        // Act
        string result = AdjacentEqual.Sum(equalList);
        string expectedResult = "1 2 8 3 5";

        // Assert
        Assert.AreEqual(expectedResult, result);
    }
}
