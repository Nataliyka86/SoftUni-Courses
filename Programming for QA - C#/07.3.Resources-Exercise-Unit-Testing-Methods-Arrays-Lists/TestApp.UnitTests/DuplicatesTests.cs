using NUnit.Framework;

using System;

namespace TestApp.UnitTests;

public class DuplicatesTests
{
   
    [Test]
    public void Test_RemoveDuplicates_EmptyArray_ReturnsEmptyArray()
    {
        // Arrange
        int[] numbers = Array.Empty<int>();

        // Act
        int[] outputArray = Duplicates.RemoveDuplicates(numbers);
        int[] expected = Array.Empty<int>();

        // Assert
        CollectionAssert.AreEqual(expected, outputArray);
    }
        
    [Test]
    public void Test_RemoveDuplicates_NoDuplicates_ReturnsOriginalArray()
    {
        // Arrange
        int[] inputArray = new int[] { 1 , 2, 3, 4};

        // Act
        int[] outputArray = Duplicates.RemoveDuplicates(inputArray);
        

        // Assert
        CollectionAssert.AreEqual (inputArray, outputArray);
    }

    [Test]
    public void Test_RemoveDuplicates_SomeDuplicates_ReturnsUniqueArray()
    {
        // Arrange
        int[] inputArray = new int[] { 1, 2, 2, 4 };

        // Act
        int[] outputArray = Duplicates.RemoveDuplicates(inputArray);

        int[] resultArray = new int[] { 1, 2, 4 };
        // Assert
        CollectionAssert.AreEqual(resultArray, outputArray);
    }

    [Test]
    public void Test_RemoveDuplicates_AllDuplicates_ReturnsSingleElementArray()
    {

        // Arrange
        int[] inputArray = new int[] { 1, 1, 1,1};

        // Act
        int[] outputArray = Duplicates.RemoveDuplicates(inputArray);

        int[] resultArray = new int[] { 1 };
        // Assert
        CollectionAssert.AreEqual(resultArray, outputArray);
    }
}
