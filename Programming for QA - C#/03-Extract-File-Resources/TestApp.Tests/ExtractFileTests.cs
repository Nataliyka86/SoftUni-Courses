using NUnit.Framework;
using System;

namespace TestApp.Tests;

public class ExtractFileTests
{
    [Test]
    public void Test_GetFile_NullPath_ThrowsArgumentNullException()
    {
        string input = null;        
        Assert.Throws<ArgumentNullException>(() => { ExtractFile.GetFile(input); });
    }

    [Test]
    public void Test_GetFile_EmptyPath_ThrowsArgumentNullException()
    {
        string input = "";
        Assert.Throws<ArgumentNullException>(() => { ExtractFile.GetFile(input); });
    }

    [Test]
    public void Test_GetFile_ValidPath_ReturnsFileNameAndExtension()
    {
        string input = "C:\\Users\\choch0\\Desktop\\SoftUni\\C# Programming Fundamentals for QA\\Exams\\Еxam-Preparation-1.docx";
        string output = ExtractFile.GetFile(input);
        Assert.AreEqual("File name: Еxam-Preparation-1\nFile extension: docx", output);
    }

    [Test]
    public void Test_GetFile_PathWithNoExtension_ReturnsFileNameOnly()
    {

        string input = "C:\\Users\\choch0\\Downloads\\Exam-Preparation-3-Resources\\Еxam-Preparation-1";
        string output = ExtractFile.GetFile(input);
        Assert.AreEqual("File name: Еxam-Preparation-1", output);
    }

    [Test]
    public void Test_GetFile_PathWithSpecialCharacters_ReturnsFileNameAndExtension()
    {
        string input = "C:\\Users\\choch0\\Desktop\\SoftUni\\C# Programming Fundamentals for QA\\Exams\\Еxam-*!Preparation-1.docx";
        string output = ExtractFile.GetFile(input);
        Assert.AreEqual("File name: Еxam-*!Preparation-1\nFile extension: docx", output);
    }
}
