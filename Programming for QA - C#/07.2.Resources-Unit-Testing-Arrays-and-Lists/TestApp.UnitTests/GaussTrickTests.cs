using NUnit.Framework;

using System.Collections.Generic;

namespace TestApp.UnitTests;

public class GaussTrickTests
{
    [Test]
    public void Test_SumPairs_InputIsEmptyList_ShouldReturnEmptyList()
    {
        // Arrange
        List<int> emptyList = new();

        // Act
        List<int> result = GaussTrick.SumPairs(emptyList);

        // Assert
        CollectionAssert.AreEqual(emptyList, result);
    }
   
    [Test]
    public void Test_SumPairs_InputHasSingleElement_ShouldReturnSameElement()
    {
        // Arrange
        List<int> singleElementList = new (){1};

        // Act
        List<int> result = GaussTrick.SumPairs(singleElementList);

        // Assert
        CollectionAssert.AreEqual(singleElementList, result);
    }
   
    [Test]
    public void Test_SumPairs_InputHasEvenCountElements_ShouldReturnSumPairs()
    {
        // Arrange
        List<int> evenCountList = new() { 1, 2, 3, 4 };
        List<int> expectedList = new List<int>() { 5, 5 };

        // Act
        List<int> result = GaussTrick.SumPairs(evenCountList);

        // Assert
        CollectionAssert.AreEqual(expectedList, result);     
    }

    [Test]
    public void Test_SumPairs_InputHasOddCountElements_ShouldReturnWithMiddleElement()
    {
        // Arrange
        List<int> evenCountList = new() { 1, 2, 3, 4, 5 };
        List<int> expectedList = new List<int>() { 6, 6, 3};

        // Act
        List<int> result = GaussTrick.SumPairs(evenCountList);

        // Assert
        CollectionAssert.AreEqual(expectedList, result);      
    }

    [Test]
    public void Test_SumPairs_InputHasLargeEvenCountElements_ShouldReturnSumPairs()
    {
        // Arrange
        List<int> evenCountList = new() { 1, 2, 3, 4, 5, 1, 2, 3, 4, 5 };
        List<int> expectedList = new List<int>() { 6,6,6,6,6 };

        // Act
        List<int> result = GaussTrick.SumPairs(evenCountList);

        // Assert
        CollectionAssert.AreEqual(expectedList, result);
    }

    [Test]
    public void Test_SumPairs_InputHasLargeOddCountElements_ShouldReturnWithMiddleElement()
    {
        // Arrange
        List<int> evenCountList = new() { 1, 2, 3, 4, 5, 6, 1, 2, 3, 4, 5 };
        List<int> expectedList = new List<int>() { 6, 6, 6, 6, 6, 6 };

        // Act
        List<int> result = GaussTrick.SumPairs(evenCountList);

        // Assert
        CollectionAssert.AreEqual(expectedList, result);
    }
}
