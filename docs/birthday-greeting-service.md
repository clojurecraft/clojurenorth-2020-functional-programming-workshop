# Birthday Greeting Service

Your task is to write a program that

  1. loads a list of employees from a CSV file
  2. sends an email to everyone who's birthday is today

The CSV will look like:
```
name,email,date_of_birth
Alice,miss.alice@example.com,1865/11/26
Bob,builder.bob@example.com,1998/11/28
Cathy,catherine.the.great@example.com,1729/04/29
Donald,thedonald@example.com,1946/06/14
```
(A sample is available at [resources/birthday/employees.csv](../resources/birthday/employees.csv))

The email should look like:
```
Subject: Happy Birthday!
Body:
Happy Birthday Alice! Wow, you're 43 already!
```

Pretty simple, right? To make it even simpler... we’ve already got it working. Take a gander at [src/katas/birthday/core.clj](../src/katas/birthday/core.clj).

For a toy example like this, most pragmatic Clojure devs would say “it’s fine as is” -- and we agree!

...but, for the sake of exercise, let’s imagine that the functions involved are more complicated, and are part of a much larger system, with a bunch of developers involved on the project.

How would we test that the birthday-greeting component is working properly?

Reading from a file, sending emails, relying on the current date… all make it tricky to test.

Can refactoring to make the code more functionally pure help?

## Tasks

1. Take a moment to go through the existing code and identify:
   - places where state is defined
   - places where state is referenced
   - places where state is mutated
   - places where other side-effects are triggered
   - which functions are pure and which aren’t

  It might be useful to copy the code to, say, Google Docs and highlight the above categories using different colours.

2. Your main task is to
   - refactor the existing code to make it testable, and,
   - prove that it’s testable by writing some tests

  Try to write code as you would expect from your coworkers on a non-trivial production project.

  The starter code is at [src/katas/birthday/core.clj](../src/katas/birthday/core.clj)
  The non-existent test code is at [test/katas/test/birthday.clj](../test/katas/test/birthday.clj)

3. When you’re done, as we did at the start, take a moment to go through your solution and identify:
  - places where state is defined
  - places where state is referenced
  - places where state is mutated
  - places where other side-effects are triggered
  - which functions are pure and which aren’t

4. If you’d like to have us discuss your solution and compare it to others, please push your code and add a link to your repo to [this spreadsheet](https://docs.google.com/spreadsheets/d/1JwO53TlIj367CTodutJNvESWis0tIk4RJH8AiZoPsqs/edit?usp=sharing).

## Bonus Tasks

If you have the time and inclination, you can extend your solution with the following:

1. In the email message, include "PS. Did you know that you share birthdays with [Name] and [Name]?" (with tests!)

2. In the current version, people born on February 29th miss don't get an emails on non-leap-years! They should be included in the February 28th emails (but only if the current year is not a leap-year). (With tests!)

<br>
<br>
<br>
<hr>
<sup>This kata is based on [Matteo Vaccari's Birthday Greetings Kata](http://matteo.vaccari.name/blog/archives/154)</sup>
