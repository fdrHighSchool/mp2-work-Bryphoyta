# Letter Grade
#### Respond to the following:

1. Write a plan for the following extension:
  * Attach a "+" on their grade if the grade ends in a 7, 8 or 9 (eg: 78 -> C+, 89 -> B+)
  * Attach a "-" on their grade if the grade ends in a 0, 1 or 2 (eg: 92 -> A-, 61 -> D-)

    I would turn the numbers into a string and take out the 2nd index as a substring. Then I would use .equals to check if it were 7, 8, 9 or 0, 1, 2.    
    Depending on the number it would add + or -


2. Discuss how you would make sure 100 is not misrepresented as an A-.
  Turn the number into a string. Then check if the length is equals to 2. If it is it prints A+.


3. Discuss how you would make sure grades that are an F are not mislabeled as F- or F+ (eg: 49 -> F+ and 52 -> F-)
   Turn the number into string. Check if the first index (4 in 49 or 5 in 55) is 4 or 5. If it is always print "F'.    
