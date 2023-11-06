using NUnit.Framework;

namespace TestApp.UnitTests;

public class EmailTests
{
    
    [Test]
    public void Test_IsValidEmail_ValidEmail()
    {
        // Arrange
        string validEmail = "test@example.com";

        // Act
        bool result = Email.IsValidEmail(validEmail);

        // Assert
        Assert.IsTrue(result);
    }

    [Test]
    public void Test_IsValidEmail_InvalidEmail()
    {
        string invalidEmail = "testexample.com";
        bool result = Email.IsValidEmail(invalidEmail);
        Assert.IsFalse(result);
    }

    [Test]
    public void Test_IsValidEmail_NullInput()
    {
        string invalidEmail = null;
        bool result = Email.IsValidEmail(invalidEmail);
        Assert.IsFalse(result);
    }


    [Test]
    public void Test_IsValidEmail_WhiteSpacesInput()
    {
        string invalidEmail = "     ";
        bool result = Email.IsValidEmail(invalidEmail);
        Assert.IsFalse(result);
    }
}
