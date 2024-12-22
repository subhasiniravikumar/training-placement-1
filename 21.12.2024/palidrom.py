def is_palindrome(s):
    left = 0
    right = len(s) - 1
    while left < right:
        if s[left] != s[right]:
            return False
        left += 1
        right -= 1
    return True

str1 = "madam"
str2 = "hello"
print(str1, "is palindrome:", is_palindrome(str1))
print(str2, "is palindrome:", is_palindrome(str2))
