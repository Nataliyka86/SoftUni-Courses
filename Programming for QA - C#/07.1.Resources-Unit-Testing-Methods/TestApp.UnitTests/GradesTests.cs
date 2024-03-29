﻿using NUnit.Framework;

namespace TestApp.UnitTests;

public class GradesTests
{
    [TestCase(2.0, "Fail")]
    [TestCase(2.5, "Fail")]
    [TestCase(3.0, "Average")]
    [TestCase(3.7, "Good")]
    [TestCase(3.50, "Good")]
    [TestCase(4.0, "Very Good")]
    [TestCase(4.50, "Excellent")]
    public void Test_GradeAsWords_ReturnsCorrectString(double grade, string expected)
    {
        // Arrange

        // Act
        string actual = Grades.GradeAsWords(grade);

        // Assert
        Assert.AreEqual(expected, actual);
    }

    [TestCase( -2.0, "Invalid!")]
    [TestCase(0, "Invalid!")]
    [TestCase(33, "Invalid!")]
    [TestCase(double.PositiveInfinity, "Invalid!")]
    public void Test_GradeAsWords_ReturnsCorrectString_EdgeCases(double grade, string expected)
    {
        // Arrange

        // Act
        string actual = Grades.GradeAsWords(grade);

        // Assert
        Assert.AreEqual(expected, actual);
    }
}
