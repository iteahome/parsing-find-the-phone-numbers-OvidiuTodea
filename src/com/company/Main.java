package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
	/*
        Considering the below text please find using only one regex all phone numbers in this format:

        07xx-xxxxxx
        (07xx)-xxxxx
        07xx xxx xxx
        07xx xxx-xxx
        07xx-xxx-xxx
         */

        String theRegex = "\\(?[07][07]\\d{2}\\)?[-\\s]?\\d{3}[-\\s]?\\d{3}";
        /*
        EXPLANATION: (for me later :)) !!!! )
\(? matches the character ( literally (case sensitive)
? Quantifier — Matches between zero and one times, as many times as possible, giving back as needed (greedy)
Match a single character present in the list below [07]
07 matches a single character in the list 07 (case sensitive)
Match a single character present in the list below [07]
07 matches a single character in the list 07 (case sensitive)
\d{2} matches a digit (equal to [0-9])
{2} Quantifier — Matches exactly 2 times
\)? matches the character ) literally (case sensitive)
? Quantifier — Matches between zero and one times, as many times as possible, giving back as needed (greedy)
Match a single character present in the list below [-\s]?
? Quantifier — Matches between zero and one times, as many times as possible, giving back as needed (greedy)
- matches the character - literally (case sensitive)
\s matches any whitespace character (equal to [\r\n\t\f\v ])
\d{3} matches a digit (equal to [0-9])
{3} Quantifier — Matches exactly 3 times
Match a single character present in the list below [-\s]?
? Quantifier — Matches between zero and one times, as many times as possible, giving back as needed (greedy)
- matches the character - literally (case sensitive)
\s matches any whitespace character (equal to [\r\n\t\f\v ])
\d{3} matches a digit (equal to [0-9])
{3} Quantifier — Matches exactly 3 times
         */
        Pattern checkRegex = Pattern.compile(theRegex);

        String stringToCheck = "0832 973213 ada 074o-123 312 0721 912 123 123 321 212 0732-222111(7480)-732213 0932-213-231(0732)-1321220749 223-102a0792-010-110";
        Matcher regexMatcher = checkRegex.matcher(stringToCheck);

        System.out.println("Matches are :");
        while (regexMatcher.find()){
            System.out.println(regexMatcher.group());
        }
    }
}
